package com.example.demo.common;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: ZN_nick
 * @Date: 2021/5/6 11:04
 * @Description: 返回信息
 **/
public enum ServiceMsg {
    //一般返回
    NORMAL(HttpServletResponse.SC_OK, "操作成功"),
    NOT_IMPLEMENTED(HttpServletResponse.SC_NOT_IMPLEMENTED,"该方法还未实现"),
    //未知错误
    UN_KNOW_ERROR(-1, "未知错误"),
    //用户名或密码错误
    ERROR_AUTH(HttpServletResponse.SC_BAD_REQUEST, "用户名或密码错误"),
    //错误的请求参数
    ERROR_PARAMETER(HttpServletResponse.SC_BAD_REQUEST,"错误的请求参数"),
    //业务异常
    ERROR_BIZ(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"业务异常"),
    //登录错误
    ERROR_LOGIN(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"登录错误"),
    //无权访问
    NO_AUTHORITY(HttpServletResponse.SC_FORBIDDEN, "无权访问"),
    //未认证或已过期
    UN_AUTH(HttpServletResponse.SC_UNAUTHORIZED, "用户未登录或认证已过期"),

    ;


    private int code;
    private String info;

    private ServiceMsg(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
