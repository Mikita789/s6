import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class BasicEmployee implements Observer {
    protected String name;

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    protected Double minSalary;

    public String getName() {
        return name;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public VacancyType getType() {
        return type;
    }

    public Grade getGrade() {
        return grade;
    }

    protected VacancyType type;
    protected Grade grade;
    protected Random rd = new Random();

    public BasicEmployee(String name, VacancyType type, Grade grade) {
        this.name = name;
        this.minSalary = rd.nextDouble(60000, 200000);
        this.type = type;
        this.grade = grade;
    }

    public String toString() {
        return String.format("%s/ мин.ЗП [%.2f]/профиль [%s]/ грейд [%s]", name, minSalary, type, grade);
    }
    public void reciveOffer(Vacancy vacancy) {
        if (type.equals(vacancy.getType()) && vacancy.getSalaryValue() >= minSalary){
            if (gradeArr(this.grade).contains(vacancy.getGrade().toString())){
                System.out.println(toString());
                System.out.println("Cогласен на вакансию");
                System.out.println(vacancy.toString());
                System.out.println("********************");
            }else{
                System.out.println(toString());
                System.out.println("Не подходит на вакансию. Низкий грейд.");
                System.out.println(vacancy.toString());
                System.out.println("********************");
            }
        }else{
            System.out.println(toString());
            System.out.println("Не подходит на вакансию по ЗП/Профилю");
            System.out.println(vacancy.toString());
            System.out.println("********************");
        }
    }

    private List<String> gradeArr(Grade grade){
        switch (grade) {
            case INTERN -> {
                List<String> arr = new ArrayList<>();
                arr.add("INTERN");
                return arr;
            }
            case JUNIOR -> {
                List<String> arr = new ArrayList<>();
                arr.add("INTERN");
                arr.add("JUNIOR");
                return arr;
            }
            case MIDDLE -> {
                List<String> arr = new ArrayList<>();
                arr.add("INTERN");
                arr.add("JUNIOR");
                arr.add("MIDDLE");
                return arr;
            }
            case SENIOR -> {
                List<String> arr = new ArrayList<>();
                arr.add("INTERN");
                arr.add("JUNIOR");
                arr.add("MIDDLE");
                arr.add("SENIOR");
                return arr;
            }
        }
        return null;
    }
}
