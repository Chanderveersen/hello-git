import java.util.*;
public class assignment_3_7{


    public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int num=obj.nextInt();

        int arr[]={1,4,6,7,8,9,10};
        int beg=0,last=6;
        int mid=(beg+last)/2;
        boolean found=false;
        
       while(beg<=last){
        if(arr[mid]==num){
           found=true;
           break;
        }
        else if(arr[mid]<num)
               beg=mid+1;
               else
               last=mid-1;

           mid=(last+beg)/2;

       }

       if(found==true)
           System.out.println("YES");
       else
            System.out.println("NO");

         }

    }
