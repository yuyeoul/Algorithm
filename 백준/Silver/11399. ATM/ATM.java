import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				sum+=arr[j];
			}
		}
		System.out.println(sum);
	}

}