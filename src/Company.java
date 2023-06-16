import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {
    private String title;
    private Double maxSalary;

    public List<Vacancy> getOpenVacancy() {
        return openVacancy;
    }

    public String getTitle() {
        return title;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    private Publisher currentAgency;

    private List<Vacancy> openVacancy = new ArrayList<>();
    private Random rd = new Random();


    public void addVacancy(Vacancy vacancy){
        openVacancy.add(vacancy);
    }
    public Company(String title, Publisher currentAgency) {
        this.title = title;
        this.maxSalary = rd.nextDouble(10000, 150000);
        this.currentAgency = currentAgency;
    }

    void needEmployee(){
        currentAgency.sendOffer(openVacancy);
    }

}
