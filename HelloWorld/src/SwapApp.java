import java.awt.Point;


public class SwapApp {
	
	public void badSwap(int var1, int var2)
	{
	  int temp = var1;
	  var1 = var2;
	  var2 = temp;
	}

	public void tricky(Point arg1, Point arg2)
	{
		  System.out.println("arg1 "+arg1+ " "+arg1.toString());
		  System.out.println("arg2 "+arg2);	 	
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	//  arg2 = temp;
	  
	 // arg2 = new Point(7,7);
	  arg2.x =9;
	  arg2.y=10;
	  System.out.println("arg1 "+arg1);
	  System.out.println("arg2 "+arg2);	 	
	}
	
	public static void main(String [] args)
	{
		SwapApp swap = new SwapApp();
	  Point pnt1 = new Point(0,0);
	  Point pnt2 = new Point(0,0);
	  System.out.println("pnt1 "+pnt1+ " "+pnt1.toString());
	  System.out.println("pnt2 "+pnt2);	  
	  swap.tricky(pnt1,pnt2);
	  System.out.println("pnt1 "+pnt1);
	  System.out.println("pnt2 "+pnt2);	  
	}


}
