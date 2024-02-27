public class countnum {
  public static void main(String[]args){
  int n = 773774477;
  int count = 0;
  while(n >= 0){
    int rem = n % 10; 
      if ( rem == 7){
        count++;
      }
    
    n = n / 10;
  }
  }
}
