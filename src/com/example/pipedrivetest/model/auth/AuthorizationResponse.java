
package com.example.pipedrivetest.model.auth;

import java.util.List;

public class AuthorizationResponse{
   	private Additional_data additional_data;
   	private List<Data> data;
   	private boolean success;

 	public Additional_data getAdditional_data(){
		return this.additional_data;
	}
	public void setAdditional_data(Additional_data additional_data){
		this.additional_data = additional_data;
	}
 	public List<Data> getData(){
		return this.data;
	}
	public void setData(List<Data> data){
		this.data = data;
	}
 	public boolean getSuccess(){
		return this.success;
	}
	public void setSuccess(boolean success){
		this.success = success;
	}
}