import java.util.*;

 class Maximum {
String n1,n2;
Maximum(String x,String y) {
n1=x;
n2=y;
}

void compare() {
	if(Integer.parseInt(n1)>Integer.parseInt(n2)) {
		System.out.println("n1 is Bigger");
	}
	else {
		System.out.println("n2 is Bigger");
	}
}
}
public class assignment_7_3{

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

String a=s.next();
String b=s.next();
		
Maximum m=new Maximum(a,b);
	m.compare();
	}
}