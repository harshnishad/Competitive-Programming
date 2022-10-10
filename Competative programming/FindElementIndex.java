import java.util.*;

public class FindElementIndex
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the row sige : ");
	 int row = sc.nextInt();
	 System.out.print("Enter the column sige :");
	 int column = sc.nextInt();
	 int[][] arr = new int[row][column];
	 for(int i = 0 ; i < row ; i++ ){
	     for(int j = 0 ; j <column ; j++ ){
	     System.out.print("Enter the value at index"+"["+i+"]"+"["+j+"]"+": ");
	     int data = sc.nextInt();
	     arr[i][j]=data;
	     }
	 }
	 for(int i = 0 ; i < row ; i++ ){
	     for(int j = 0 ; j <column ; j++ ){
	         System.out.print(arr[i][j]+" ");
	     }
	     System.out.println(" ");
	 }
	  System.out.print("Enter value to get index : ");
	         int check = sc.nextInt();
	 for(int i = 0 ; i < row ; i++ ){
	     for(int j = 0 ; j <column ; j++ ){
	        
	         if(arr[i][j]==check){
	             System.out.println("Element Index At " +"["+i+"]"+"["+j+"]");
	             
	         }
	     }
	 }
	}
}
