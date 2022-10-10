import java.util.*;
public class string_first_letter_capital{
	public static void main(String[] args) {
		System.out.print("Enter String here : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		for ( int i = 0 ; i < arr.length ; i++  ){
			char ch = arr[i].charAt(0);
			String str1 = String.valueOf(ch).toUpperCase();
			String str2 = arr[i].substring(1);
			System.out.print(str1+str2+" "); 
		}
	}
}
