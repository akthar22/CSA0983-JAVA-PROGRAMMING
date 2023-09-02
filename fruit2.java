import java.util.*;
import java.io.*;
class fruit2{
  public static void main(String[] args) {
	apple o4=new apple();
	mango o2=new mango();

	o4.d1();
	o2.d3();
	o4.d5();
	
  }
}
class fruit {
	Scanner s=new Scanner(System.in);
	public void d1(){    
	System.out.println(" total no of apple:  4 ");
	
}
}

class mango extends fruit{
	public void d3(){    
	System.out.println(" no of mango: 6");
	
}  
}

class  apple extends fruit{
	public void d5(){    
	System.out.println("total no of fruit:  10 ");
	
}  
}