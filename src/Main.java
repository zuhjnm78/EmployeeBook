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

       // printAllEmployees();
        //System.out.println("---------------------------------");

        //System.out.println(calculateTotalSalary());
        //System.out.println("---------------------------------");

        //System.out.println(getEmployeeWithMinSalary());
        //System.out.println("---------------------------------");

        //System.out.println(getEmployeeWithMaxSalary());
        //System.out.println("---------------------------------");

        //System.out.println(calculateAverageSalary());
        //System.out.println("---------------------------------");

        //printAllNames();
        increaseSalary(20);
        printAllEmployees();
        System.out.println("---------------------------------");

        System.out.println(findEmployeeWithMaxSalaryByDepartment(5));
        System.out.println("---------------------------------");

        System.out.println(findEmployeeWithMinSalaryByDepartment(4));
        System.out.println("---------------------------------");

        System.out.println(calculateSalaryCostsByDepartment(3));
        System.out.println("---------------------------------");

        System.out.println(calculateAverageSalaryByDepartment(2));
        System.out.println("---------------------------------");

        increaseSalaryByPercentForDepartment(2, 20);
        printEmployeesByDepartment(2);
        System.out.println("---------------------------------");

        printEmployeesWithSalaryLessThan(70000);
        System.out.println("---------------------------------");

        printEmployeesWithSalaryGreaterThanOrEqualTo(70000);
        System.out.println("---------------------------------");





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
    public static void increaseSalary(double percent) {
        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary(currentSalary * (1 + percent / 100));
        }
    }

    public static Employee findEmployeeWithMinSalaryByDepartment(int department) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalaryByDepartment(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateSalaryCostsByDepartment(int department) {
        double salaryCosts = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salaryCosts += employee.getSalary();
            }
        }
        return salaryCosts;
    }

    public static double calculateAverageSalaryByDepartment(int department) {
        double sumSalary = 0;
        int numEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sumSalary += employee.getSalary();
                numEmployees++;
            }
        }
        if (numEmployees == 0) {
            return 0;
        } else {
            return sumSalary / numEmployees;
        }
    }

    public static void increaseSalaryByPercentForDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double salary = employee.getSalary();
                employee.setSalary(salary * (1 + percent / 100));
            }
        }
    }

    public static void printEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("id: " + employee.getId() + ", Ф.И.О.: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryGreaterThanOrEqualTo(double salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println("id: " + employee.getId() + ", Ф.И.О.: " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
}