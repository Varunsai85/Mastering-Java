package Questions;

class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books=new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books++] = book;
        System.out.println("\""+book+"\""+" added successfully");
    }

    void showAvailableBooks() {
        System.out.println("The Available Books are : ");
        for(String ele:this.books){
            if(ele==null){
                continue;
            }
            System.out.println("* "+ele);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The Book "+"\""+book+"\""+" is Issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("\""+book+"\""+" doesnot exist");
    }
    void returnBook(String book){
        addBook(book);
        System.out.println("The "+"\""+book+"\""+" has been returned");
    }

}

public class Main {
    public static void main(String[] args) {
        Library booksLibrary = new Library();
        booksLibrary.addBook("48 Laws of Power");
        booksLibrary.addBook("The Subtle Art of not Giving a Fuck");
        booksLibrary.addBook("Clear Thinking");
        booksLibrary.addBook("Mediations");
        booksLibrary.showAvailableBooks();
        booksLibrary.issueBook("Mediations");
        booksLibrary.showAvailableBooks();
        booksLibrary.returnBook("Meditations");
        booksLibrary.showAvailableBooks();
    }
}
