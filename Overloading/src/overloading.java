
public class overloading {
	public void test(){
		System.out.println("This method have no argument");
	}
	
	public void test(int a){
		System.out.println("This method have an argument with type of data integer and the value of that argument is : "+a);
	}
	public void test(String a, int b){
		System.out.println("This method have 2 arguments, that is String and integer and the values are : "+a+" and "+b);
	}
	
	public void test(Boolean a){
		if(a){
			System.out.println("This methos over here have one argument of boolean and the condition is true");
		} else{
			System.out.println("This methos over here have one argument of boolean and the condition is false");
		}
	}
}
