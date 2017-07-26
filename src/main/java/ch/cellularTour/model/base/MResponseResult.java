package ch.cellularTour.model.base;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by 今夜犬吠 on 2017/7/21.
 * Http请求响应结果基本模型
 * <p>
 * 和前端一致
 */
public class MResponseResult<T> implements Serializable {

    /**
     * 1001:请求成功 1002:请求成功无数据 1003:请求参数错误 1004:Token过期，身份验证失败，需重新登录
     * 2001:账号密码不存在(登录失败) 2002:账号密码异常
     * 3001:注册异常 3002:账户名已存在
     * 4001:服务器异常 4002:未知错误
     *
     * @Expose：序列化该属性(GSON内置，非@Expose GSON不转换)
     */
    /*请求结果状态码*/
    @Expose
    private int resultCode;

    /*最新时间戳*/
    @Expose
    private long newTimestamp=System.currentTimeMillis();

    /*请求结果说明*/
    @Expose
    private String mMessage;

    /*数据源*/
    @Expose
    private T dataSource;

    public MResponseResult() {
        resultCode = 1;
        mMessage = "请求成功";
    }

    public MResponseResult(T result) {
        this();
        this.dataSource = result;
    }

    public MResponseResult(int code, String message) {
        this.resultCode = code;
        this.mMessage = message;
    }

    public MResponseResult(int code, String message, T result) {
        this.resultCode = code;
        this.mMessage = message;
        this.dataSource = result;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public long getNewTimestamp() {
        return newTimestamp;
    }

    public void setNewTimestamp(long newTimestamp) {
        this.newTimestamp = newTimestamp;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public T getDataSource() {
        return dataSource;
    }

    public void setDataSource(T dataSource) {
        this.dataSource = dataSource;
    }
}
