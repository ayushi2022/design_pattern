package behavioraldp;

public class Context {
    Strategy s;
    public Context(Strategy s)
    {
    	super();
    	this.s=s;
    }
    public int executeStrategy(int num1,int num2) {
    	return s.doOperation(num1, num2);
    }
}
