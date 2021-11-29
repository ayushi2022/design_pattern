package behavioraldp;

public class Behaviouraldemo {
	public static void main(String[] args) {
		Strategy s;
		s = new OperationAdd();
		Context c= new Context(s);
		System.out.println(c.executeStrategy(12, 45));
	}

}
