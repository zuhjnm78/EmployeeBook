public class Main {
    public static final Employee [] employees = {
            new Employee("Аверин Юрий Алексеевич", 1, 50000),
            new Employee("Варламов Владимир Иванович", 2, 60000),
            new Employee("Веденеев Илья Николаевич", 1, 55000),
            new Employee("Давыдов Геннадий Анатольевич", 3, 70000),
            new Employee("Долгов Виталий Игоревич", 4, 80000),
            new Employee("Иванов Григорий Алексеевич", 2, 65000),
            new Employee("Карташов Владислав Сергеевич", 5, 90000),
            new Employee("Макаров Константин Валентинович", 4, 75000),
            new Employee("Панфилов Никита Максимович", 3, 65000),
            new Employee("Тетерин Павел Викторович", 5, 95000)

    };
    public static void main(String[] args) {

        printAllEmployees();
        System.out.println("---------------------------------");

        System.out.println(calculateTotalSalary());
        System.out.println("---------------------------------");

        System.out.println(getEmployeeWithMinSalary());
        System.out.println("---------------------------------");

        System.out.println(getEmployeeWithMaxSalary());
        System.out.println("---------------------------------");

        System.out.println(calculateAverageSalary());
        System.out.println("---------------------------------");

        printAllNames();



    }


    public static void printAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee emp: employees) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }

    public static Employee getEmployeeWithMinSalary() {
        Employee minEmployee = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;

    }


    public static Employee getEmployeeWithMaxSalary() {
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }

    public static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        return totalSalary / employees.length;
    }

    public static void printAllNames() {
        for (Employee emp : employees) {
            System.out.println(emp.getFullName());
        }
    }
}