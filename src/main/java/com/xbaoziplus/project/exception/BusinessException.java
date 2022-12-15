package com.xbaoziplus.project.exception;


import com.xbaoziplus.project.common.ErrorCode;

/**
 * @description 自定义异常类
 * @author xbaozi
 * @date 2022/12/14 15:03
 **/
public class BusinessException extends RuntimeException {

    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
