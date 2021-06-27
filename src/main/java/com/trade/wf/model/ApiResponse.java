package com.trade.wf.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor // It adds default constructor
@AllArgsConstructor
public class ApiResponse {
	private String code;
	private String status;
	private String message;
}
