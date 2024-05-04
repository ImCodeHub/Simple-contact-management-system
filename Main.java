import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        // Contact contact = new Contact();
        
        while (true) {
            System.out.println("1. Add Contact Details");
            System.out.println("2. Delete Contact");
            System.out.println("3. View All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            Contact contact = new Contact();
            switch (choice) {
                case 1:
                    // Logic to add a contact
                    System.out.println("Enter your contact details");
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter your Phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.println("Enter your E-mail id: ");
                    String email = scanner.nextLine();

                    
                    contact.setName(name);
                    contact.setPhoneNumber(phoneNumber);
                    contact.setEmail(email);

                    contactManager.addContact(contact);

                    break;
                case 2:
                    // Logic to delete a contact
                    System.out.println("Enter the name you want to Delete.");
                    String deleteName = scanner.nextLine();
                    contactManager.deleteContact(deleteName);
                    break;
                case 3:
                    // Logic to view all contacts
                    contactManager.viewAllContacts();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    scanner.close();
            }
        }
        
    }

}
