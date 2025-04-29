public class StudentUp {
    long phoNo;
    String Address;

    public StudentUp(long phoNo,String Address){
        this.phoNo=phoNo;
        this.Address=Address;
    }

    void Dispay(){
        System.out.println("Student Phone No: "+phoNo);
        System.out.println("Student Address :" + Address);
    }

    public static void main(String[] args) {
        StudentUp sp=new StudentUp(4356322378L, "Maski");
        sp.Dispay();
    }

}
