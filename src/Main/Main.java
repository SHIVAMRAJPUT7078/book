package Main;
import javax.xml.namespace.QName;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine().trim();
        if (n == 0) {
            System.out.println("N/A");
        }
        // Array of objects of book
        // int[] int
        else {
            Book[] books = new Book[n];
            for (int i = 0; i < n; i++) {
                String bookname = scanner.nextLine().trim();
                String authorname = scanner.nextLine().trim();
                String ISBN = scanner.nextLine().trim();
                books[i] = new Book(authorname, bookname, ISBN);

            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }

            scanner.close();
        }
    }
    }

    class Book {
        public String ISBN;
        public String Author;
        public String Name;

        @Override
        public String toString() {
            return ("-----------------------------\n" +
                    "Book Name:\t" + Name + "\n" +
                    "Author Name:\t" + Author + "\n" +
                    "ISBN:\t" + ISBN + "\n" +
                    "-----------------------------"
            );
        }

        public Book(String Author, String Name, String ISBN) {
            this.Author = Author;
            this.Name = Name;
            this.ISBN = ISBN;
        }
    }

