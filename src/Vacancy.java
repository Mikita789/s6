import java.util.Random;

public class Vacancy {
    private String companyName;
    private VacancyType type;
    private Double salaryValue;
    private Double minSalaryValue = 20000.0;

    public Grade getGrade() {
        return grade;
    }

    private Grade grade;

    private Random rd = new Random();

    public String getCompanyName() {
        return companyName;
    }

    public VacancyType getType() {
        return type;
    }

    public Double getSalaryValue() {
        return salaryValue;
    }

    @Override
    public String toString() {
        return String.format("В компанию %s/ЗП[%.2f]/профиль[%s]/грейд [%s]", companyName, salaryValue, type,grade);
    }

    public Vacancy(String companyName, VacancyType type, Grade grade) {
        this.companyName = companyName;
        this.type = type;
        this.salaryValue = salaryValue;
        this.grade = grade;
        switch (type){
            case IT -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 4, minSalaryValue * 10);
            }
            case WORKER -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 3.5, minSalaryValue * 6);
            }
            case SERVICE -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 3, minSalaryValue * 4);
            }
            case FINANCE -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 3, minSalaryValue * 12);
            }
            case OTHER -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 2, minSalaryValue * 10);
            }
            case DESIGN -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 3.5, minSalaryValue * 8);
            }
            case MARKETING -> {
                this.salaryValue = rd.nextDouble(minSalaryValue * 3.5, minSalaryValue * 7);
            }
        }
    }
}
