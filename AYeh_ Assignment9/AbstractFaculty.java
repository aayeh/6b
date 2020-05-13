/** AbstractFaculty.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-01
 * Assignment 9
 * Create a class named AbstractFaculty that is an extention of affiliates
 */


public abstract class AbstractFaculty extends Affiliates{
  //stating variables needed
  private int facID;
  private String department;
  private int salary;
  private int numOfPapers;
  private int getUntilTenure = 0;
  private int getSinceTenure = 0;
  private int getUntilRetirement = 0;
/**
 * what happens if there is an assistant
 * @param  yearUntilTenure [years until tenure]
 * @return                 [a string that displays the years until tenure]
 */
  public int assistant(int yearUntilTenure){
    private int getUntilTenure = yearUntilTenure;
    String assistantInfo = "Years Until Tenure: "+yearUntilTenure;
  }
  /**
   * what happens if there is an associate
   * @param  yearSinceTenure [years since tenure]
   * @return                 [a string that displays the years since tenure]
   */
  public int associate(int yearSinceTenure){
    private int getSinceTenure = yearSinceTenure;
    String associateInfo = "Years Since Tenure: "+yearSinceTenure;

  }
  /**
   * what happens if there is a full time professor
   * @param  yearUntilRetirement [years until retirement]
   * @return                     [string that displays the years until retirement]
   */
  public int full(int yearUntilRetirement){
    private int getUntilRetirement = yearUntilRetirement;
    String fullInfo = "Years Until Retirement: "+yearUntilTenure;
  }
//all of my setters and getters
  public void setfacID(facID){
    int facID = facID;
  }
  public int getfacID(){
    return facID;
  }

  public void setDepartment(department){
    int department = department;
  }
  public int getDepartment(){
    return department;
  }

  public void setSalary(salary){
    int salary = salary;
  }
  public int getSalary(){
    return salary;
  }

  public void setNumOfPapers(facID){
    int facID = facID;
  }
  public int getNumOfPapers(){
    return numOfPapers;
  }

  public void setYearUntilTenure(yearUntilTenure){
    int yearUntilTenure = yearUntilTenure;
  }
  public void setYearSinceTenure(yearSinceTenure){
    int yearSinceTenure = yearSinceTenure;
  }
  public void setYearUntilRetirement(yearUntilRetirement){
    int yearUntilRetirement = yearUntilRetirement;
  }

  public getuntilTenure(){
    return this.getUntiltenure;
  }
  public getsinceTenure(){
    return this.getSincetenure;
  }
  public getuntilRetirement(){
    return this.getUntilretirement;
  }
  /**
   * print funtion that displays information of faculty.
   */
  public print(){
    return System.out.println("Faculty id: "+facID+" , Department: "+department+
    " , Yearly Salary: "+yearlySalary+" , Number of Papers: "+ numOfPapers);
  }
}
