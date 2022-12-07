import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr1,arr2,arr3;
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array1: ");
        int sizeArr1 = scanner.nextInt();
        arr1 = new int [sizeArr1];

        for (i = 0; i < sizeArr1 ;i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter length of array2: ");
        int sizeArr2 = scanner.nextInt();
        arr2 = new int [sizeArr2];

        for (i = 0; i < sizeArr2 ;i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr2[i] = scanner.nextInt();
        }

        System.out.print("Property list 1: ");
        for (j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }

        System.out.print("\nProperty list 2: ");
        for (j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }

        int sizeArr3 = sizeArr1 + sizeArr2;
        arr3 = new int [sizeArr3];

        int pos = 0;
        for (int element : arr1) {
            arr3[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            arr3[pos] = element;
            pos++;
        }

        System.out.print("\nProperty list 3: ");
        for (j = 0; j < sizeArr3; j++) {
            System.out.print(arr3[j] + "\t");
        }
    }
}