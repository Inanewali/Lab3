package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // Create an author
        Author author1 = new Author("Leo Tolstoy", "123 Russian St", 82);
        Author author2 = new Author("Jane Austen", "456 British Ave", 41);

        // Create a publisher
        Publisher publisher = new Publisher("Penguin Books", "789 Publisher Rd");

        // Create classic books
        Classic warAndPeace = new Classic();
        warAndPeace.setTheAuthor(author1);
        warAndPeace.setBookPublisher(new Publisher[] { publisher });

        Classic prideAndPrejudice = new Classic();
        prideAndPrejudice.setTheAuthor(author2);
        prideAndPrejudice.setBookPublisher(new Publisher[] { publisher });

        // Set the classics catalog for the publisher
        publisher.setClassicsCatalog(new Classic[] { warAndPeace, prideAndPrejudice });

        // Create contracts
        Contract contract1 = new Contract("01-01-1869", publisher, new Author[] { author1 });
        Contract contract2 = new Contract("01-01-1813", publisher, new Author[] { author2 });

        // Display book details and contracts
        System.out.println("Book name: War and Peace");
        System.out.println("Author: " + author1.getName());
        System.out.println("Author's Address: " + author1.getAddress());
        System.out.println("Publish date: 1869");
        System.out.println("Publisher: " + publisher.getName());
        System.out.println("Publisher's Address: " + publisher.getAddress());
        System.out.println("Contract Date: " + contract1.getDate());
        System.out.println(contract1.printContract());

        System.out.println();

        System.out.println("Book name: Pride and Prejudice");
        System.out.println("Author: " + author2.getName());
        System.out.println("Author's Address: " + author2.getAddress());
        System.out.println("Publish date: 1813");
        System.out.println("Publisher: " + publisher.getName());
        System.out.println("Publisher's Address: " + publisher.getAddress());
        System.out.println("Contract Date: " + contract2.getDate());
        System.out.println(contract2.printContract());
    }
}
