package com.trade.wf.util;

import org.springframework.stereotype.Component;

import com.trade.wf.model.ApiResponse;

@Component
public class TradeWfUtil {
	
	private TradeWfUtil() {}

	public static ApiResponse buildApiResponse(String code,String status,String message) {
		
		return ApiResponse.builder()
				.code(code)
				.status(status)
				.message(message)
				.build();
		
	}
	
}
