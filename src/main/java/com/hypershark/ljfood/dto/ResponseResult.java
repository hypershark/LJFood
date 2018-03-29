package com.hypershark.ljfood.dto;

import com.hypershark.ljfood.enums.StateEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Li on 2018/3/28.
 */
@Data
public class ResponseResult implements Serializable{
    private Integer status;

    private Object data;

    private String error;

    private long pageSize;

    private Integer total;

    /**
     * 请求成功
     * @param status
     */
    public ResponseResult(Integer status){
        this.status = status;
    }

    /**
     * 请求成功并返回数据
     * @param status
     * @param data
     */
    public ResponseResult(Integer status,Object data){
        this.status = status;
        this.data = data;
    }

    /**
     *  请求成功 且返回条数
     * @param status
     * @param data
     * @param total
     */
    public ResponseResult(Integer status, Object data, long pageSize, Integer total) {
        this.status = status;
        this.data = data;
        this.total = total;
        this.pageSize = pageSize;
    }

    /**
     * 请求失败
     * @param status
     * @param error
     */
    public ResponseResult(Integer status, String error) {
        this.status = status;
        this.error = error;
    }

    public static ResponseResult ok(){
        return new ResponseResult(StateEnum.SUCCESS.getState());
    }

    public static ResponseResult ok(Object data){
        return new ResponseResult(StateEnum.SUCCESS.getState(),data);
    }

    public static ResponseResult warn(String warn) {
        return new ResponseResult(StateEnum.WARN.getState(), warn);
    }

    public static ResponseResult ok(Object data,long pageSize, Integer total) {
        return new ResponseResult(StateEnum.SUCCESS.getState(),data, pageSize,total);
    }

    public static ResponseResult error(String error) {
        return new ResponseResult(StateEnum.ERROR.getState(), error);
    }


}
