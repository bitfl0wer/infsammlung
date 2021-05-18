public class HelloLibrary {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Book book = new Book("Wasserkocher Bedienungsanleitung");
    Book book1 = new Book("Java for Dummies");
    Book book2 = new Book("Harry Potter");
    Library lib = new Library();
    lib.add(book1);
    lib.add(book2);
    //System.out.println(book.toString(book));

  }
}