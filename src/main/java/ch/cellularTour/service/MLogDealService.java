package ch.cellularTour.service;

/**
 * Created by 今夜犬吠 on 2017/7/21.
 * 测试Log处理、工参相关-业务
 */
public interface MLogDealService {

    /**
     * Ping日志上传-写入数据库
     */
    void PingLogUpload();

    /**
     * DNS日志上传-写入数据库
     */
    void DNSLogUpload();

    /**
     * HTTP日志上传-写入数据库
     */
    void HTTPLogUpload();
}
