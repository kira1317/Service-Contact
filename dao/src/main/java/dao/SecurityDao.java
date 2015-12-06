package dao;

import core.model.ContactDto;
import dao.entity.Contact;
import dao.entity.Security;

import java.util.List;

/**
 * Created by Администратор on 01.12.15.
 */
public interface SecurityDao {

    void addSecurity(Security security);
    void deleteContact(Security security);

}
