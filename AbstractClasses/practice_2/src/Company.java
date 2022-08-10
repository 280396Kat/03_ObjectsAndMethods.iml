

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private List<Employee> salaryList = new ArrayList<>();

    public int getIncome() {
        int income = 0;
        for (Employee e : salaryList) {
            if (e instanceof Manager) income += ((Manager) e).getIncomeForCompany();
        }
        return income;
    }

    public List<Employee> getSalaryList() {
        return new ArrayList<>(salaryList);
    }

    public void hire(Employee employee) {
        salaryList.add(employee);
    }

    public void hireAll(List<Employee> newEmployees) {
        for (Employee employee : newEmployees) {
            hire(employee);
        }

    }
        public void fire(Employee employee){
            salaryList.remove(employee);
        }


        public List<Employee> getTopSalaryStaff (int count){
            Collections.sort(salaryList);
            Collections.reverse(salaryList);
            return salaryList.subList(0, count);
        }

        List<Employee> getLowestSalaryStaff (int count){
            Collections.sort(salaryList);
            return salaryList.subList(0, count);

        }
    }






