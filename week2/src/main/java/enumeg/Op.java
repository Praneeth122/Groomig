package enumeg;

public enum Op {
	ADD1(1,2),
	ADD2(2,3);
	int num1;
	int num2;
	
	private Op(int i, int j) {
		this.num1=i;
		this.num2=j;
		System.out.println(this.toString());
	}
	
	public int print() {
		return this.num1+this.num2;
	}
	
	   public static void main(String[] args) {
		      Op openum1 = ADD1;
		      System.out.println(openum1.print());
		      Op openum2 = ADD2;
		      System.out.println(openum2.print());
		   }
}
