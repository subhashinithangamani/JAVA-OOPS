//import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
	    int choise;//choise is a local vaiable, used indide main() only
	    int a,b;//a and b are local variable
		Scanner ip = new Scanner(System.in);// ip is an scanner object, its a local objec, used only in main()
		System.out.println("           welcome to my calculator           ");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.exit");
		while(true) {// while parameter takes only boolean value, we run while always till used close the application throught option 5
		System.out.print("enter your choise = ");
		choise = ip.nextInt();
		System.out.println("enter a and b value");
		a = ip.nextInt();
		b = ip.nextInt();
		switch(choise)//u can use char,int,string inside switch but not float 
		{
		case 1:
			Add objAdd = new Add(a,b);
			System.out.println("addition of two number is = "+objAdd.addition());
			break;
		case 2:
			Sub objSub = new Sub();
			System.out.println("substraction of two number is = "+objSub.substraction(a, b));
			break;
		case 3:
			System.out.println("multiplication of two number is = "+a*b);
			break;
		case 4:
			Div objdiv=new Div(a,b);
			System.out.println("division of two numbers is "+ objdiv.division());
			break;
		case 5:
			System.exit(0);// hard close the application.
		default:
			System.out.println("invalid choise");
		}
		}
	}
}
