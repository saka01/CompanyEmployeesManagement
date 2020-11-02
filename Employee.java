public class Employee extends Person {
    private int yearofhire;
    private double annualsalary;
    private int vacationdays;
    private int unusedvactiondays;

    public Employee(String fname, String lname, String pnumber, int birthDay, int yearofhire, int birthMonth, double annualsalary, int vacationdays, int unusedvactiondays) {
        super(fname, lname, pnumber, birthDay, birthMonth);
        this.yearofhire = yearofhire;
        this.annualsalary = annualsalary;
        this.vacationdays = vacationdays;
        this.unusedvactiondays = unusedvactiondays;
    }


    public void setYearofhire(int yearofhire) {
        this.yearofhire = yearofhire;
    }

    public void setAnnualsalary(double annualsalary) {
        this.annualsalary = annualsalary;
    }

    public void setUnusedvactiondays(int unusedvactiondays) {
        this.unusedvactiondays = unusedvactiondays;
    }

    public void setVacationdays(int vacationdays) {
        this.vacationdays = vacationdays;
    }

    public int getYearofhire() {
        return yearofhire;
    }

    public double getAnnualsalary() {
        return annualsalary;
    }

    public int getUnusedvactiondays() {
        return unusedvactiondays;
    }

    public int getVacationdays() {
        return vacationdays;
    }


    @Override
    public String toString(){
        return "Name: " + getFname() + " " + getLname() + " " +
                "\nPhone number: " + getpnumber() +
                "\nannual salary: " + getAnnualsalary() +
                "\nYear of Hire: " + getYearofhire() +
                "\nUnused Vacation Days: " + getUnusedvactiondays() +
                "\nAllowed Vacation Days " + getVacationdays() +
                "\n";

    }
}
