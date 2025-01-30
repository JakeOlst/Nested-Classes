class Library {
    String objType;
    String objName;
  
    // Assign values using constructor
    public Library(String type, String name) {
      this.objType = type;
      this.objName = name;
    }
  
    // private method
    private String getObjName() {
      return this.objName;
    }
  
    // Inner class
    class Book {
      String description;
  
      void setDescription() {
        if(Library.this.objType.equals("book")) {
          if(Library.this.getObjName().equals("nonfiction")) {
            this.description = "Factual stories/accounts based on true events.";
          } else {
            this.description = "Literature that is imaginary.";
          }
        } else {
          this.description = "Not a book!";
          }
      }
      String getDescription() {
        return this.description;
      }
    }
  }
  
  public class Main {
    public static void main(String[] args) {
      Library fiction = new Library("book", "fiction");

      Library.Book book1 = fiction.new Book();
    book1.setDescription();
    System.out.println("Fiction Book Description = " + book1.getDescription());
 
    Library nonFiction = new Library("book", "nonfiction");
    Library.Book book2 = nonFiction.new Book();
    book2.setDescription();
    System.out.println("Non-fiction Book Description = " + book2.getDescription());
    }
  }
  