package ch.cellularTour.dao;

import ch.cellularTour.pojo.MUserDB;

/**
 * Created by 今夜犬吠 on 2017/7/17.
 *
 * 用户信息-联系数据库
 */

public interface MAccountDao {

    /**
     * 登录
     */
   public MUserDB login(String name,String passWord);

    /**
     * 注册
     */
    MUserDB registered(String name,String passWord);

}
