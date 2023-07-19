package com.java4rohit.fullbackend.Exception;


import com.java4rohit.fullbackend.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UserNotFoundAdvice {


    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String>  exceptionHandler(UserNotFoundException exception){
        Map<String,String> errMap = new HashMap<>();
        errMap.put("Error_Message",exception.getMessage());
        return errMap;
    }
}
