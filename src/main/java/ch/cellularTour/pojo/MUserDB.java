package ch.cellularTour.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by 今夜犬吠 on 2017/7/25.
 * <p>
 * 用户模型 对应数据库的表
 */
@Entity
@Table(name = "users")
public class MUserDB {

    /**
     * 用户ID 主键 默认自增不能为空
     */
    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)//不允许更新,不允许为空
    private int id;

    /**
     * 用户名 必须唯一
     */
    @Column(nullable = false, length = 128, unique = true)
    private String name;

    /**
     * 密码 不能为空
     */
    @Column(nullable = false)
    private String password;

    /**
     * 手机号 唯一
     */
    @Column(unique = true)
    private String phone;

    /**
     * 头像
     */
    @Column
    private String avatar;

    /**
     * 创建时间戳
     * <p>
     * 创建时就写入数据库
     */
    @CreationTimestamp
    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime = LocalDateTime.now();

    /**
     * 身份令牌 必须唯一
     */
    @Column(unique = true)
    private String token;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
