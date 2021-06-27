package com.trade.wf.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.trade.wf.model.ApiResponse;
import com.trade.wf.util.TradeWfUtil;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException invalidArgError,HttpHeaders httpHeaders,HttpStatus httpStatus,WebRequest request){

		Map<String, String> errors = new HashMap<>();
		
		invalidArgError.getBindingResult().getAllErrors().forEach(error -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		
		ApiResponse response = TradeWfUtil.buildApiResponse("4001", "FAIL", errors.toString());
		
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
}
