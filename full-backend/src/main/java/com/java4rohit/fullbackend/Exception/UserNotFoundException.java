package com.java4rohit.fullbackend.Exception;

public class UserNotFoundException extends  RuntimeException{

    public UserNotFoundException(Long aadhaarCardNo){
        super("User not Found with aadhaar Card no : "+aadhaarCardNo);
    }
}
