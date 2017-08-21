package ch.cellularTour.model.requestM;

import com.google.common.base.Strings;
import com.google.gson.annotations.Expose;

import java.io.File;
import java.util.List;

/**
 * Created by 今夜犬吠 on 2017/8/21.
 *  客户端log日志上传-请求模型
 */
public class MLogUpRequestM {

    /**
     * 上传的文件类型
     *  0:路测文件
     *  1:室内文件
     *  2:投诉文件
     */
    @Expose
    private int fileType;

    /**
     * 上传的文件集合
     */
    @Expose
    private List<File> fileList;

    public int getFileType() {
        return fileType;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    /**
     * 校验是否为空
     */
    public static boolean check(MLogUpRequestM model) {
        return model != null;

    }
}
