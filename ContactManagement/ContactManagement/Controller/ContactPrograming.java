package ContactManagement.Controller;

import java.util.Scanner;

import ContactManagement.Model.Contact;
import ContactManagement.View.Menu;
import ContactManagement.common.ContactMangement;
import ContactManagement.common.Input;

public class ContactPrograming extends Menu<String> {
  ContactMangement contactMangement = new ContactMangement();
    Scanner sc = new Scanner(System.in);
    
    Input input = new Input();
    static String[] mc = { "addContact", "displayAllContact", "deleteContact", "Exit" };

    public ContactPrograming() {
        super("Contact program", mc);

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                addContact();
                break;
            }
            case 2: {
                contactMangement.displayAllContact();
                break;
            }
            case 3: {

                deleteContact();
                break;
            }
            case 4: {
                System.exit(0);
            }

        }
    }

    public void addContact() {
        int id = input.getID(contactMangement.getAllContactList());
        System.out.println("ID: " + id); 
        System.out.println("Enter firstName: ");
        String firstName = input.getName();
        System.out.println("Enter lastName: ");
        String lastName = input.getName();
        System.out.println("Enter group: ");
        String group = input.getString();
        System.out.println("Enter address: ");
        String address = input.getString();
        System.out.println("Enter phone: ");
        String phone = input.getPhoneNumber();

        Contact contact = new Contact(id, lastName, firstName, group, address, phone);
        contactMangement.addContact(contact);
    }

    public void deleteContact() {
        if (contactMangement.getAllContactList().isEmpty()) {
            System.out.println("Empty");
            return;
        }

        contactMangement.displayAllContact();
        int id = input.getInt("Enter id: ", 1, contactMangement.getAllContactList().get(contactMangement.getAllContactList().size()-1).getIdContact());

        Contact contact = contactMangement.getContactByID(id);
        contactMangement.removeContactByO(contact);
        System.out.println("Remove Succesfull");
    }

    

}

