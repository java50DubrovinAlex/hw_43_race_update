import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Race {
	int numbersOfRacer;
	int distance;
	Instant start = Instant.now();
	int racerNumber;
	ArrayList<String> results = new ArrayList<>(numbersOfRacer);
	public void setRacerNumber(int racerNumber) {
		this.racerNumber = racerNumber;
	}

	public Race(int numbersOfRacer,  int distance) {
		this.numbersOfRacer = numbersOfRacer;
		this.distance = distance;
	}
	
	public  void finish(int racerNumber, Instant finish) {
		long raceTime = ChronoUnit.MILLIS.between(start, finish);
		
		String racerRes =""+ racerNumber+ "#" + raceTime;
		results.add(racerRes);
		
	}
	
}
