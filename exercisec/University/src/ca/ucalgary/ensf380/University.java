package ca.ucalgary.ensf380;


public class University {
    public static void main(String[] args) {
        // Create an Address object for the professor
        Address profAddress = new Address();
        profAddress.setStreet("123 University Ave");
        profAddress.setCity("Calgary");
        profAddress.setState("AB");
        profAddress.setPostalCode("T2N 1N4");
        profAddress.setCountry("Canada");

        // Create a Professor object
        Professor prof = new Professor();
        prof.setName("Dr. Trump");
        prof.setPhoneNumber("403-555-1234");
        prof.setEmailAddress("trump@ucalgary.ca");
        prof.setAddress(profAddress);
        prof.setTeacherNumber("P123");
        prof.setSalary(120000);

        // Create Address objects for the students
        Address student1Address = new Address();
        student1Address.setStreet("456 College St");
        student1Address.setCity("Calgary");
        student1Address.setState("AB");
        student1Address.setPostalCode("T2N 3K4");
        student1Address.setCountry("Canada");

        Address student2Address = new Address();
        student2Address.setStreet("789 Academy Rd");
        student2Address.setCity("Calgary");
        student2Address.setState("AB");
        student2Address.setPostalCode("T2N 5L6");
        student2Address.setCountry("Canada");

        // Create Student objects
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setPhoneNumber("403-555-5678");
        student1.setEmailAddress("john.doe@ucalgary.ca");
        student1.setAddress(student1Address);
        student1.setStudentNumber("S456");
        student1.setSupervisor(prof);
        student1.setAverageMark(85.0);

        Student student2 = new Student();
        student2.setName("Jane Smith");
        student2.setPhoneNumber("403-555-9101");
        student2.setEmailAddress("jane.smith@ucalgary.ca");
        student2.setAddress(student2Address);
        student2.setStudentNumber("S789");
        student2.setSupervisor(prof);
        student2.setAverageMark(90.0);

        // Display information about the professor and students
        System.out.println("Professor:");
        System.out.println("Name: " + prof.getName());
        System.out.println("Phone: " + prof.getPhoneNumber());
        System.out.println("Email: " + prof.getEmailAddress());
        System.out.println("Address: " + prof.getAddress().outputAsLabel());
        System.out.println("Teacher Number: " + prof.getTeacherNumber());
        System.out.println("Salary: " + prof.getSalary());

        System.out.println("\nStudents:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Phone: " + student1.getPhoneNumber());
        System.out.println("Email: " + student1.getEmailAddress());
        System.out.println("Address: " + student1.getAddress().outputAsLabel());
        System.out.println("Student Number: " + student1.getStudentNumber());
        System.out.println("Supervisor: " + student1.getSupervisor().getName());
        System.out.println("Average Mark: " + student1.getAverageMark());
        System.out.println("Eligible to Enroll: " + student1.isEligibleToEnroll());

        System.out.println("\nName: " + student2.getName());
        System.out.println("Phone: " + student2.getPhoneNumber());
        System.out.println("Email: " + student2.getEmailAddress());
        System.out.println("Address: " + student2.getAddress().outputAsLabel());
        System.out.println("Student Number: " + student2.getStudentNumber());
        System.out.println("Supervisor: " + student2.getSupervisor().getName());
        System.out.println("Average Mark: " + student2.getAverageMark());
        System.out.println("Eligible to Enroll: " + student2.isEligibleToEnroll());
    }
}
