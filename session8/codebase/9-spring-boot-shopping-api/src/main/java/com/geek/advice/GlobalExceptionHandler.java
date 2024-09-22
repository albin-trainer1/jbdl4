package com.geek.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.geek.exceptions.ApplicationException;
import com.geek.response.dto.ApiError;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler({ApplicationException.class})
	public  ResponseEntity< ApiError> handleException(ApplicationException e) {
	   ApiError apiError=new ApiError();
	   apiError.setErrorMsg(e.getMessage());
	   apiError.setStatus("404");
		return new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
	}
   
   //other methods also ...
   @ExceptionHandler({Exception.class})
   public  ResponseEntity< String> handleException2(Exception e) {
	
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
