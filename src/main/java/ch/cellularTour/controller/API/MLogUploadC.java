package ch.cellularTour.controller.API;

import ch.cellularTour.model.MAccountInfo;
import ch.cellularTour.model.base.MResponseResult;
import ch.cellularTour.model.requestM.MLogUpRequestM;
import ch.cellularTour.model.requestM.MLoginRequestM;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by 今夜犬吠 on 2017/7/20.
 * 接收上传的日志-接收器
 */

@Path("/Log")
public class MLogUploadC {


    /**
     * 接收统一的上传日志-还未测试-有待改正
     */
    @POST
    @Path("/unite")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MResponseResult uniteUp(MLogUpRequestM mLogUpRequestM) {
            /*校验请求参数*/
        if (!MLogUpRequestM.check(mLogUpRequestM)) {
            return new MResponseResult<>(1003, "请求参数异常");
        }

        //编写把文件写入服务器本地库的代码

        for (int i = 0; i < mLogUpRequestM.getFileList().size(); i++) {
            System.out.print(mLogUpRequestM.getFileList().get(i).getName());
        }

        return new MResponseResult(1001, "上传成功");
    }

    /**
     * 接收上传的ping日志
     *
     * @param mLoginRequestM
     * @return
     */
    @POST
    @Path("/ping")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MResponseResult<MAccountInfo> login(MLoginRequestM mLoginRequestM) {

        return null;
    }

    /**
     * 接收上传的Http日志
     *
     * @return
     */
    @POST
    @Path("/http")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public MResponseResult<MAccountInfo> register() {

        return null;
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
