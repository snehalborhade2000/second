package array_opall;
import java.util.Arrays;


public class specifirdele_in_array_binarysearch {
 public static void main(String[]arg){
	 int arr[]={1,2,3,4,56};
	 Arrays.sort(arr);
	 System.out.println("array sort"+arr);
	 int intkey=2;
	 System.out.println(intkey+"found at index="+Arrays.binarySearch(arr,intkey));
	 
	 
 }
}
