public class oop_main {
    public static void main(String[] args) {

        Person p = new Person();
        Student S1 = new Student();
        Worker W1 = new Worker();
        
        System.out.println("STUDENT" );
        S1.setfname("Alex");
        S1.setlname("Smith");
        S1.setschooldepartment("C-CT1 CERTIFICATE IN COMPUTER TECHNOLOGY");
        
        System.out.println("First Name : " +S1.getfname());
        System.out.println("Last Name : " +S1.getlname());
        System.out.println("Department : " +S1.getschooldepartment());
        System.out.println("" );
        
        System.out.println("WORKER" );
        W1.setfname("John");
        W1.setlname("Santos");
        W1.setdepartment("Web Developer");
        
        System.out.println("First Name : " +W1.getfname());
        System.out.println("Last Name : " +W1.getlname());
        System.out.println("Position : " +W1.getdepartment());
        
       

        
    }
}
