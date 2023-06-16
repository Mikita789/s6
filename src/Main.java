// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JobAgency ja = new JobAgency();

        //компании
        Company gb = new Company("GeekBrains", ja);
        Company ab = new Company("Alfa-Bank", ja);
        Company ya = new Company("Yandex", ja);
        //сотрудники
        Students st1 = new Students("Ivan", VacancyType.IT);
        Students st2 = new Students("Petr", VacancyType.DESIGN);
        Master m1 = new Master("Kirill", VacancyType.FINANCE, Grade.MIDDLE);
        Master m2 = new Master("Pavel", VacancyType.MARKETING, Grade.SENIOR);
        TemporaryWorker t1 = new TemporaryWorker("Vlad", VacancyType.OTHER, Grade.MIDDLE);

        //пописываем сотрудников под рассылку
        ja.registerObserver(st1);
        ja.registerObserver(st2);
        ja.registerObserver(m1);
        ja.registerObserver(m2);
        ja.registerObserver(t1);
        //создаем вакансии
        gb.addVacancy(new Vacancy(gb.getTitle(), VacancyType.IT, Grade.MIDDLE));
        gb.addVacancy(new Vacancy(gb.getTitle(), VacancyType.DESIGN, Grade.MIDDLE));
        gb.addVacancy(new Vacancy(gb.getTitle(), VacancyType.SERVICE, Grade.MIDDLE));

        ab.addVacancy(new Vacancy(ab.getTitle(), VacancyType.FINANCE, Grade.MIDDLE));

        ya.addVacancy(new Vacancy(ya.getTitle(), VacancyType.IT, Grade.MIDDLE));
        //запрашиваем кандидатов
        gb.needEmployee();
        System.out.println("--------------------------------------");
        ab.needEmployee();
        System.out.println("--------------------------------------");
        ya.needEmployee();

    }
}