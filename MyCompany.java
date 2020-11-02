import java.util.ArrayList;

public class MyCompany {
   public static void main(String[] args) {

      ArrayList<Employee> myEmployees = new ArrayList<>();
      ArrayList<Manager> myManagers = new ArrayList<>();

      ArrayList<Employee> secondEmployees = new ArrayList<>();
      ArrayList<Manager>  secondManagers = new ArrayList<>();

Company mycompany = new Company("SnipersCorps", 2005, myEmployees, myManagers);


Employee e1 = new Employee("Moshood","Saka", "765435676543", 22,2010,10,250000,28,28);
Employee e2 = new Employee("Roddy","Ntoto", "456543543", 10,2011,9,100000,14,14);
Employee e3 = new Employee("Benji","Binny", "5765678765", 9,2015,8,105000,17,14);


Manager m1 = new Manager("Tosin", "Banjo", "54334543345", 12,11,2015,200000,28,12,1000,myEmployees);
Manager m2 = new Manager("Chinyere", "Saka", "765435654", 6,7,2020,150000,30,40, 5000,secondEmployees );
//myEmployees.add(e1);


mycompany.addCompanyEmployees(e1);
mycompany.addCompanyEmployees(e2);
mycompany.addCompanyEmployees(e3);

mycompany.addCompanyManagers(m1);
mycompany.addCompanyManagers(m2);


System.out.println(mycompany.sortEmployeesByLastName());


m1.addEmployees(e1);
m1.addEmployees(e2);
m2.addEmployees(e3);

System.out.println(mycompany.sortManagersByLastName());
System.out.println("****************************");

mycompany.alwaysseeinfo(mycompany.sortManagersByLastName());






























   }

   }
