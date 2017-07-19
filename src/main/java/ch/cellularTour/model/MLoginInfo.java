package ch.cellularTour.model;

import java.io.Serializable;

/**
 * Created by 今夜犬吠 on 2017/7/18.
 * <p>
 * 登录-
 */
public class MLoginInfo implements Serializable {

    /*登录状态*/private int result;

    /*登录信息*/private String mag;

    /*用户ID*/private String userId;

    /*用户名*/private String userName;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
