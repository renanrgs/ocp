package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {
	public static void main(String[] args) {
		CyclicBarrierTest c = new CyclicBarrierTest();
		LionPenManager lionPenManager = c.new LionPenManager();

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			CyclicBarrier c1 = new CyclicBarrier(4);
			//CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("** Pen cleaned"));
			for (int i = 0; i < 3; i++) {
				service.submit(() -> lionPenManager.performTask(c1));
			}
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

	class LionPenManager {
		private void removeAnimals() {
			System.out.println("Removing animals");
		}

		private void cleanPen() {
			System.out.println("Cleaning the pen");
		}

		private void addAnimals() {
			System.out.println("Adding animals");
		}

		public void performTask(CyclicBarrier c1) {
			try {
				removeAnimals();
				c1.await();
				cleanPen();
				c1.await();
				addAnimals();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
