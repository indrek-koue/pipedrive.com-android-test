
package com.example.pipedrivetest.model;

import java.util.List;

public class ResponseBodyDetails{
   	private Additional_data additional_data;
   	private Data data;
   	private boolean success;

 	public Additional_data getAdditional_data(){
		return this.additional_data;
	}
	public void setAdditional_data(Additional_data additional_data){
		this.additional_data = additional_data;
	}
 	public Data getData(){
		return this.data;
	}
	public void setData(Data data){
		this.data = data;
	}
 	public boolean getSuccess(){
		return this.success;
	}
	public void setSuccess(boolean success){
		this.success = success;
	}
}
