package ua.service.contact.dao.service.impl;

import org.springframework.stereotype.Repository;

import core.model.Contact;
import core.model.Hobby;
import core.model.Message;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Администратор on 10.09.15.
 */
@Repository
public class MessagerDao {

    private Map<String,Message> serviseMessage= new HashMap<String,Message>();

    public Collection<Message> getAll() {
        return serviseMessage.values();
    }

    public void storeMessage(Message message){


    }
    public List<Message> getConvertation(Contact contact1,Contact contact2){

        return null;

    }

}
