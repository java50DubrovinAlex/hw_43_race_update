import java.time.Instant;
import java.time.temporal.ChronoUnit;

public  class Racer extends Thread{
		private Race race;
		private int racerNumber;
		static int sleepMin = 2;
		static int sleepMax = 5;
		Instant finish;
		int counter;
		public Racer(Race race, int racerNumber) {
			this.race = race;
			this.racerNumber = racerNumber;
			
		}
		public static int sleepTimer() {
			return (int) (Math.random() * (sleepMax - sleepMin + 1) + sleepMin);
		}
		@Override
		public void run() {
			for(int i = 0; i < race.distance;i++) {
				try {
					
					sleep(sleepTimer());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				counter++;
			}
			
			synchronized (race) {
				Instant finish = Instant.now();
				race.setRacerNumber(racerNumber);
				race.finish(racerNumber, finish);
			}
			
		}
	
}
