package ch.cellularTour.model;

import com.google.gson.annotations.Expose;

/**
 * Created by 今夜犬吠 on 2017/7/21.
 * <p>
 * 账号信息
 */
public class MAccountInfo {

    /*当前登录的账号*/
    @Expose
    private String mCurrentAccount;

    /*身份令牌-第一次登录获取服务器返回的Token*/
    @Expose
    private String mToken;

    /*用户ID*/
    @Expose
    private String userId;

    /*用户名*/
    @Expose
    private String userName;

    /*用户手机号*/
    @Expose
    private String userPhone;

    @Expose
    private String passWord;


    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getmCurrentAccount() {
        return mCurrentAccount;
    }

    public void setmCurrentAccount(String mCurrentAccount) {
        this.mCurrentAccount = mCurrentAccount;
    }

    public String getmToken() {
        return mToken;
    }

    public void setmToken(String mToken) {
        this.mToken = mToken;
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

    public String getUserPhone(String s) {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
