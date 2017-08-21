package ch.cellularTour.model.requestM;

import com.google.common.base.Strings;
import com.google.gson.annotations.Expose;

/**
 * Created by 今夜犬吠 on 2017/7/25.
 * <p>
 * 客户端登录注册-请求模型
 */
public class MLoginRequestM {
    /**
     * 用户名
     */
    @Expose
    private String name;

    /**
     * 密码
     */
    @Expose
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 校验是否为空
     */
    public static boolean check(MLoginRequestM model) {
        return model != null
                && !Strings.isNullOrEmpty(model.name)
                && !Strings.isNullOrEmpty(model.password);

    }
}
