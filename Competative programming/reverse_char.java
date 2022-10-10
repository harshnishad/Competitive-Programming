import java.util.*;
public class reverse_char  {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stb = new StringBuilder(str);
        for(int i = 0 ; i<stb.length()/2 ; i++){
            int front = i ; /* 0,1,2 */
            int back = stb.length() -1 -i; /*3,4*/
            
            char ch_f = stb.charAt(front);
            char ch_b = stb.charAt(back);
            
            stb.setCharAt(front ,ch_b);
            stb.setCharAt(back,ch_f);
    
        }
        
        System.out.print(stb);
}
}