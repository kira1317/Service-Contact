package dao;

import core.model.ContactDto;
import core.model.MassegeDto;
import dao.entity.Contact;
import dao.entity.Massege;

import java.util.List;

/**
 * Created by Администратор on 02.12.15.
 */
public interface MassegeDao {


        void addMessage(MassegeDto massegeDto);
        void deleteMessage(MassegeDto massegeDto);
        List<MassegeDto> getConversation(ContactDto contactDto1, ContactDto contactDto2);

}
