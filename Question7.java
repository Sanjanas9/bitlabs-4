import java.util.Arrays;

class Question7{
  public static void main(String args[]){
    int[]A={23,77,86,67,90};
    int target=67;
    int index=Arrays.binarySearch(A,target);
    if(index>=0){
    System.out.println(target+"is present in"+index+"index position");
   if(isPrime(target)){
     System.out.println("and it is prime number");
   }
  else{
    
        System.out.println("and it is not prime number");
  }
      else{
        System.out.println(target+"is not a prime num");
    }
    
  public static boolean isPrime(int n){
    if(n<+1){
    return false;
    }
  }
  for(int i=2;i<+Math.sqrt(n);i++){
  if(n%i==0){
    return false;
  }
  }
return true;
  }
  }
