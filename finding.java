import java.util.Scanner;
public class finding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        int key = 10;
        int count = 0;
        for (int i=0;i<size;i++){
            if(key == array[i]){
                count++;
                break;
            }
        }
        if(count>0) System.out.println("Element exist");
        else System.out.println("Not there in the array");
    }
}