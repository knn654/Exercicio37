import java.util.concurrent.Semaphore;

public class Main {
	
	public static Semaphore semaforo;
	
	public static void main(String[] args) {
		int maxCarro = 1;
		semaforo = new Semaphore(maxCarro);
		Thread comecar = new Threads(semaforo);
		comecar.start();
			

	}
}
