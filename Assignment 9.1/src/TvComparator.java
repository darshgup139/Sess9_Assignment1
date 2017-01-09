import java.util.Comparator;

public class TvComparator implements Comparator<HDTV> {

	@Override
	public int compare(HDTV o1, HDTV o2) {
		// TODO Auto-generated method stub
		int size1, size2;
		size1 = o1.getSize();
		size2 = o2.getSize();

		if (size1 < size2)
			return 1;
		else if (size1 > size2)
			return -1;
		else
			return 0;
	}

}
