package solidprinciples;

public class Addition implements ArthematicOperator{

	@Override
	public int eval(int a, int b) {
		return a+b;
	}
}
