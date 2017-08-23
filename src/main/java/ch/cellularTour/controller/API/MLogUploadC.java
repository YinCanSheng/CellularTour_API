package ch.cellularTour.controller.API;

import ch.cellularTour.help.MFileUtils;
import ch.cellularTour.model.MAccountInfo;
import ch.cellularTour.model.base.MResponseResult;
import ch.cellularTour.model.requestM.MLogUpRequestM;
import ch.cellularTour.model.requestM.MLoginRequestM;
import ch.cellularTour.utils.MConstStr;
import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Calendar;

/**
 * Created by 今夜犬吠 on 2017/7/20.
 * 接收上传的日志-接收器
 */

@Path("/Log")
public class MLogUploadC {

    /**
     * 接收统一的上传日志-还未测试-有待改正
     * InputStream :来自客户端的文件流
     * FormDataContentDisposition：封装了文件上传的一些信息、文件名等
     */
    @POST
    @Path("/unite")
    @Consumes(MediaType.MULTIPART_FORM_DATA + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public MResponseResult uniteUp(@FormDataParam("file") InputStream mFileInputStream
            , @FormDataParam("file") FormDataContentDisposition mDisposition) {

        /*校验请求参数*/
        if (mFileInputStream == null || mDisposition == null) {
            return new MResponseResult<>(1003, "请求参数异常");
        }

        /**定义一个文件名*/
        String mFileNmae = null;

        try {
            /**解码-避免中文乱码-测试无效*/
            mFileNmae = URLDecoder.decode(mDisposition.getFileName(), "utf-8");
            System.out.print(mFileNmae);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /**初始化一个接收的文件*/
        File mFile = new File(MConstStr.SAVE_FILE_PATH + mFileNmae);

        /**自定义接收*/
        //MFileUtils.getInstance().toolSaveFile(mFileInputStream, mFile);
        try {
            /**使用commons框架*/
            FileUtils.copyInputStreamToFile(mFileInputStream, mFile);
        } catch (IOException e) {
            e.printStackTrace();
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
    @Consumes(MediaType.MULTIPART_FORM_DATA + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
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
    @Consumes(MediaType.MULTIPART_FORM_DATA + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
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
