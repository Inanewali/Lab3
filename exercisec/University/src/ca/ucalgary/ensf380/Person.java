package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private static int lastPersonalNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getLastPersonalNumber() {
        return lastPersonalNumber;
    }

    public static void setLastPersonalNumber(int lastPersonalNumber) {
        Person.lastPersonalNumber = lastPersonalNumber;
    }

    public static String nextPersonalNumber(short type) {
        // Implementation to get the next personal number
        return String.valueOf(++lastPersonalNumber);
    }

    public boolean hasValidAddress() {
        // Check if the person has a valid address
        return address != null && address.validate();
    }
}
