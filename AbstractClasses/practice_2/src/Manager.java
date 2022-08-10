

public class Manager implements Employee {

    private int salary = 50000 + (int) (Math.random() * 10000);
    private final int IncomeForCompany;

    public Manager() {
        IncomeForCompany = 115000 + (int) (Math.random() * 35000);
        salary += IncomeForCompany * 0.05;
    }


    @Override
    public int getMonthSalary() {
        return salary;
    }

    public int getIncomeForCompany() {
        return IncomeForCompany;
    }
}
