package reversesortedarray;

import java.util.Scanner;

public class ReverseSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci quanti numeri vuoi vuoi inserire: ");
        int N = sc.nextInt();
        int v[] = new int[N];
        
        for(int i=0;i<N;i++) {
            System.out.print("Inserisci il numero: ");
            v[i] = sc.nextInt();
        }
        
        printArray(v);
        reverseArray(v);
        printArray(v);
    }
    
    static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Elementi dell'array: ");
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }
    
    static void reverseArray(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
