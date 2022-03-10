public class Main {

    public static void main(String[] args) {

        Books book1 = new Books("Lśnienie", "Stephen King", 350);
        System.out.println(book1.bookDetail());
        System.out.println( book1.bookDetail() );
        book1.setNumberOfPages (350);
        System.out.println(book1.bookDetail());
        book1.setNumberOfPages(3);
        System.out.println(book1.bookDetail());





    }
}
