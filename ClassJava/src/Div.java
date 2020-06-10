
public class Div {
  private int a1,b1;// private data, for security, we check and send, we use getter and setter as public method for this 
  Div(int x,int y)// constructor is called when object is created, its parameterised constructors
  {
	  a1=x;
	  b1=y;
  }
  public int division()
  {
	  return a1/b1;
  }
  
}
