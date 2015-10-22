package person.psymatic;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
	    Experiment myExperiment = new Experiment("Эксперимент 1", "Проверка знаний по java", Duration.ofMinutes(80));
        System.out.println(myExperiment);
    }
}

