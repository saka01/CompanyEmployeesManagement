import java.util.ArrayList;

public class Manager extends Employee {
    private double monthlyBonus;
    private ArrayList<Employee> myEmployees;


    public Manager(String fname, String lname, String pnumber, int birthDay, int birthMonth, int yearofhire, double annualsalary, int vacationdays, int unusedvactiondays, double monthlyBonus, ArrayList<Employee> myEmployees) {
        super(fname, lname, pnumber, birthDay, birthMonth, yearofhire, annualsalary, vacationdays, unusedvactiondays);
        this.monthlyBonus = monthlyBonus;
        this.myEmployees = new ArrayList<>();
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public void addEmployees(Employee employee) {
        myEmployees.add(employee);
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public ArrayList<Employee> getMyEmployeesByFirstname() {
        return myEmployees;
    }

    public String seeEmployees() {
        for (int i = 0; i < myEmployees.size(); i++) {
            System.out.println(myEmployees.get(i).toString());
        }
        return "cant find nun";
    }
    @Override
    public String toString(){
        return "Name: " + getFname() + " " + getLname() + " " +
                "\nPhone number: " + getpnumber() +
                "\nannual salary: " + getAnnualsalary() +
                "\nYear of Hire: " + getYearofhire() +
                "\nUnused Vacation Days: " + getUnusedvactiondays() +
                "\nAllowed Vacation Days " + getVacationdays() +
                "\nMonthly Bonus: " + getMonthlyBonus() +
                "\nAll Employees managing: " + getMyEmployeesByFirstname() +
                "\n";

    }

}
