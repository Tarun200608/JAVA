package projectsinjava;
public class projectlibrary {
        public static void main(String[] args) {
            library tarun=new library();
            tarun.addBook("the great legend Born");
            tarun.addBook("Java full course ");
            tarun.addBook("python Unlitimate ");
            tarun.showavailablebooks();
            tarun.issuebook("Java full course ");
            tarun.showavailablebooks();
            tarun.returnbook("Java full course ");
            tarun.showavailablebooks();
            
        }
}
class library{
        String [] books;
        int noOfBooks;
        library(){
                this.books=new String[100];
                this.noOfBooks=0;
        }
        void addBook(String book){
                this.books[noOfBooks]=book;
                noOfBooks++;
                System.out.println(book+" was sucessfully added...");
        }
        void showavailablebooks(){
            System.out.println("Available books are :");
            for (String string : books) {
                if(string==null){
                    continue;
                }
                System.out.println("* "+string);
            }
        }
        void issuebook(String book){
            for(int i=0;i<this.books.length;i++){
                if(this.books[i].equals(book)){
                    System.out.println("The book has been issued");
                    this.books[i]=null;
                    return;
                }
            }
            System.out.println("this book does not exists...");
        }
        void returnbook(String book){
            addBook(book);        }
}


