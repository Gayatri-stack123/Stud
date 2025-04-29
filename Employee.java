public class Employee {
    String name;
    int id;
    double salary;
    
    //constructor
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //method to display 
    public void displayInfo(){
        System.out.println("Employee Id:" + id);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Salary:" + salary + "₹");
    }

    //main method
    public static void main(String[] args) {
        Employee emp=new Employee("Gayatri", 101, 50000.00);
        emp.displayInfo();
    }
}
