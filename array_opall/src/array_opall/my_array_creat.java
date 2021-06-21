package array_opall;
import java.util.Scanner;
import java.util.Arrays;

public class my_array_creat {
public static void main(String[]arg){
	int[]arr=new int[5];
	Scanner scanner= new Scanner(System.in);
	for(int i=0;i<5;i++){
		System.out.print("enter the ele");
		arr[i]=scanner.nextInt();
		System.out.println();
	}
	System.out.println("printing array");
	for(int i=0;i<5;i++){
		System.out.print("arr"+arr[i]);
		System.out.println();
	}
}
}
