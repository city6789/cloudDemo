package cn.ztzh.cloud.test.testCloudDemo.util;


public class AsyncException extends Exception {
	private int code;
	 private String errorMessage;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	 
}
