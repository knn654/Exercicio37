import java.util.concurrent.Semaphore;

public class Threads extends Thread {

	private Semaphore semaforo;
	public Threads(Semaphore semaforo) {
		this.semaforo = semaforo;
	}
	
	public void run() {
		try {
			semaforo.acquire();
			iniciar();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	
	
	public void iniciar() {
		esquerda();
		direita();
		cima();
		baixo();
	}
	
	public void esquerda() {
		System.out.println("O carro da esquerda está indo para a direita");
		System.out.println("Carro da esquerda chegou na direita");
	}
	
	public void direita() {
		System.out.println("O carro da direita está indo para a esquerda");
		System.out.println("Carro da direita chegou na esquerda");	
	}
	
	public void cima() {
		System.out.println("O carro de cima está indo para baixo");
		System.out.println("Carro de cima chegou embaixo");	
	}
	
	public void baixo() {
		System.out.println("O carro de baixo está indo para cima");	
		System.out.println("Carro de baixo chegou em cima");	
	}
}
