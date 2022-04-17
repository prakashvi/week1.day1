package week1.days2;

public class Assignment4 {
public static void main(String[] args) {
	Assignment4 obj = new Assignment4 ();
	int addition1 = obj.addition();
	System.out.println(addition1);
	int subtraction = obj.subtraction();
	System.out.println(subtraction);
	int multiple = obj.multiple();
	System.out.println(multiple);
	
}

public int addition() {
	int a = 1;
	int b =2;
	int c = 3;
	return (a+b+c);
	
}
public int subtraction() {
	int a =1;
	int b = 2;
	return (a-b);
}
public int multiple() {
	int a =2;
	int b =2;
	return (a*b);
}
}
