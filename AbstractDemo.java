abstract class Student{
	
	public Student(){
		this.sleep();
	}
	
	//abstract final void study();
	abstract void study();
	void sleep(){
		System.out.println("躺着");
		
	}
}

class chongciStudent extends Student{
	@Override
	void study(){
		System.out.println("chongci study !!");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//new Student();
		(new chongciStudent()).study();
	}
}