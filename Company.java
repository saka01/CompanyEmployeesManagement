import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private String nameofcompany;
    private int yearofstart;
    private ArrayList<Employee> companyEmployees;
    private ArrayList<Manager> companyManagers;

    public Company(String nameofcompany, int yearofstart, ArrayList<Employee> companyEmployees, ArrayList<Manager> companyManagers) {
        this.nameofcompany = nameofcompany;
        this.yearofstart = yearofstart;
        this.companyEmployees = new ArrayList<>();
        this.companyManagers = new ArrayList<>();
    }

    public void setNameofcompany(String nameofcompany) {
        this.nameofcompany = nameofcompany;
    }

    public void addCompanyEmployees(Employee employees) {
        companyEmployees.add(employees);
    }

    public void addCompanyManagers(Manager manager) {
        companyManagers.add(manager);
    }

    public void setYearofstart(int yearofstart) {
        this.yearofstart = yearofstart;
    }

    public String getNameofcompany() {
        return nameofcompany;
    }

    public ArrayList<Employee> getCompanyEmployees() {
        return companyEmployees;
    }

    public ArrayList<Manager> getCompanyManagers() {
        return companyManagers;
    }

    public int getYearofstart() {
        return yearofstart;
    }

    public ArrayList<Employee> sortEmployeesByLastName(){
        Collections.sort(companyEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e, Employee e2) {
                return e.getLname().compareTo(e2.getLname());
            }
        });
        return companyEmployees;
    }

    public ArrayList<Manager> sortManagersByLastName(){

        Collections.sort(companyManagers, new Comparator<Manager>() {
            @Override
            public int compare(Manager m, Manager m1) {
                return m.getLname().compareTo(m.getLname());
            }
        });
        return companyManagers;
    }

    public String alwaysseeinfo(ArrayList arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).toString());
        }
        return "cant find nun";
    }


    public String seeEmployees() {
        for (int i = 0; i < companyEmployees.size(); i++) {
            System.out.println(companyEmployees.get(i).toString());
        }
        return "cant find nun";
    }
    public String seeManagers() {
        for (int i = 0; i < companyManagers.size(); i++) {
            System.out.println(companyManagers.get(i).toString());
        }
        return "cant find nun";
    }
}
