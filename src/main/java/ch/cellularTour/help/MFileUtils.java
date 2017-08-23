package ch.cellularTour.help;

import java.io.*;

/**
 * Created by 今夜犬吠 on 2017/8/23.
 * 文件操作工具-用于把客户端传递的文件写入本地
 */
public class MFileUtils {
    private static MFileUtils mFileUtils;


    private MFileUtils(){}


    /**
     * 单例模式
     * @return
     */
    public static MFileUtils getInstance(){
        if(mFileUtils==null){
            synchronized (MFileUtils.class){
                if(mFileUtils==null){
                    mFileUtils=new MFileUtils();
                }else{
                    return mFileUtils;
                }
            }
        }

        return mFileUtils;
    }


    /**
     * 把文件写入本地文件夹
     * uploadedInputStream:输入流,来自客户端的数据流
     * @return
     */
    public boolean toolSaveFile(InputStream uploadedInputStream, File file){
        System.out.println("------saveFile-----");
        /**申明一个输出流*/OutputStream outpuStream = null;
        try {
            /**初始化为文件输出流*/outpuStream = new FileOutputStream(file);

            int read = 0;

           /**申明字节空间-用于保存每次写入的字节*/ byte[] bytes = new byte[1024];

           /**开始写入*/
            while ((read = uploadedInputStream.read(bytes)) != -1) {
                outpuStream.write(bytes, 0, read);
            }
            outpuStream.flush();
            outpuStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            /*e.printStackTrace();*/
            return false;
        }
        return true;
    }
}
