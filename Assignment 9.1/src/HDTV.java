
public class HDTV {
	String brandName;
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public HDTV(String brandName, int size) {
		super();
		this.brandName = brandName;
		this.size = size;
	}

	@Override
	public String toString() {
		return "HDTV [Brand Name=" + brandName + ", Size(in inches)=" + size + "]";
	}

}
