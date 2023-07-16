package timeequ;

import java.util.Scanner;

public class TimeEqu {
	public static int timeequ(int arr[]) {
		int size = arr.length;
		int maxi = Integer.MIN_VALUE;
		int a = 0;
		for(int i=0; i<size; i++) {
			if(arr[i]>maxi) {
				maxi = arr[i];
			}
		}
		for (int i=0; i<size; i++) {
			a = a+(maxi-arr[i]);
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int value = timeequ(arr);
		System.out.println(value);

	}

}
