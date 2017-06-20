package com.lg.practice.dao;

import com.lg.practice.entity.Mail;

import java.util.List;

/**
 * Created by liuguo on 2017/6/20.
 */
public interface MailDao {
    /**
     * 插入一条邮箱信息
     */
    long insertMail(Mail mail);

    /**
     * 删除一条邮箱信息
     */
    int deleteMail(long id);

    /**
     * 更新一条邮箱信息
     */
    int updateMail(Mail mail);

    /**
     * 查询邮箱列表
     */
    List<Mail> selectMailList();

    /**
     * 根据主键id查询一条邮箱信息
     */
    Mail selectMailById(long id);
}
