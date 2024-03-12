package com.blog.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiResponse;

@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotfoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotfoundException ex)
	{
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
}
