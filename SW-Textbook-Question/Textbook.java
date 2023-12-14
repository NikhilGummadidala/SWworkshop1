public class Textbook extends Book {
    //edition number + title + price
  
    private int editionNumber;
    private String bookTitle;
    private int bookPrice;
  
    //creates a new Textbook class with given title, price, and edition number
    public Textbook(String bookTitle, double bookPrice, int bookEdition)
    {
      super(bookTitle, bookPrice);
      editionNumber = bookEdition;
    }
  
    //get book
    public String getBookInfo(){
      String bookInfo = bookTitle + "-" + bookPrice + "-" + editionNumber;
      return bookInfo;
    }

    //get edition
    public int getEdition(){
        return editionNumber;
    }
    //can sub for textbook
  public static Boolean canSubstituteFor(Textbook textbook1, Textbook textbook2){
    if(textbook1.getTitle().equals(textbook2.getTitle()) && textbook1.getEdition() >= textbook2.getEdition()){
        return true;
    }
    else {
        return false;
    }
    }
}
    