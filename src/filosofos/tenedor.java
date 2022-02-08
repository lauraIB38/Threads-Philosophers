package filosofos;

public class tenedor {

	private int idTenedor;
	boolean libre;

	public tenedor(int idTenedor) {
		super();
		this.idTenedor = idTenedor;
		this.libre = true;
	}

	public synchronized void cogerTenedor(int id) {

		while (!libre) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("El filosofo " + id + " ha cogido el tenedor " + idTenedor);
		libre = false;

	}

	public synchronized void soltarTenedor() {
		libre = true;
		notify();

	}

	public int getIdTenedor() {
		return idTenedor;
	}

	public void setIdTenedor(int idTenedor) {
		this.idTenedor = idTenedor;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

}
