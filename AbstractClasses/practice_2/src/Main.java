
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printlnSalaryLists(Company company) {

        List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
        System.out.println("----------------------------------------");
        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(30);
        for (Employee e : lowestSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
    }

    public static void main(String[] args) {
        Company company = new Company();

        List<Employee> operators = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            operators.add(new Operator());
        }

        company.hireAll(operators);
        System.out.println("Наняли 180 операторов.");

        List<Employee> managers = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            managers.add(new Manager());
        }
        company.hireAll(managers);
        System.out.println("Наняли 80 менеджеров.");

        List<Employee> topManagers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topManagers.add(new TopManager(company));
        }
        company.hireAll(topManagers);
        System.out.println("Наняли 10 топменеджеров");

        System.out.println("Доход компании за месяц составил: " + company.getIncome() + "\n");
        printlnSalaryLists(company);
        System.out.println();
        System.out.println("Количество сотрудников: " + company.getSalaryList().size());
        int halfEmployees = company.getSalaryList().size() / 2;
        List<Employee> employees = company.getSalaryList();
        for (int i = 0; i < halfEmployees; i++) {
            company.fire(employees.get(i));
        }
        System.out.println("Уволили 50% сотрудников (операторы)");
        System.out.println("Количество сотрудников: " + company.getSalaryList().size());
        System.out.println();
        printlnSalaryLists(company);

    }
}
