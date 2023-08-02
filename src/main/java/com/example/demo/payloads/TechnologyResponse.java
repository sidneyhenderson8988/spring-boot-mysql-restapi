package com.example.demo.payloads;

public class TechnologyResponse {

	private String message;

    public TechnologyResponse(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
	
}
