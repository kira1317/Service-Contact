package dao.impl;


import core.model.SecurityDto;
import dao.SecurityDao;

import dao.entity.Security;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static dao.converts.EntityDtoConverter.convert;

/**
 * Created by Администратор on 01.12.15.
 */
@Repository
@Transactional(readOnly = true)

public class SecurityDaoImp implements SecurityDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional(readOnly = false)
    public void addSecurity(SecurityDto securityDto) {
        Security security = convert(securityDto);
        sessionFactory.getCurrentSession().save(security);
    }


    public List<SecurityDto> getAllSecurity() {
        List<Security> securities = sessionFactory.getCurrentSession().createQuery("from Security ").list();
        List<SecurityDto> result = new ArrayList<SecurityDto>(securities.size());
        for (Security security : securities) {
            result.add(convert(security));

        }
        return result;

    }

    @Transactional(readOnly = false)
    public void deleteSecurity(SecurityDto securityDto) {
        Security security = convert(securityDto);
        sessionFactory.getCurrentSession().delete(security);
    }
}
