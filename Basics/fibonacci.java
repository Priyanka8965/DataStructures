import java.util.Scanner;
public class fibonacci {

  //SUM OF PREVIOUS TWO NUMBERS IS NEXT IN THE SERIES
  public static void main(String[]args){
    //while loop
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int p = 0;  //previous
    int i = 1;  //initial
    int count = 2;

    while(count <= n){
      int temp = i;   //to store initial value of i
      i = i+p;
      p = temp;       //to change previous value to i
      count++;

      System.out.println(i);
    }
    
    sc.close();

  }
}
