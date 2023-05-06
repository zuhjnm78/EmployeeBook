public class Employee {
private String fullName;
private int department;
private double salary;
private  int id;
private static int counter = 0;

//Getter
    public String getFullName(){
        return this.fullName;}
    public int getDepartment(){
        return this.department;}
    public double getSalary(){
        return this.salary;}
    public int getId(){
        return this.id;}

    //Setter


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //Constructor
    public Employee(String fullName, int department, double salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }
    @Override
    public String toString(){
        return "Id: " + id + " Ф.И.О.: " + fullName + " Department: " + department + " Salary: " + salary;
    }


}
