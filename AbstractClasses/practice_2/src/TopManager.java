
public class TopManager implements Employee {

    int salary = 80000 + (int) (Math.random() * 20000);
    private Company company;

    public TopManager(Company company) {
        this.company = company;

    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10000000) {
            return salary + (int) (1.5 * salary);
        }
        return salary;

    }
}


