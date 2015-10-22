package person.psymatic;

import java.text.MessageFormat;
import java.time.Duration;

/**
 * Created by psymatic on 22.10.15.
 */
public class Experiment {
    String name;
    String description;
    Duration duration;

    public Experiment(String name, String description, Duration duration) {
        this.name = name;
        this.description = description;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return MessageFormat.format("Эксперимент \"{0}\"\n{1}\nДлительность:{2}",name,description,duration);
    }
}
