
public class TestConstructor {

	TestConstructor(int i){
		
	}
}

class TestConstructorSub extends TestConstructor{

	TestConstructorSub(int i) {
		super(10);
		// TODO Auto-generated constructor stub
	}
	
	TestConstructorSub(){
		this(10);
	}
	
}
