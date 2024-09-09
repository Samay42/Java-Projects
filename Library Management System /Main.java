public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Member member1 = new Member("John Doe", 1);

        library.addBook(book1);
        library.addBook(book2);
        library.registerMember(member1);

        library.checkOutBook("1984", member1);
        library.returnBook("1984");
    }
}
