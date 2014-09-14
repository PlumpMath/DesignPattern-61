package singleton.A2;

public class Main {

	public static void main(String[] args) {
		Triple triple[] = new Triple[4];

		for(int i = 0; i < 3; i++){
			triple[i] = Triple.getInstance(i);
			System.out.println(triple[i].getId());
		}
	}

}
