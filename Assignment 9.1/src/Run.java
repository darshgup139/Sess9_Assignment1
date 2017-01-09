import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List<HDTV> listHDTV = new ArrayList<HDTV>();
		HDTV h1 = new HDTV("Samsung", 40);
		HDTV h2 = new HDTV("Micromax", 45);
		HDTV h3 = new HDTV("Sony", 50);
		listHDTV.add(h1);
		listHDTV.add(h2);
		listHDTV.add(h3);

		Collections.sort(listHDTV, new TvComparator());
		for (HDTV a : listHDTV)
			System.out.println(a);
	}
}

/*
******************************************************************************
Output:
HDTV [Brand Name=Sony, Size(in inches)=50]
HDTV [Brand Name=Micromax, Size(in inches)=45]
HDTV [Brand Name=Samsung, Size(in inches)=40]
******************************************************************************
*/