
public class Operator implements Employee {

    int salary = 30000 + (int) (Math.random() * 5000);

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
