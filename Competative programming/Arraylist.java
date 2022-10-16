import java.util.ArrayList;
import java.util.Collections; //Collection
class Main{
public static void main(String[] args){
     ArrayList<Integer> lst= new ArrayList<>();
     
     //add element
    lst.add(0);
    lst.add(2);
    lst.add(3);
    System.out.println(lst);
    
    //get 
   int element = lst.get(0);
   System.out.print(element);
   
   // add element in b/w
   lst.add(1,1);
   System.out.print(lst);
   
   //set element
   lst.set(0,5);
   System.out.print(lst);
  
   //dellete element
   lst.remove(3);
   System.out.print(lst);
   
   //size 
   
   int size = lst.size();
   System.out.println(size);
   
   //loops
   for(int i = 0 ; i <lst.size() ;i++){
       System.out.print(lst.get(i));
   }
   
   //sort 
   Collections.sort(lst);
   System.out.print(lst);
}
}
