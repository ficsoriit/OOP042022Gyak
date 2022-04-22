package szemelyek;

import java.util.Comparator;


public class sortBySalery2 implements Comparator<EgyetemiAlkalmazott2> {

	@Override
	public int compare(EgyetemiAlkalmazott2 o1, EgyetemiAlkalmazott2 o2) {
		// TODO Auto-generated method stub
		return o1.getFizetes() - o2.getFizetes();
	}
}
