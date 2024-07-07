class A{

static void m1(){
	System.out.println("m1");
}

static void m(){
	m1();
	System.out.println("m");
}
	

public static void main(String[] args){
		m();
		System.out.println("end");
	}
}