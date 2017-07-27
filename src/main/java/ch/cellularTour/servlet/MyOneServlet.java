package ch.cellularTour.servlet;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 今夜犬吠 on 2017/7/14.
 * <p>
 * 客户端Http与服务器数据库，应用程序的中间层
 */
public class MyOneServlet extends HttpServlet {

    /**
     * 创建时调用
     */
    @Override
    public void init() throws ServletException {
    }

    /**
     * 处理Get请求
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        /**返回到Client的内容类型及编码类型*/resp.setContentType("text/html;charset=UTF-8");
//        /**获取*/PrintWriter mPrintWriter = resp.getWriter();
//        /**获取用户名-中文需处理编码*/String mName = new String(req.getParameter("name").getBytes("UTF-8"), "UTF-8");
//        /**获取密码*/String mpassW = req.getParameter("passWord");
//
//
//        if (mName == null || mpassW == null) {
//            mPrintWriter.println("请求失败！");
//            return;
//        }
//        if (mName.equals("刘小昀") && mpassW.equals("123")) {
//            MLoginInfo mLoginInfo = new MLoginInfo();
//
//            mLoginInfo.setMag("登录成功");
//
//            mLoginInfo.setResult(1);
//
//            mLoginInfo.setUserId("01");
//
//            mLoginInfo.setUserName(mName);
//
//            mPrintWriter.println(JSON.toJSONString(mLoginInfo) + "");
//        } else {
//            MLoginInfo mLoginInfo = new MLoginInfo();
//
//            mLoginInfo.setMag("登录失败");
//
//            mLoginInfo.setResult(0);
//
//            mLoginInfo.setUserId("01");
//
//            mLoginInfo.setUserName(mName);
//
//            mPrintWriter.println(JSON.toJSONString(mLoginInfo));
//        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 处理Post请求
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
