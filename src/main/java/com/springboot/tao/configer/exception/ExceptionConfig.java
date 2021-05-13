package com.springboot.tao.configer.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @Author: carter
 * @Date: 2021/5/13
 */
@ControllerAdvice
public class ExceptionConfig {

    @ExceptionHandler(UploadException.class)
    @ResponseBody
    public HashMap exceptionHandle(Exception e){
        return null;
        //return ResponseUtil.responseFair(FAIL_UPLOAD,e.getMessage(), null);
    }
}
