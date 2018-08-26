import java.util.*;
public class assignment_3_4{

    public static void main(String[] args){
      Scanner obj = new Scanner(System.in);
       
        int num=obj.nextInt();
        int sum=0,a;
        int copy=num;

        while(num!=0){
            a=num%10;
            num=num/10;

            sum=sum+a*a*a;

        }
        num=copy;

        if(sum==copy)
            System.out.println(num+" is an Armstrong Number");
            else
            System.out.println("Not an Armstrong Number !");



    }
}