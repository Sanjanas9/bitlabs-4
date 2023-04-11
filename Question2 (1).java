import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Dictionary{
  private Map<String,String>dictonary;
  public Dictionary(){
    dictonary=new HashMap<>();
  }
  public void addWordDefinition(String word,String def){
    if (dictonary.containsKey(word)){
      System.out.println("error it already exist in dictionary.");
    }
    else{
      dictionary.put(word,def);
      System.out.println("word with its def need to added in dictionary");
    } 
  }
  public void viewDefinintion(String word){
    if(dictionary.containsKey(word)){
      System.out.println("def:"+dictonary.get(word));
    }
    else{
      System.out.println("word is not in dictionary error!!!");
    }
  }
  public int getNumberOfWords(){
    return dictionary.size();
  }
  public void searchWords(String pre){
    System.out.println("matching words prefix"+pre+":");
    int count=0;
    for(String word:dictionary.keySet()){
      if(word.startsWith(pre)){
        System.out.println(word);
        count++;
      }
    }
    if(count==0){
      System.out.println("no words")
    }
  }
  public static void main(String[] args){
    Dictionary dictionary=new Dictionary();
    Scanner scanner=new Scanner(System.in);
      int choice;
do{
  System.out.println("MENU:");
   System.out.println("1.Add word and definition");
   System.out.println("2.View definition");
   System.out.println("3.Number of words");
   System.out.println("4.Search words");
  System.out.println("5.exit");
  System.out.println("Enter your choice:");
  choice=scanner.nextInt();
  scanner.nextLine();

  switch(choice)
    {
      case1:{
        System.out.print("enter word");
      String word=scanner.nextLine();
      System.out.println("enter definition");
      String definition=scanner.nextLine();
      dictionary.addWordDefinition(word, def);
      break;
      }
      case2:{
      System.out.print("Enter word:");
      word=scanner.nextLine();
      dictionary.viewDefinition(word);
      break;
      }
      case3:{
      System.out.print("number of words:"+dictionary.getNumberOfWords());
      break;
      }
      case4:{
      System.out.print("Enter pre");
      String pre=scanner.nextLine();
      dictionary.searchWords(pre);
      break;
      }
      case5:{
      System.out.println("Exit");
      break;
      }
  }
}
  while(choice!=5);
    scanner.close();
    
  }
}"
}