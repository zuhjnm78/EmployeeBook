public class EmployeeBook {
    private  final Integer DEPARTMENT_COUNT = 5;
    private  Integer Employees_SIZE = 10;
    private final Employee[] employees = new Employee[Employees_SIZE];
    private int findFreeIndex(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                return i;
            }

        }
        return -1;
    }


    public void addEmployee(String fullName, int department, int salary) {
        int index = findFreeIndex();

            if (index == -1) {
                System.out.println("Нет места в книге сотрудников");
            } else {
                employees[index] = new Employee(fullName, department, salary);
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                return;
            }
        }
    }

    public Employee getEmployee(String fullName) {
        for (int i = 0; i < Employees_SIZE; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                return employees[i];
            }
        }
        System.out.println("Сотрудник с именем " + fullName + " не найден");
        return null;
    }

    public void updateEmployeeSalary(String fullName, double salary) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }

    public void updateEmployeeId(String fullName, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setDepartment(department);
            }
        }

    }

    public void printEmployeesByDepartment() {
        for (int i = 1; i <= DEPARTMENT_COUNT; i++) {
            System.out.println("Department " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee);
                }

            }

        }
    }
    public void printAllEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee emp: employees) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }
    public Employee getEmployeeWithMinSalary() {
        Employee minEmployee = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    public Employee getEmployeeWithMaxSalary() {
        Employee maxEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }
    public double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        return totalSalary / employees.length;
    }
    public void printAllNames() {
        for (Employee emp : employees) {
            System.out.println(emp.getFullName());
        }
    }
}
