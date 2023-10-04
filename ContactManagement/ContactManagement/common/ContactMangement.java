package ContactManagement.common;

import java.util.ArrayList;

import ContactManagement.Model.Contact;

public class ContactMangement {
    ArrayList<Contact> contactList = new ArrayList<>();

    public ArrayList<Contact> getAllContactList() {
        return contactList;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void removeContactByIndex(int index){
        contactList.remove(index);
    }

    public void removeContactByO(Contact contact){
        contactList.remove(contact);
    }

    public void updateContact(int index, Contact contact){
        contactList.set(index, contact);
    }

    public Contact getContactByID(int id){
        for (Contact contact : contactList) {
            if (contact.getIdContact()==id) {
                return contact;
            }
        }
        return null;
    }

    public void displayAllContact(){
        if (contactList.isEmpty()) {
            System.out.println("Empty");
            return;
        }

        System.out.printf("%-5s%-15s%-12s%-13s%-10s%-10s%-20s\n", "ID","Name","Fist Name","Last Name","Group", "Adress","Phone");

        for (Contact contact : contactList) {
            System.out.printf("%-5d%-15s%-12s%-13s%-10s%-10s%-20s\n",contact.getIdContact(), contact.getNameContact(),contact.getFirstNameContact(),contact.getLastNameContact(),contact.getGroupContact(),contact.getAddressContact(),contact.getPhoneNumberContact());
        }
    }

    




}
