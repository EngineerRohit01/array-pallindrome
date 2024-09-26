import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }

        boolean ispallin = pallin(arr);
        if (ispallin) {
            System.out.println("Your array is a palindrome");
        } else {
            System.out.println("Your array is not a palindrome");
        }
    }

    public static boolean pallin(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;  
            }
            i++;
        }
        return true;  
    }
}
