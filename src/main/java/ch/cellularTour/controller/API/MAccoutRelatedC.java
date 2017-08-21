package ch.cellularTour.controller.API;

import ch.cellularTour.dao.impl.MAccountDaoImpl;
import ch.cellularTour.model.MAccountInfo;
import ch.cellularTour.model.base.MResponseResult;
import ch.cellularTour.model.requestM.MLoginRequestM;
import ch.cellularTour.pojo.MUserDB;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by 今夜犬吠 on 2017/7/27.
 * 用户相关-登录、注册-接收器
 */
@Path("/Account")
public class MAccoutRelatedC {

    /**
     * 登录
     */
    @POST
    @Path("/Login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MResponseResult<MAccountInfo> login(MLoginRequestM mLoginRequestM) {

        /*校验请求参数*/
        if (!MLoginRequestM.check(mLoginRequestM)) {
            return new MResponseResult<>(1003, "请求参数异常");
        }
        /*初始化数据操作对象-用户相关*/
        MAccountDaoImpl mAccountDao = new MAccountDaoImpl();

        /*登录-查询数据库*/
        MUserDB mUserDB = mAccountDao.login(mLoginRequestM.getName(), mLoginRequestM.getPassword());

        if (mUserDB != null) {

            MAccountInfo mAccountInfo = new MAccountInfo();
            mAccountInfo.setUserName(mUserDB.getName());
            mAccountInfo.setPassWord(mUserDB.getPassword());
            mAccountInfo.getUserPhone(mUserDB.getPhone() + "");
            mAccountInfo.setmToken(mUserDB.getToken());

            return new MResponseResult<MAccountInfo>(1001, "请求成功", mAccountInfo);
        } else {

            return new MResponseResult<MAccountInfo>(1002, "登陆失败");
        }

    }

    /**
     * 注册
     *
     * @return
     */
    @POST
    @Path("/Register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MResponseResult<MAccountInfo> register(MLoginRequestM mLoginRequestM) {
        /*校验请求参数*/
        if (!MLoginRequestM.check(mLoginRequestM)) {
            return new MResponseResult<>(1003, "请求参数异常");
        }
        /*初始化数据操作对象-用户相关*/
        MAccountDaoImpl mAccountDao = new MAccountDaoImpl();

        /*注册-写入*/
        MUserDB mRegisterUserDB = mAccountDao.registered(mLoginRequestM.getName(), mLoginRequestM.getPassword());

        /*查询数据库-看是否注册成功*/
        MUserDB mSelectUserDB = mAccountDao.login(mRegisterUserDB.getName(), mRegisterUserDB.getPassword());

        if (mSelectUserDB != null) {

            MAccountInfo mAccountInfo = new MAccountInfo();
            mAccountInfo.setUserName(mSelectUserDB.getName());
            mAccountInfo.setPassWord(mSelectUserDB.getPassword());
            mAccountInfo.getUserPhone(mSelectUserDB.getPhone() + "");
            mAccountInfo.setmToken(mSelectUserDB.getToken());

            return new MResponseResult<MAccountInfo>(1001, "注册成功", mAccountInfo);
        } else {

            return new MResponseResult<MAccountInfo>(1002, "注册失败");
        }
    }

//    @DELETE
//    @Path("/PingLog")
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    public MLoginInfo getDeleteLog(@FormParam("name") String name, @FormParam("passWord") String passWord) {
//        MLoginInfo mLoginInfo = new MLoginInfo();
//
//        mLoginInfo.setMag("登录成功");
//
//        mLoginInfo.setResult(1);
//
//        mLoginInfo.setUserId("01");
//
//        mLoginInfo.setUserName(name);
//
//        return mLoginInfo;
//    }
}
