package com.demo.parking_access.jjwApi;

import lombok.Data;

@Data
public class  ResultViewModel<T>{

    private Integer code;
    private String message;
    private T data;

}
