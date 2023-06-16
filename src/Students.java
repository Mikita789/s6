import java.util.Random;

public class Students implements Observer{
    private String name;
    private Double minSalary;
    private Random rd = new Random();

    private VacancyType type;
    private Grade grade = Grade.INTERN;

    public Students(String name, VacancyType type) {
        this.name = name;
        this.minSalary = rd.nextDouble(5000, 60000);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s/ мин.ЗП [%.2f]/профиль [%s]", name, minSalary, type);
    }
    @Override
    public void reciveOffer(Vacancy vacancy) {
        if (type.equals(vacancy.getType()) && vacancy.getSalaryValue() >= minSalary
                && vacancy.getGrade().equals(grade)){
            System.out.println(toString());
            System.out.println("Cогласен на вакансию");
            System.out.println(vacancy.toString());
            System.out.println("********************");
        }else{
            System.out.println(toString());
            System.out.println("Не подходит на вакансию");
            System.out.println(vacancy.toString());
            System.out.println("********************");
        }

//        if (minSalary <= salary){
//            System.out.println(String.format("Студент %s идет в компанию %s на ЗП %.2f", name, companyName, salary));
//        }else{
//            System.out.println(String.format("Студент %s не пойдет в %s на ЗП %.2f. Он хочет ЗП %.2f", name, companyName, salary, minSalary));
//        }
    }


}
