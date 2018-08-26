import java.util.*;
public class assignment_3_2 {

    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
        int num= obj.nextInt();
        int i;

        for(i=0;i<=num;i++)
        {
            if(i%2==0)
                System.out.println(" "+i);
        }
    }
      
}