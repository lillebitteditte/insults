import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class insultGenerator {

    public class Main {


    }
    static ArrayList <String> insults = new ArrayList<String>();
    private Random random;

    insults.add()


    public insultGenerator(List<String> insults) {
        this.random = new Random();
    }

    public insultDTO generateInsult(){
        int randomIndex = random.nextInt(insults.size());
        String randomInsult = insults.get(randomIndex);
        return new insultDTO(randomInsult);
    }

}
