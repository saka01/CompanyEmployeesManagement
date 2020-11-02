import java.util.ArrayList;

public class Person{
    private String fname;
    private String lname;
    private String pnumber;
    private int birthMonth;
    private int birthDay;

    public Person(String fname, String lname, String pnumber, int birthDay, int birthMonth){
        this.fname = fname;
        this.lname = lname;
        this.pnumber = pnumber;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
    }

    public void setFname(String fname){this.fname = fname;}
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }
    public void setBirthMonth(int birthMonth){this.birthMonth = birthMonth;}
    public void setBirthDay(int birthDay){this.birthDay = birthDay;}

    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public String getpnumber(){
        return pnumber;
    }
    public int getBirthMonth(){return birthMonth;}
    public int getBirthDay(){return birthDay;}

    @Override
    public String toString(){

        return "Name: " + getFname() + " " + getLname() +
                "\nPhone Number: " + getpnumber() +
                "\nDate of Birth (DD/MM): " + getBirthDay() + "/" + getBirthMonth()+
                "\n";
    }

}

