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

        MUserDB mUserDB = new MUserDB();
        mUserDB.setName(name);
        mUserDB.setPassword(passWord);

        return MHibUtil.queryResult(new MHibUtil.QueryResult<MUserDB>() {
            @Override
            public MUserDB query(Session mSession) {
                mSession.save(mUserDB);
                return mUserDB;
            }
        });
    }

}
