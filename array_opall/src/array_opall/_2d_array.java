package array_opall;
import java.util.Scanner;
import java.util.Arrays;

public class _2d_array {
	public static void main(String[]arg){
		int[][]arr=new int [3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println("Enter the ele");
				arr[i][j]=sc.nextInt();
				System.out.println();
			}
		}
		System.out.println("printing ele");
		for(int i=0;i<3;i++){
			System.out.println();
			for(int j=0;j<3;j++){
				System.out.print("array is \t"+arr[i][j]);
			}
		}
	}

}
