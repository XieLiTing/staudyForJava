abstract class testAbstract1{
	int i = 10;
	public void printl(){
		System.out.println("hello world!");
		i++;
	} 
	abstract public void function();
}

public class add extends testAbstract1{
	@Override
	public void function(){
		System.out.println(i);
	}
	
}

class testAbstract{
	public static void main(String[] args){
		System.out.println("hello ");
		(new add()).printl();
	}
}