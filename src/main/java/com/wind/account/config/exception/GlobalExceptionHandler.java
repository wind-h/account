package com.wind.account.config.exception;


import com.wind.account.config.response.BaseResult;
import com.wind.account.config.response.ResponseResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author hsc
 * @date 2022/4/26 17:20
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("参数校验异常: {}", e.getMessage(), e);
        BindingResult result = e.getBindingResult();
        List<ObjectError> allErrors = result.getAllErrors();
        allErrors.get(0).getDefaultMessage();
        String message = allErrors.get(0).getDefaultMessage();
        return ResponseResultUtil.fail(message);
    }

    /**
     * 405 - Method Not Allowed
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public BaseResult handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        log.error("不支持当前请求方法: {}", e.getMethod(), e);
        return ResponseResultUtil.fail(HttpStatus.METHOD_NOT_ALLOWED.value(), "不支持当前请求方法: " + e.getMethod());
    }

    /**
     * 415 - Unsupported Media Type
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public BaseResult handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        log.error("不支持当前媒体类型: {}", e.getContentType(), e);
        return ResponseResultUtil.fail(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(),"不支持当前媒体类型: " + e.getContentType());
    }

    /**
     * runException
     */
    @ExceptionHandler(RuntimeException.class)
    public BaseResult handleRuntimeException(Exception e) {
        log.error("接口异常: {}", e.getMessage(), e);
        return ResponseResultUtil.fail(e.getMessage());

    }

    /**
     * exception
     */
    @ExceptionHandler(Exception.class)
    public BaseResult handleException(Exception e) {
        log.error("接口异常: {}", e.getMessage(), e);
        return ResponseResultUtil.fail();
    }

}
