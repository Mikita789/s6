import java.util.ArrayList;
import java.util.List;

public class JobAgency implements  Publisher {
    List<Observer> subscriber = new ArrayList<>();

    public void registerObserver(Observer user){
        subscriber.add(user);
    }

    public void removeObserver(Observer user){
        subscriber.remove(user);
    }

    public void sendOffer(List<Vacancy> vacancyList){
        for (Vacancy v : vacancyList){
            for (Observer sub : subscriber){
                sub.reciveOffer(v);
            }
        }
    }

}
