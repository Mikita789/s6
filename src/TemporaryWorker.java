import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TemporaryWorker extends BasicEmployee implements Observer{

    public TemporaryWorker(String name, VacancyType type, Grade grade) {
        super(name, type, grade);
    }

    @Override
    public String toString() {
        return String.format("WARNING! %s временный сотрудник/ мин.ЗП [%.2f]/профиль [%s]", name, minSalary, type);
    }
}
