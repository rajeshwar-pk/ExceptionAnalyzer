package com.rajeshwar.ai.analyzer.vo;

public class FileRequest {
	
	private String name;
	
	private String exception;

	public FileRequest(String name) {
		super();
		this.name = name;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getName() {
		return name;
	}
	
	

}
