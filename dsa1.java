import java.util.Scanner;

class dsa1 {

  //if else scanner
  public static void main(String[] args) {
    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    System.out.print("a =");
    a =sc.nextInt();
    System.out.print("b =");
    b = sc.nextInt();
    // if(a>b){
    //   System.out.println(a);
    // }
    // else{
    //   System.out.println(b);
    // }
    System.out.println(Math.max(a,b));
    sc.close();
  }

}

