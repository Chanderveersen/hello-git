import java.util.*;
public class assignment_3_3{

   public static void isPrime(int num){
         int i=2,flag=0;

        while(i<(num))
        {
            if(num%i==0){
                flag=1;
                break;
            }
            else{
                flag=0;
            }
            i++;
        }

        if(flag==0)
            System.out.println(" "+i);

    }

        public static void main(String args[]){
       Scanner obj = new Scanner(System.in);
            
            int N = obj.nextInt();
              int j;
           for(j=2;j<=N;j++)
                isPrime(j);
            }
}