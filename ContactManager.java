import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class ContactManager {
    private ArrayList<Contact> contacts =  new ArrayList<>();
    private Set<Contact> setContacts = new HashSet<>();

    Contact contact = new Contact();

    public void addContact(Contact contact) {
        // Implemented logic to prevent duplicates and add the contact 
        if(setContacts.contains(contact)){
            System.out.println("contact is already exists "+ contact.getName());
        }else{
            setContacts.add(contact);
            contacts.add(contact);
        }
    }

    public void deleteContact(String name) {
        // Implemented logic to delete a contact by name
        for(int i =0;i<contacts.size();i++){
            contact = contacts.get(i);
            if((contact.getName()).equals(name)){
                contacts.remove(i);
                System.out.println("Contact details of "+ name + " has been Deleted.");
                break;
            }
        }
        System.out.println("Contact details of "+ name + " Not FOUND.");

    }

    public void viewAllContacts() {
        // Implemented logic to display all contacts
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("E-mail: " + contact.getEmail());
            System.out.println();
        }
    }
}
