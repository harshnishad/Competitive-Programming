import java.util.*;
class QueueUsingArray{
    int front;
    int back;
    int size_q;
    static int arr[];
    QueueUsingArray(int size){
        size_q=size;
        arr= new int[size_q];
    }
    void enqueue(int element){
        if(size_q==back){
            System.out.print("queue is full");
        }
        else{
            arr[back]=element;
            back++;
        }
        
    }
    void dequeue(){
        if(size_q==back){
            System.out.print("full");
        }
        else{
            for(int i = 0 ; i < size_q-1 ; i++){
                arr[i]=arr[i+1];
            } 
            back--;
        }
    }
void display(){
    for(int i = 0 ; i < size_q ; i++){
    System.out.print(arr[i]+" ");
    }
    
}
    
}
public class Main
{
	public static void main(String[] args) {
		QueueUsingArray q1 = new QueueUsingArray(5);
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.display();
		q1.dequeue();
		q1.display();
		
	}
}
