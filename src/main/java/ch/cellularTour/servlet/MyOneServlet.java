package ch.cellularTour.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 今夜犬吠 on 2017/7/14.
 *
 * 客户端Http与服务器数据库，应用程序的中间层
 */
public class MyOneServlet extends HttpServlet{

    private  String mMessage="第一次玩Web";

    @Override
    public void init() throws ServletException {
        mMessage="!<br/>";
        System.out.print("init："+"kkk");
    }

    /**
     * 处理Get请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**返回到Client的内容类型及编码类型*/resp.setContentType("text/html;charset=UTF-8");
        /**获取*/PrintWriter mPrintWriter=resp.getWriter();
        String mName=req.getParameter("name");
        if(mName==null){
            mPrintWriter.println("请求失败！");
            return;
        }
        if(mName.equals("刘小昀")){
            mPrintWriter.println("登录成功！");
        }else{
            mPrintWriter.println("登录失败！");
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    /**
     * 处理Post请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
