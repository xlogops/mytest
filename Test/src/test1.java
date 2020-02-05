
public class test1 {
	static int  a =0;
	public void add() {
		a=a+5;
	}
	public static void main(String[] args) {
		test1 t = new test1();
		t.add();
		System.out.println(a);
	}
}
