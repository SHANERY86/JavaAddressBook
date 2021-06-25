// This class sets the object structure for the Contact. It contains a Person object, and contact details for that person.

public class Contact {
    private String email;
    private String address;
    private String phoneNo;
    private Person person;

    public Contact(Person person, String email, String address, String phoneNo){
        this.person = person;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Person getPerson() {
        return person;
    }

    public String toString(){

        return  " Name: " + person.getName()
                + "\n D.O.B: " + person.getDOB()
                + "\n Gender: " + person.getGender()
                + "\n email: " + email
                + "\n Address: " + address
                + "\n Phone Number: " + phoneNo;
    }
}
