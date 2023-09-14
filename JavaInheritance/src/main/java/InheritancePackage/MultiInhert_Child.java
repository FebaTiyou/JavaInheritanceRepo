package InheritancePackage;

public class MultiInhert_Child extends MultiInhert_Sub{
	public void child()
	{
	System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInhert_Child c = new MultiInhert_Child();
		c.child();
		c.sub_child();
		c.Parent();

	}

}
