public class Books {
    String bookName;
    String author;
    int numberOfPages;

    public Books(String bookName, String author, int numberOfPages){
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }
    public String bookDetail(){
        return "nazwa książki: " + bookName + "\n Autor: " + author + "\n Liczba stron: " +  numberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages (int numberOfPages){
        this.numberOfPages = numberOfPages;
    }


}
