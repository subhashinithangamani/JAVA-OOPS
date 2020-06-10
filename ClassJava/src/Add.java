
public class Add {
	private int a,b;//private variable 
	Add(int x,int y){// Add is a constructor, has no return type, and same class name
		a = x;//setting(writing) value a, and b. so act as setter.
		b = y;
	}
	public int addition() {// this method act as getter(getting value), because this get the a and b then sum and send us.
			return a+b;
	}
}
