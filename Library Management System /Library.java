import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void checkOutBook(String title, Member member) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.borrowBook();
                System.out.println(member.getName() + " borrowed " + title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                System.out.println(title + " has been returned.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

