
package ex1;
import java.util.*;

public class Ex1 {
    int c=0,j=0;
     int find(int arr[],int l,int num,int diff){
        for(int i=0;i<l;i++){
             j=arr[i]-num;
        }
        if(j==diff||j<diff||-j==diff||-j<diff)
             c=c+1;
//        else return -1;
System.out.println("count is "+c);
        return c;
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Ex1 e=new Ex1();
       
        System.out.println("enter a array");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter number");
         int a=sc.nextInt();
         System.out.println("enter difference");
         int b=sc.nextInt();
         int k=e.find(arr,5,a,b);
    }
    
}
