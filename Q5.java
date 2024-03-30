/*Create a Class Book that has id, name, author and quantity for each book
issued. The Book class should define a parameterised constructor. Design
a class Library that create a HashMap of books which contains an entry
of key as Integer and value as Book object. Instantiate atleast two Book
objects and display the collection of books in the HashMap. Use proper
method of HashMap class to return the following things
(a.)Check if a particular book name is present in the map
(b.) remove the value associated with a particular key value which will
remove the book entry */


import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();
        Book book1 = new Book(1, "DSA", "Ritikh", 5);
        Book book2 = new Book(2, "ICP", "Prince", 3);
        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);
        System.out.println("Books in the library:");
        for (Book book : books.values()) {
            System.out.println("ID: " + book.getId() + ", Name: " + book.getName() + ", Author: " + book.getAuthor() + ", Quantity: " + book.getQuantity());
        }
        String bookNameToSearch = "DSA";
        boolean isBookPresent = false;
        for (Book book : books.values()) {
            if (book.getName().equals(bookNameToSearch)) {
                isBookPresent = true;
                break;
            }
        }
        if (isBookPresent) {
            System.out.println("Book \"" + bookNameToSearch + "\" is present in the library.");
        } else {
            System.out.println("Book \"" + bookNameToSearch + "\" is not present in the library.");
        }

        int bookIdToRemove = 2;
        if (books.containsKey(bookIdToRemove)) {
            books.remove(bookIdToRemove);
            System.out.println("Book with ID " + bookIdToRemove + " removed from the library.");
        } else {
            System.out.println("Book with ID " + bookIdToRemove + " not found in the library.");
        }
    }
}
