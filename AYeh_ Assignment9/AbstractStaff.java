/** AbstractStaff.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-01
 * Assignment 9
 * Create a class named AbstractStaff that is an extention of affiliates
 */

public abstract class AbstractStaff extends Affiliates{
  //variables needed
  private int staffID;
  private String title;
  private String building;
  private int getYearlySalary = 0;
  private int getHourlySalary = 0;
/**
 * what happens if there is a full time staff
 * @param yearlySalary [yearly salary]
 */
  public void fullTime(int yearlySalary){
    int getYearlySalary = yearlySalary;
    String fullTimeInfo = "Yearly Salary: "+yearlySalary;
  }
  /**
   * what happens if there is a part time staff
   * @param hourlySalary [hourly salary]
   */
  public void partTime(int hourlySalary){
    int getHourlySalary = hourlySalary;
    String partTimeInfo = "Hourly Salary: "+hourlySalary;
  }
  //all of my setters and getters
  public void setStaffID(int staffID){
    int staffID = staffID;
  }
  public int getStaffID(){
    return staffID;
  }

  public void setTitle(String title){
    String title = title;
  }
  public String getTitle(){
    return title;
  }

  public void setBuilding(String building){
    String building = building;
  }
  public String getBuilding(){
    return building;
  }

  public void setYearlySalary(int yearlySalary){
    int yearlySalary = yearlySalary;
  }

  public void setHourlySalary(int hourlySalary){
    int hourlySalary = hourlySalary;
  }


  public int getyearlysalary(){
    return this.getYearlySalary;
  }
  public int gethourlysalary(){
    return this.getHourlySalary;
  }
  /**
   * prints the information of the staff member
   */
  public print(){
    return System.out.println("Staff id: "+staffID+" , Title: "+title+
    " , Building: "+building);
  }
}
