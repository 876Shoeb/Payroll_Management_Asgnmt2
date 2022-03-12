package com.XTi.Projects;

public class StaffMember extends Main {
    private String FirstName;
    private String LastName;
    private String DeptNum;
    private double HoursWorked;

public StaffMember(String fname, String lname, String deptnum, double hours){
     FirstName = fname;
     LastName = lname;
      DeptNum = deptnum;
     HoursWorked = hours;
}
    public void setFirstName(String fname){
    this.FirstName = fname;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setLastName(String lname){
        this.LastName = lname;
    }
    public String getLastName(){
        return LastName;
    }
    public void setDeptNum(String deptnum){
        this.DeptNum = deptnum;
            }
    public String getDeptNum(){
        return DeptNum;
    }
    public void setHoursWorked(double hours){
        this.HoursWorked = hours;
    }
    public double getHoursWorked(){
        return HoursWorked;
    }

}
