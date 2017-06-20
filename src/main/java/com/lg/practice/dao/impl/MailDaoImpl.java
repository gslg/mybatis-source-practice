package com.lg.practice.dao.impl;

import com.lg.practice.Util.SqlSessionUtil;
import com.lg.practice.dao.MailDao;
import com.lg.practice.entity.Mail;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by liuguo on 2017/6/20.
 */
public class MailDaoImpl implements MailDao {


    @Override
    public long insertMail(Mail mail) {
        SqlSession session = SqlSessionUtil.getSqlSession();

        try {
            int rows  = session.insert("MailMapper.insertMail",mail);
            session.commit();
            if(rows >0){
                return mail.getId();
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public int deleteMail(long id) {
        return 0;
    }

    @Override
    public int updateMail(Mail mail) {
        return 0;
    }

    @Override
    public List<Mail> selectMailList() {
        return null;
    }

    @Override
    public Mail selectMailById(long id) {
        return null;
    }
}
