package hasab.futtat;

import hasab.Hasab;
import hasab.Henger;
import hasab.Teglatest;

public class HasabTeszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hasab h = new Hasab(15); --- Ez hibás!!
		
		Henger henger = new Henger(10, 10);
		System.out.println(henger);
		Teglatest tegla = new Teglatest(10,10,10);
		System.out.println(tegla);
		if (henger.nagyobbE(tegla)) {
			System.out.println("A henger térfogata nagyobb");
		} else {
			System.out.println("A teglatest térfogata nagyobb");
		}
		
	}

}
