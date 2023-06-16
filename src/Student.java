public class Student extends BasicEmployee{
    public Student(String name, VacancyType type) {
        super(name, type, Grade.INTERN);
        setMinSalary(rd.nextDouble(5000,60000));
    }

}
