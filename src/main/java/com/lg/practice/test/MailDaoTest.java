package com.lg.practice.test;

import com.lg.practice.dao.MailDao;
import com.lg.practice.dao.impl.MailDaoImpl;
import com.lg.practice.entity.Mail;
import org.junit.Test;

/**
 * Created by liuguo on 2017/6/20.
 */
public class MailDaoTest {

    @Test
    public void test(){
        Mail mail = new Mail(0,"qq@qq.com","ceshi");

        MailDao mailDao = new MailDaoImpl();

       long id = mailDao.insertMail(mail);

        System.out.println(id);
    }
}
