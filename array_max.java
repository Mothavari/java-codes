import java.util.Scanner;
public class array_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
		int n=sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max=a[0],min=a[n-1];
        
        for(int i : a){
            if(i>max){
                max=i; 
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}