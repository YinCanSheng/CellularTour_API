package ch.cellularTour.dao.impl;

import ch.cellularTour.dao.MAccountDao;
import ch.cellularTour.pojo.MUserDB;
import ch.cellularTour.utils.MHibUtil;
import org.hibernate.Session;

/**
 * Created by 今夜犬吠 on 2017/7/21.
 * <p>
 * 用户信息-联系数据库
 */
public class MAccountDaoImpl implements MAccountDao {


    /**
     * 用户登录
     *
     * @Table(name="表名") 使用类名
     * @Entity(name="表名") 使用表名
     */
    @Override
    public MUserDB login(String name, String passWord) {

        return MHibUtil.queryResult(new MHibUtil.QueryResult<MUserDB>() {
            @Override
            public MUserDB query(Session mSession) {

                return (MUserDB) mSession.createQuery("from MUserDB where name=:name and password=:password")
                        .setParameter("name", name)
                        .setParameter("password", passWord)
                        .uniqueResult();
            }
        });
    }

    /**
     * 用户注册
     *
     * @return
     */
    @Override
    public MUserDB registered(String name, String passWord) {

        /**封装用户注册的参数*/
        MUserDB mUserDB = new MUserDB();
        /**用户名*/mUserDB.setName(name);
        /**密码*/mUserDB.setPassword(passWord);

        /**编写HQL语句利用Hibernate更新数据库*/
        return MHibUtil.queryResult(new MHibUtil.QueryResult<MUserDB>() {
            @Override
            public MUserDB query(Session mSession) {
                /**利用关系对象模型创建数据库*/mSession.save(mUserDB);
//                String[] mStrings=new String[]{"s","ff"};
//               /**更新表数据*/ mSession.createQuery("update MUserDB s set s.name=? where s.password=?")
//                .setParameter(1,mStrings[0]);
                return mUserDB;
            }
        });
    }

}
