package com.example.pipedrivetest.model;

import java.util.List;

public class BaseResponse {

	private Additional_data additional_data;
	private boolean success;
	private String error;

	public Additional_data getAdditional_data() {
		return this.additional_data;
	}

	public void setAdditional_data(Additional_data additional_data) {
		this.additional_data = additional_data;
	}

	public boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}