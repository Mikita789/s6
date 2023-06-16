import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Master extends BasicEmployee implements Observer{

    public Master(String name, VacancyType type, Grade grade) {
        super(name, type, grade);
    }
}
