public class Library extends Book {
  private Book[] booksLibrary;
  private int numberBooks;

  public Library(){
    System.out.println("Hello, I am a library, which can store up to 10 books!");
    booksLibrary = new Book[10];
    numberBooks = 0 ;
  }

  public void add(Book addedBook){
    if(numberBooks > 9){
      System.out.println("The library is full!");
      return;
    }
    booksLibrary[numberBooks] = addedBook;
    System.out.println("I added the book " + addedBook + "!");
    numberBooks++;
  }

  public Book search(String title){
      if(title == null) {
        return null;
      }
      for(Book book : booksLibrary){
        try {
          if (book.getTitle().equals(title)) {
            System.out.println("The book with the title " + title + " exists in the library!");
            return book;
          }
        }
        catch(NullPointerException e){
        }
      }
      System.out.println("The book with the title " + title + " does not exist in the library!");
      return null;
  }
  
}