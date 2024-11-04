
import java.util.Scanner;
public class XOR_CAL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number "); 
         int n=sc.nextInt();
          if(n%4==1) System.out.println(1);
          if(n%4==2) System.out.println(n=1);
          if(n%4==3) System.out.println(0);
          if(n%4==0) System.out.println(n);
    }

}