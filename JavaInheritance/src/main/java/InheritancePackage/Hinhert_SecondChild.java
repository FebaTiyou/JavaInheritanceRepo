package InheritancePackage;

public class Hinhert_SecondChild extends Hinhert_Parent{
	public void second_Child()
	{
	System.out.println("second child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hinhert_SecondChild s = new Hinhert_SecondChild();
		Hinhert_FirstChild f = new Hinhert_FirstChild();
		s.parent();
		f.firstChild();
		s.second_Child();

	}

}
