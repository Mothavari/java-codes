import java.util.Scanner;
public class h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int[] hash = new int[10];
        for(int i=0;i<size;i++){
            hash[array[i]]++;
        }
        for(int i=0;i<10;i++){
            System.out.println(i+" - "+hash[i]);
        }
    }
}
