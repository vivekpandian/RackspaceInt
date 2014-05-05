package com.rackspace.interview.web.view;

public class ErrorResponse {

    private String errorMsg;
    private int errorCode;

    public ErrorResponse () {
    }

    public ErrorResponse (String errorMsg, int errorCode) {
    	this.errorMsg = errorMsg;
    	this.errorCode = errorCode;
    }
    
    public ErrorResponse (int errorCode, String errorMsg) {
    	this.errorMsg = errorMsg;
    	this.errorCode = errorCode;
    }    

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
    
    
}