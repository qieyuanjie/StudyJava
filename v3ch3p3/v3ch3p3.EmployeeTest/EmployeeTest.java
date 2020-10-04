import java.time.*;

/**
 * This program tests the Employee class.
 *
 * @author Cay Horstmann
 * @version 1.13 2018-04-10
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //构造一个Employee数组，并且填入3个Employee对象
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //使用raiseSalary方法提高每个员工的薪水5%
        for (Employee e : staff
        ) {
            e.raiseSalary(5);

        }

        //调用getName方法，getSalary方法和getHireDay方法打印各个员工的信息
        for (Employee e : staff
        ) {
            System.out.println("姓名：" + e.getName() + ","
                    + "工资" + e.getSalary() + ","
                    + "HireDay" + e.getHireDay());

        }
    }
}

class Employee {
    //实例字段
    private final String name;
    private final LocalDate hireDay;
    private double salary;

    //构造器

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
