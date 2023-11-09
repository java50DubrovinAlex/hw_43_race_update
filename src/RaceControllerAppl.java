import java.util.stream.IntStream;

public class RaceControllerAppl {
	
	
	private static final int N_RACERS = 10;
	private static final int DISTANCE = 1000;

	public static void main(String[] args) throws InterruptedException {
		
		Race race = new Race(N_RACERS, DISTANCE);
		Racer [] racers = new Racer[N_RACERS];
		System.out.println("place"+ "   " + "racer number"+ "   " + "time");
		
		for(int i = 0; i < N_RACERS;i++) {
			racers[i] = new Racer(race, i + 1);
		}
		
			for(int i = 0; i < race.numbersOfRacer; i++) {
				racers[i].start();
			}
			for(int i = 0; i < race.numbersOfRacer;i++) {
				racers[i].join();
				
			}
			for(int i = 0; i < N_RACERS;i++) {
				String[]parts = race.results.get(i).split("#");
				System.out.printf("%s          %s          %s\n", i + 1, parts[0], parts[1]);
			}
		}
		
	}



