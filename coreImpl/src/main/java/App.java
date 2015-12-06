import dao.ContactDao;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ������������� on 18.09.15.
 */
public class App {
    static Logger LOG= Logger.getLogger(App.class);
    public static void main(String[] args) {

         LOG.info("start");


         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
         ContactDao contactDao = context.getBean(ContactDao.class);
         contactDao.allContact();

         context.stop();


       /* ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicatoionContacts.xml");

        System.out.println(context.getBeansOfType(ContactDto.class));

        Contact contact = context.getBean(Contact .class);

        System.out.println(contact);

        ContactDao contactDao=new ContactDaoImpl();
        contactDao.addContact(context.getBean(Contact.class));
        context.stop();*/
    }
}
