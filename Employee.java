public class Employee {
    String name;
    int id;
    double salary;
    String Address;
    
    //constructor
    public Employee(String name,int id,double salary,String Address){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.Address=Address;
    }
    //method to display 
    public void displayInfo(){
        System.out.println("Employee Id:" + id);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Salary:" + salary + "₹");
        System.out.println("Employee Address: " + Address);
    }

    //main method
    public static void main(String[] args) {
        Employee emp=new Employee("Gayatri", 101, 50000.00,"Dharwad Managlwar Peth");
        emp.displayInfo();
    }
}
