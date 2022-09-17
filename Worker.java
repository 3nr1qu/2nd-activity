public class Worker {
    public class Worker extends Person{
        String fname;
        String lname;
        String department;
        
    
        public String getfname(){
            return fname;
        }
        public void setfname(String fname){
            this.fname = fname;
        }
        
        public String getlname(){
            return lname;
        }
        public void setlname(String lname){
            this.lname = lname;
        }
        
        public String getdepartment(){
            return department;
        }
        public void setdepartment(String department){
            this.department = department;
        }
    
    }
}
