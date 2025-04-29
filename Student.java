public class Student {
    int Id;
    String name;
    String Cource;

    public Student(int Id,String name,String Cource){
        this.Id=Id;
        this.name=name;
        this.Cource=Cource;
    }

    public void DisplayInfo(){
        System.out.println("Student Id: " + Id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Cource: " + Cource);
    }


    public static void main(String[] args) {
        Student sa=new Student(12, "Mamatha", "Bachalore of Computer Apllication");
        sa.DisplayInfo();
    }
}
