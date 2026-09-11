package projects.project4;

public class BookDemo {

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", "J. K Rowling", 1996);
        Book b = new Book();
        b.setTitle(null);

        harryPotter.printDetails();
        b.printDetails();
    }

}
