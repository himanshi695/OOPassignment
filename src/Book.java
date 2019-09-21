import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bookstore[] ob = new Bookstore[n];
        if (n == 0)
            System.out.format("N/A");
        else {
            for (int i = 0; i < n; i++) {
                if (i==0){
                    String v = sc.nextLine().trim();
                }
                String name1 = sc.nextLine().trim();
                String author1 = sc.nextLine().trim();
                int isbn1 = sc.nextInt();
                ob[i] = new Bookstore(name1, author1, isbn1);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(ob[i].toString());
            }
        }
    }
}
class Bookstore {
    private String bookName;
    private String authorName;
    private int isbn;

    Bookstore(String bookName, String authorName, int isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getauthorName() {
        return authorName;
    }

    public void setauthorName(String authorNamer) {
        this.authorName = authorName;
    }

    public int getisbn() {
        return isbn;
    }

    public void setisbn(int isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "-----------------------------\n"+
                "Book Name:\t"+bookName+
                "\nAuthor Name:\t"+authorName+
                "\nISBN:\t"+isbn+
                "\n-----------------------------";
    }
}

