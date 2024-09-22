package com.geek.response.dto;

public class ApiError {
private String errorMsg;
private String status;
public String getErrorMsg() {
	return errorMsg;
}
public void setErrorMsg(String errorMsg) {
	this.errorMsg = errorMsg;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
