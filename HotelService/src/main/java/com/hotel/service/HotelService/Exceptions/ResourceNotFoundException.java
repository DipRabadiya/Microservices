package com.hotel.service.HotelService.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
    //extra properties that you want to manage
    public ResourceNotFoundException(){
        super("Resource not found on server !!");
    }

    public  ResourceNotFoundException(String message){
        super(message);
    }
}