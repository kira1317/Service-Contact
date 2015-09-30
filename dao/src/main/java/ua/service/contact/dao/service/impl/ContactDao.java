package ua.service.contact.dao.service.impl;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Value;


import core.model.Contact;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

/**
 * Created by Администратор on 10.09.15.
 */
@Repository
public class ContactDao {

    @Value("${contact.dao}")
    private String fileName;

    private Map<Integer,Contact> serviseContact= new HashMap<Integer,Contact>();

    public Collection<Contact> getAll() {
        return serviseContact.values();
    }


    @PostConstruct
    public void init() throws IOException, ClassNotFoundException {
        serviseContact = new HashMap<Integer, Contact>();

        Contact contact=new Contact(0);
        contact.setFirstName("Lena");
        serviseContact.put(contact.getIdContact(),contact);

        File file = new File(fileName);
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            serviseContact = (Map<Integer, Contact>)ois.readObject();
            ois.close();
        }
        else {
            System.out.println("File was not found");
        }

    }


    public boolean addContact(Contact contact){



        if (searchContact(contact.getIdContact()) ==null) {

            serviseContact.put(contact.getIdContact(),contact);
            return true;

        }

        return false;

    };
    public void deleteContact(Contact contactDel){

        Contact contact=searchContact(contactDel.getIdContact());
        if (contact != null) {

            serviseContact.remove(contact.getIdContact());
            return;
        }

        System.out.print("Not delete contact");

    };
/////////////////////////////////???????????
    public void addFriendShip(Contact contact, Contact contactFriend){



    };

    public void removeFriendship(Contact contact, Contact contactFriend){

    };
//////////////////////////////?????????????
    public Contact searchContact(int id) {


        if (serviseContact.get(id) != null) {

            return serviseContact.get(id);


        }
        return null;

    }





}
