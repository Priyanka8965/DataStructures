import java.util.Scanner;

class loops{
  public static void main(String[]args){
    //for loop
    // for( int num = 1; num <= 10; num+= 2)
    // System.out.println(num);
    // }
  // }
  // Scanner sc= new Scanner(System.in);
  // int n = sc.nextInt();
  // for(int num = 1; num <= n; num++ )
  // System.out.println(num);
  


  // while loop
  // int num = 2;
  // while(num <= 9){
  //   System.out.println(num);
  //   num += 1;
  // }


  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();

  //find the largest of three numbers

  // int max = a;
  // if(b > max){
  //   max = b;
  // }
  // if (c > max){
  //   max = c;
  // }
////////////////////////////////////////////////////OR
  int  max = Math.max(c, (Math.max(a,b)));
  System.out.println(max);
  }
}