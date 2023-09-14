package InheritancePackage;

public class SingleInheritChild extends SingleInhertParent {
	public void child_Print()
	{
	System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritChild c = new SingleInheritChild();
		c.child_Print();
		c.pritn01();//can invoke parent class method using child class object 

	}

}
