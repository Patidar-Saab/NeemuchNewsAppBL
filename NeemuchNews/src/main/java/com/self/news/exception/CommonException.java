package com.self.news.exception;

import com.self.news.statusCodes.StatusCodes;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = -857968536935667808L;

	private String statusCode;

	public String getStatusCode() {
		return statusCode;
	}

	public CommonException() {
		super();
	}

	public CommonException(String msg) {
		super(msg);
		this.statusCode = StatusCodes.COMMON_ERROR;
	}

	public CommonException(String msg, String statusCode) {
		super(msg);
		this.statusCode = (statusCode);
	}
}
