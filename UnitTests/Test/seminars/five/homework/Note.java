package seminars.five.homework;

import java.util.ArrayList;
import java.util.List;

public class Note {
    private Contact contact;

    public Note(Contact contact) {
        this.contact = contact;
    }

    public List<Contact> addContact(){
        List<Contact> list = new ArrayList<>();
        list.add(contact);
        return list;
    }
    public Contact editContact(Contact contact){
        //contact.getName();
        return contact;
    }

    public List<Contact> deleteContact(Contact contact, List<Contact> list){
        list.remove(contact);
        return new ArrayList<>();
    }

}
