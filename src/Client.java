public class Client
{
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Client()
    {
        this.firstName = "None";
        this.lastName = "None";
        this.email = "None";
        this.phoneNumber = "None";
    }

    public Client(String firstName, String lastName, String email, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}