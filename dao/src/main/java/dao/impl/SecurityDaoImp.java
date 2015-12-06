package dao.impl;

import dao.SecurityDao;
import dao.entity.Security;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Администратор on 01.12.15.
 */
@Repository
@Transactional(readOnly = true)

public class SecurityDaoImp implements SecurityDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void addSecurity(Security security) {

    }

    public void deleteContact(Security security) {

    }





}
