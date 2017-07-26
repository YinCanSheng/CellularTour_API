package ch.cellularTour;

import ch.cellularTour.controller.API.MLogUploadC;
import ch.cellularTour.controller.MLogin;
import ch.cellularTour.utils.GsonProvider;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.gson.GsonBuilder;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * Created by 今夜犬吠 on 2017/7/20.
 * Jersey入口。
 * 全局配置。
 * 扫描包位置
 * JSON解析、日志等
 * <p>
 * 到具体的类处理之前，会经过此处，做预备封装处理。
 */
public class MApplication extends ResourceConfig {

    public MApplication() {
        /*注册Jersey扫描路径包名*/
        packages(MLogUploadC.class.getPackage().getName());

        // register(MLogUploadC.class);
        /*注册JSON解析-自定义*/
        //register(JacksonJsonProvider.class);
        register(GsonProvider.class);//GSON
        //register(GsonBuilder.class);
        //register(JSON.class);//FastJson
        //register(FastJsonProvider.class);
        /*注册日志打印*/
        register(Logger.class);
    }
}
