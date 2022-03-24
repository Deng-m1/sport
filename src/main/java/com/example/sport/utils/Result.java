package com.example.sport.utils;

import lombok.Data;

@Data
public class Result {
    private Boolean flag;
    private String msg;
    private Object data;


    public Result(){}

    public Result(Boolean flag){
        this.flag = flag;
    }

    public Result(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }

    public Result(Boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public Result(String msg){
        this.flag = false;
        this.msg = msg;
    }

    public Result(boolean b, String message, Object data) {
        this.flag=b;
        this.msg=message;
        this.data=data;
    }

    public static Result success(String message,Object data)
    {
        return new Result(true,message,data);
    }
    public static Result fail(String message)
    {
        return new Result(false,message);
    }
}
