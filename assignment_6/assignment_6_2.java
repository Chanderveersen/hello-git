class Temp {

Temp() {
System.out.println("default constructor");
}

Temp(int x) {
this();
System.out.println("value of x in parameterized constructor : " + x);
}
}

public class assignment_6_2 {

public static void main(String args[]) {
new Temp(5);
}
}