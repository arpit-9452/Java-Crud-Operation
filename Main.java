import java.util.*;

class Employee{
    private int empno;
    private String ename;
    private int salary;
    Employee(int empno, String ename, int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }
    public int getEmpno(){
        return empno;
    }
    public int getSalary(){
        return salary;
    }
    public String getEname(){
        return ename;
    }
    public String toString(){
        return empno+""+ename+""+salary;
    }
}

public class Main{
    public static void main(String[] args){
        List<Employee> c = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("Enter your choice");
            ch = s.nextInt();

            switch(ch){
                case 1:
                System.out.println("Enter Employee Id");
                int eno = s.nextInt();
                System.out.println("Enter Employee Name");
                String ename = s1.nextLine();
                System.out.println("Enter the salary");
                int salary = s.nextInt();
                c.add(new Employee(eno, ename, salary));
                break;
                case 2 :
                System.out.println("===========================================");
                Iterator<Employee> i = c.iterator();
                while(i.hasNext()){
                    Employee e = i.next();
                    System.out.println(e);
                }
                System.out.println("========================================");
                break;
                case 3 :
                boolean found = false;
                System.out.println("Enter the Employee ID to Search");
                int empno = s.nextInt();
                System.out.println("=================================");
                i=c.iterator();
                while(i.hasNext()){
                    Employee e = i.next();
                    if(e.getSalary()== empno){
                        System.out.println(e);
                        found = true;
                    }
                }
                if(! found){
                    System.out.println("Record not Found");
                }
                System.out.println("=========================================");
                break;
                case 4 :
                found = false;
                System.out.println("Enter the Employe Number to Delete");
                empno = s.nextInt();
                System.out.println("==============================================");
                i = c.iterator();
                while(i.hasNext()){
                    Employee e = i.next();
                    if(e.getEmpno()==empno){
                        i.remove();
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record not found");
                }else{
                    System.out.println("Record Deleted succesFully");
                }
                System.out.println("======================================");
                break;

                case 5 :
                found = false;
                System.out.println("Enter the Employee Id");
                empno = s.nextInt();
                System.out.println("===========================================");
                ListIterator<Employee> li = c.listIterator();
                while(li.hasNext()){
                    Employee e = li.next();
                    if(e.getEmpno()== empno){
                        System.out.println("Enter the new Name");
                        ename = s1.nextLine();
                        System.out.println("Enter the new Salary");
                        salary = s.nextInt();
                        li.set(new Employee(empno, ename, salary));
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Record Not Found");
                }else{
                    System.out.println("Record Updated Succesfully");
                }
                System.out.println("===================================");
                break;
            }
        }while(ch != 0);
    }
}