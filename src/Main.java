public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the client page of our application!");
        Clients client1 = new Clients("John", "Doe", "prout@gmail.com", "123-456-7890");
        System.out.println("Client Information:");
        System.out.println("First Name: " + client1.getFirstName());
        System.out.println("Last Name: " + client1.getLastName());
        System.out.println("Email: " + client1.getEmail());
        System.out.println("Phone Number: " + client1.getPhoneNumber());
    }
}