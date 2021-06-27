package com.trade.wf.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trade.wf.model.ApiResponse;
import com.trade.wf.model.Banker;

@RestController
@RequestMapping("/v1")
public class BankerController {

	@PostMapping("/banker")
	public ApiResponse saveBanker(@RequestBody Banker banker) {
		return ApiResponse.builder().status("000").build();
	}
}
