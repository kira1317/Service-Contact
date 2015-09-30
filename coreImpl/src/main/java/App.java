import core.model.Contact;
import ua.service.contact.dao.service.impl.ContactDao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Администратор on 18.09.15.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContacts.xml");

        System.out.println(context.getBeansOfType(Contact.class));

        ContactDao contactDao = context.getBean(ContactDao .class);

        System.out.println(contactDao);

        contactDao.addContact(context.getBean(Contact.class));
    }
}
