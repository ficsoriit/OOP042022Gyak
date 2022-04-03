package teglalap;

public class RunTeglalap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teglalap a = new Teglalap(10,20);
		Teglalap b = new Teglalap(10);
		Teglalap c = a;
		Teglalap d = new Teglalap(10,20);

		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);

		System.out.println(a==b);
		System.out.println(a==c);

		if (a.teruletOsszehasonlito(b)) {
			System.out.println("az a teglalap nagyobb");
		} else {
			System.out.println("a b teglalap nagyobb");
		}

		if (a.egybevago(d)) {
			System.out.println("a teglalapok egybev�g�ak");
		} else {
			System.out.println("a teglalapok nem egybev�g�ak");
		}
	}
}
