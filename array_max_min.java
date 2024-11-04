import java.util.Scanner;
public class array_max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
		int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers from range 0 to 100: ");
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

        int max1=-1;
        int min1=1000;

        for(int i : a){
            if(i>max1 && i!=max){
                max1=i;
            }
            if(i<min1 && i!=min){
                min1=i;
            }
        }
        
        System.out.println("First Max: " + max);
        System.out.println("First Min: " + min);
        System.out.println("Second Max: " + max1);
        System.out.println("Second Min: " + min1);
    }
}