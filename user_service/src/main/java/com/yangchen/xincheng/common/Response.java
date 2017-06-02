package com.yangchen.xincheng.common;

/**
 * Created by yangchen on 2017/6/2.
 */
public class Response<T> {
    private boolean is_succeed = true;
    private String msg = "OKOKOK";
    private T entity;

    public boolean isIs_succeed() {
        return is_succeed;
    }

    public void setIs_succeed(boolean is_succeed) {
        this.is_succeed = is_succeed;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
