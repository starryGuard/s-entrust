package com.entrust.common;

import lombok.Data;

import java.io.Serializable;

/**
 * HTTP请求返回结果
 * Created by lixiaohan on 2018/4/17.
 */
@Data
public class HttpResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final String DEFAULT_SUCCESS_CODE = "1";
    private static final String DEFAULT_FAILURE_CODE = "0";
    private static final String DEFAULT_SUCCESS_BODY = "操作成功";
    private static final String DEFAULT_FAILURE_BODY = "操作失败";

    /**
     * 消息码
     */
    private String code;
    /**
     * 消息体
     */
    private String body;
    /**
     * 成功/失败消息
     */
    private boolean result;
    /**
     * 数据
     */
    private T data;

    public HttpResult() {}

    private HttpResult(boolean result, String code, String body, T data) {
        this.result = result;
        this.code = code;
        this.body = body;
        this.data = data;
    }

    /**
     * 创建成功消息
     */
    public static <T> HttpResult<T> success(String code, String body, T data) {
        return new HttpResult<T>(true, code, body, data);
    }

    public static <T> HttpResult<T> success() {
        return HttpResult.success(DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_BODY, null);
    }

    public static <T> HttpResult<T> success(String body) {
        return HttpResult.success(DEFAULT_SUCCESS_CODE, body, null);
    }

    public static <T> HttpResult<T> success(String code, String body) {
        return HttpResult.success(code, body, null);
    }

    public static <T> HttpResult<T> success(String body, T data) {
        return HttpResult.success(DEFAULT_SUCCESS_CODE, body, data);
    }

    public static <T> HttpResult<T> success(T data) {
        return HttpResult.success(DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_BODY, data);
    }

    /**
     * 创建失败消息
     */
    public static <T> HttpResult<T> failure(String code, String body, T data) {
        return new HttpResult<T>(false, code, body, data);
    }

    public static <T> HttpResult<T> failure() {
        return HttpResult.failure(DEFAULT_FAILURE_CODE, DEFAULT_FAILURE_BODY, null);
    }

    public static <T> HttpResult<T> failure(String body) {
        return HttpResult.failure(DEFAULT_FAILURE_CODE, body, null);
    }

    public static <T> HttpResult<T> failure(String code, String body) {
        return HttpResult.failure(code, body, null);
    }

    public static <T> HttpResult<T> failure(String body, T data) {
        return HttpResult.failure(DEFAULT_FAILURE_CODE, body, data);
    }

    public static <T> HttpResult<T> failure(T data) {
        return HttpResult.failure(DEFAULT_FAILURE_CODE, DEFAULT_FAILURE_BODY, data);
    }

    @Override
    public String toString() {
        return "HttpResult [result=" + result + ", code=" + code + ", body=" + body + ", data=" + data + "]";
    }
}
