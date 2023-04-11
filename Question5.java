import java.util.Scanner;
public class Question5{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the string of 0's and 1's");
    String D=scanner.next();
    int zeros=0,ones=0;
    for(int i=0;i<D.length();i++){
      if(D.charAt(i)=='0'){
        zeros++;
      }
      else{
        ones++;
          
      }
    }
    if(zeros==1||ones==1){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
}