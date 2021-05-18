public class Book{
  String title;
  
  public Book(String title) {
    this.title = title;
    System.out.println("Book " + this.title + " created.");
  }

  public Book(){

  }


  public String toString() {
    return this.title;
  }

  public String getTitle(){
    try {
      return this.title;
    } catch (NullPointerException a) {
      return null;
    }

  }

  
  
}