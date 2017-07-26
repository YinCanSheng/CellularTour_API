package ch.cellularTour.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by 今夜犬吠 on 2017/7/25.\
 * <p>
 * Hibernate 操作工具类
 */
public class MHibUtil {

    /*Session工厂-用户生成Session(回话)*/ private static SessionFactory mSessionFactory;

    /**
     * 静态框初始化
     */
    static {
        initSessionF();
    }

    /**
     * 初始化工厂
     */
    private static void initSessionF() {
        /*从hibernate.cfg.xml注册服务*/
        StandardServiceRegistry mServiceRegistry = new StandardServiceRegistryBuilder().configure().build();

        try {
            /*根据服务注册类创建一个元数据资源集，同时构建元数据并生成唯一的的session工厂*/
            mSessionFactory = new MetadataSources(mServiceRegistry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            /*注销服务*/
            StandardServiceRegistryBuilder.destroy(mServiceRegistry);
        }


    }

    /**
     * 获取一个会话工厂
     *
     * @return
     */
    public static SessionFactory getmSessionFactory() {
        return mSessionFactory;
    }

    /**
     * 关闭会话工厂
     */
    public static void closeSessionFactory() {
        if (mSessionFactory != null) {
            mSessionFactory.close();
        }
    }

    /**
     * 从工厂里得到一个会话
     * <p>
     * Session是数据库和应用的中间人，直接操作数据库
     */
    public static Session getSession() {
        if (mSessionFactory != null) {
            mSessionFactory.getCurrentSession();
        }
        return null;
    }

    /**
     * 简化Session-无返回值
     * <p>
     * mQueryOfNoValue 外部传递接口
     */
    public static void queryNoValue(QueryOfNoValue mQueryOfNoValue) {
        /*开一个会话*/
        Session mSession = mSessionFactory.openSession();
        /*开启事务*/
        Transaction mTransaction = mSession.beginTransaction();

        try {
              /*回调具体实现做操作*/
            mQueryOfNoValue.query(mSession);

            /*提交*/
            mTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            /*事务回滚，出错则回滚至为修改状态*/
            mTransaction.rollback();
        } finally {
            /*必须关闭事务*/
            mSession.close();
        }

    }


    /**
     * 简化Session-有返回值
     * <p>
     * mQueryOfNoValue 外部传递接口
     */
    public static <T> T queryResult(QueryResult<T> mQueryResult) {
        /*开一个会话*/
        Session mSession = mSessionFactory.openSession();
        /*开启事务*/
        Transaction mTransaction = mSession.beginTransaction();

        /*返回值*/
        T mResult = null;

        try {
              /*回调具体实现做操作*/
            mResult = mQueryResult.query(mSession);

            /*提交*/
            mTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            /*事务回滚，出错则回滚至为修改状态*/
            mTransaction.rollback();
        } finally {
            /*必须关闭事务*/
            mSession.close();
        }
        return mResult;
    }

    /**
     * 用户查询的接口-无返回值
     */
    public interface QueryOfNoValue {
        void query(Session mSession);
    }

    /**
     * 用户查询的接口-有返回值
     */
    public interface QueryResult<T> {
        T query(Session mSession);
    }
}
