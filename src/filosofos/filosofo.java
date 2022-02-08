package filosofos;

public class filosofo extends Thread {

	private int idFilosofo;
	tenedor tenedorD;
	tenedor tenedorI;

	public filosofo(int id, tenedor tenedorI, tenedor tenedorD) {
		this.idFilosofo = id;
		this.tenedorD = tenedorD;
		this.tenedorI = tenedorI;

	}

	@Override
	public void run() {
		
			if (idFilosofo % 2 == 0) {
				tenedorD.cogerTenedor(idFilosofo);
				tenedorI.cogerTenedor(idFilosofo);
			} else {
				tenedorI.cogerTenedor(idFilosofo);
				tenedorD.cogerTenedor(idFilosofo);
			}
			System.out.println("El filosofo " + idFilosofo + " esta comiendo");

			tenedorD.soltarTenedor();
			tenedorI.soltarTenedor();
			System.out.println(
					"El filosofo " + idFilosofo + " ha terminado!!!!!!!!!!!!!!!!!");
		
	}

	public int getIdFilosofo() {
		return idFilosofo;
	}

	public void setIdFilosofo(int idFilosofo) {
		this.idFilosofo = idFilosofo;
	}

	public tenedor getTenedorD() {
		return tenedorD;
	}

	public void setTenedorD(tenedor tenedorD) {
		this.tenedorD = tenedorD;
	}

	public tenedor getTenedorI() {
		return tenedorI;
	}

	public void setTenedorI(tenedor tenedorI) {
		this.tenedorI = tenedorI;
	}

}
