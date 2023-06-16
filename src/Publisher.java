import java.util.List;

public interface Publisher {
    void registerObserver(Observer user);
    void removeObserver(Observer user);

    void sendOffer(List<Vacancy> vacancyList);
}
