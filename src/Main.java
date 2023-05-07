public class Main {
    public static void main(String[]  args){

            EmployeeBook employeeBook = new EmployeeBook();

            employeeBook.addEmployee("Аверин Юрий Алексеевич", 1, 50000);employeeBook.addEmployee("Варламов Владимир Иванович", 2, 60000);employeeBook.addEmployee("Веденеев Илья Николаевич", 1, 55000);
            employeeBook.addEmployee("Давыдов Геннадий Анатольевич", 3, 70000);
            employeeBook.addEmployee("Долгов Виталий Игоревич", 4, 80000);
            employeeBook.addEmployee("Иванов Григорий Алексеевич", 2, 65000);
            employeeBook.addEmployee("Карташов Владислав Сергеевич", 5, 90000);
            employeeBook.addEmployee("Макаров Константин Валентинович", 4, 75000);
            employeeBook.addEmployee("Панфилов Никита Максимович", 3, 65000);
            employeeBook.addEmployee("Тетерин Павел Викторович", 5, 95000);

        employeeBook.printEmployeesByDepartment();
        System.out.println("--------------------");

        employeeBook.removeEmployee(2);
        employeeBook.printAllEmployees();
        System.out.println("--------------------");

        employeeBook.addEmployee("Тимкин Тимур Рафикович", 2, 65000);
        employeeBook.printAllEmployees();
        System.out.println("--------------------");

        employeeBook.updateEmployeeSalary("Аверин Юрий Алексеевич", 65000);
        System.out.println("--------------------");

        employeeBook.printEmployeesByDepartment();

        }


    }

