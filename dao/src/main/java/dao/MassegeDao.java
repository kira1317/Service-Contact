package dao;

import dao.entity.Contact;
import dao.entity.Massege;

import java.util.List;

/**
 * Created by Администратор on 02.12.15.
 */
public interface MassegeDao {


        void storeMessage(Massege massege);
        List<Massege> getConversation(Contact contact1, Contact contact2);

}
