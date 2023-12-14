class Book{
    //title of the book
    private String title;

    //the price of the book
    private double price;

    //creates a new Book class with given title and price
    public Book(String bookTitle, double bookPrice)
    {
      title = bookTitle;
      price = bookPrice;
    }

    //returns book title
    public String getTitle()
    { return title; }

    //returns string w/ price + title of book
    public String getBookInfo()
    {
      String bookInfo = title + "-" + price;
      return bookInfo;
    }
  }
  //there may be instance variables, constructors, and methods that are not shown.


    

