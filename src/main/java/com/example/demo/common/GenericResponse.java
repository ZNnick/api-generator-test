package com.example.demo.common;

/**
 * @Author: ZN_nick
 * @Date: 2021/5/6 11:03
 * @Description: 通用数据返回模板
 **/
public class GenericResponse<X> {
    private int code;
    private X data;
    private String info;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public X getData() {
        return data;
    }

    public void setData(X data) {
        this.data = data;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public GenericResponse() {
    }

    public GenericResponse(int code, String info, X data) {
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public static GenericResponse response(ServiceMsg serviceMsg) {

        return GenericResponse.response(serviceMsg, null);
    }

    public static GenericResponse response(ServiceMsg msg, Object data) {
        if (msg == null) {
            msg = ServiceMsg.UN_KNOW_ERROR;
        }
        return GenericResponse.response(msg.getCode(), msg.getInfo(), data);
    }

    public static GenericResponse response(int code, String info, Object data) {

        return new GenericResponse(code, info, data);
    }
}
