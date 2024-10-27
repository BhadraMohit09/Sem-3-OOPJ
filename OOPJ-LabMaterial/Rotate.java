import java.util.*;

public class Rotate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int temp = 0;
        System.out.println("Enter pivot index: ");
        int pivot = sc.nextInt();
        for (int j = pivot; j < n; j++) {
            arr2[temp] = arr[j];
            temp++;
        }
        for (int j = 0; j < pivot; j++) {
            arr2[temp] = arr[j];
            temp++;
        }
        System.out.println("Rotated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("Enter element to search: ");
        int e = sc.nextInt();

        int flag = 1;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (e == arr2[i]) {
                index = i;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Search done");
        } else {
            System.out.println("Search unsucessful");
        }
    }
}