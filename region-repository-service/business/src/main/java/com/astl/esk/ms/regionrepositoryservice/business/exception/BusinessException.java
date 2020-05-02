package com.astl.esk.ms.regionrepositoryservice.business.exception;

public class BusinessException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2476799884304358940L;

	private String errorCode;
	
	public BusinessException(final String errorCode, final String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
