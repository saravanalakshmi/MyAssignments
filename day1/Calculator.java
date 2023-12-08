package week1.day1;

public class Calculator {
private void add(int a,int b) {
System.out.println(a+b);
}
private void sub(float a,long b) {
System.out.println(a-b);
}
private void mul(double a,int b) {
System.out.println(a*b);
}
private void div(int a,int b) {
System.out.println(a/b);
}

public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(9,7);
		cal.sub(5.5f, 555555l);
		cal.mul(22.55d,9);
		cal.div(6, 5);
		
	}

}
