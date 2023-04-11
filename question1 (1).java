
import java.util.ArrayList;
import java.util.Scanner;
class Book{
  private int book_id;
  private String title,author;
  private double price;

  book(int book_id,String title,String author,double price){
    this.author=author;
    this.book_id=book_id;
    this.title=title;
    this.price=price;
  }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
   this.title=title;
}
  public String getauthor(){
    return author;
  }
  public void setAuthor(String author){
  this.author=author;
  }
   public String getprice(){
    return price;
  }
  public void setPrice(String Price){
    this.price=price;
  }
   public String getBook_id(){
    return book_id;
  }
  public void setBook_id(String Book_id){
      this.book_id=book_id;
  }
  class BookNotfoundException extends Exception{
    BookNotfoundException(String str){
      super(str);
    }
  }
  class challenge1{
    Scanner s =new Scanner(System.in);
    ArrayList<Book> book=new ArrayList<Book>();
    public void addBook(){
      System.out.println("enter book title");
      String title=s.next();
       System.out.println("enter author name");
      String author=s.next();
       System.out.println("enter price");
      double price=s.nextDouble();
      system.out.println("Enter book id");
      int id=s.nextInt(){
        book.add(new Book(book_id,title,author,price));
      }
      public void total price(){
        double tprice=0;
        for(Book b:book){
          tPrice=tPrice+b.getPrice();
        }
        System.out.println("total price of all books"+price);
      }
      public void removeBook(){
        System.out.println("before removing book");
        for(Book b:book){
          System.out.println(b.getTitle());
        }
        System.out.println("enter the book id to remove ");
        int bId=s.nextInt();
        for(Book b:book){
          if(b.getBook_id()==bId){
            book.remove(b);
          }
        }
        System.out.println("after removing books the left out books are:");
        for(book b.book){
          System.out.println(b.getTitle());
        }
      }
    public void updatePrice(){
      System.out.println("update price enter the id");
      int id=s.nextInt();
      for(Book b:book){
        if(b.getBook_id()==id){
          System.out.println("enter the updated price");
          b.setPrice(s.nextDouble());
          System.out.println("updated price of the book"+b.getTitle()+"is"b.getPrice());
break;
        }
      }
    }
    public void searchAuthor() throws BookNotFoundException{
      System.out.println("Enter author name to get book title");
      String author=s.next();
      for (Book b:book){
        if(b.getAuthor()!=author){
          throw new BookNotFoundException("there is no book");
          
        }
      }
    }
    public int choice(){
      System.out.println("1.add book");
      System.out.println("2.calculate price of all book");
      System.out.println("3.remove book");
    System.out.println("4.update book price");
      System.out.println("5.search book");
      System.out.println("enter choice");
      int opt=s.nextInt();
      return opt;
    }
    public static void main(String args[]){
      challenge1 obj=new challenge1();
      int apt;
      do{
        opt=obj.choice();
        switch(opt){
            case1:{
              obj.addBook();
              break;
            }
          case 2:{
            obj.totalPrice();
            break;
          }
             case 3:{
            obj.removeBook();
            break;
        }
           case 4:{
            obj.updatePrice();
            break;
        } 
             case 5:{
            obj.searchAuthor();
            break;
        }  
            catch(BookNotFoundException e){
               System.out.println(e);
              break;
            }
      }
    }
         case 6:{
             System.out.println("thank you");
            break;
    }
  }
  }
  while(opt!=6);
}
}

  