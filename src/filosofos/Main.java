package filosofos;

public class Main {

	public static void main(String[] args) {

		filosofo[] arrayFilosofo = new filosofo[5];
		tenedor[] arrayTenedores = new tenedor[5];
		for (int i = 0; i < 5; i++) {
			arrayTenedores[i] = new tenedor(i);
		}

		for (int i = 0; i < 5; i++) {
			arrayFilosofo[i] = new filosofo(i, arrayTenedores[i], arrayTenedores[(i + 1) % 5]);
			arrayFilosofo[i].start();
		}
	}
}