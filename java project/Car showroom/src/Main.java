
public class Main {

	public static void main(String[] args) {
		Showroom obj = new Showroom();
        Thread t1 = new Thread(obj);
        t1.start();

	}

}
