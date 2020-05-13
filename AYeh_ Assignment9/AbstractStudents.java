/** AbstractStudents.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-01
 * Assignment 9
 * Create a class named AbstractStudents that is an extention of affiliates
 */

public abstract class AbstractStudents extends Affiliates{
  //creating all needed variables
  private int stuID;
  private String major;
  private String minor;
  private String classStanding;
  private int getPublishPaper = 0;
  private String getThesisAdvisor = null;
  private int getCourseTaken = 0;
  private int getScholarAmnt = 0;
//my setters and getters
  public void setStuID(stuID){
    int stuID = stuID;
  }
  public int getStuID(){
    return stuID;
  }

  public void setMajor(String major){
    String major = major;
  }
  public int getMinor(){
    return minor;
  }

  public void setClassStanding(int classStanding){
    int classStanding = classStanding;
  }
  public int getClassStanding(){
    return classStanding;
  }
/**
 * what happens if there is a graduate student
 * @param publishPaper  [number of published papers]
 * @param thesisAdvisor [the thesis advisor]
 */
  public void graduate(int publishPaper, String thesisAdvisor){
    int getPublishPaper = publishPaper;
    String getThesisAdvisor = thesisAdvisor;
    String graduateInfo = "Number of Published Papers: "+publishPaper +
      " , Thesis Advisor: "+thesisAdvisor;
  }
  /**
   * what happenes if there is an undergraduate student
   * @param courseTaken [number of courses taken]
   * @param scholarAmnt [scholarship ammount]
   */
  public void undergrad(int courseTaken, int scholarAmnt){
    int getCourseTaken = courseTaken;
    int getScholarAmnt = scholarAmnt;
    String underGradInfo = "Number of Courses Taken: "+courseTaken+
      " , Scholarship Amount: $"+scholarAmnt;
  }
  //more setters and getters
  public void setPublishPaper(int publishPaper){
    int publishPaper = publishPaper;
  }
  public void setThesisAdvisor(){
    int thesisAdvisor = thesisAdvisor;
  }
  public void setCourseTaken(){
    int courseTaken = courseTaken;
  }
  public void setScholarAmnt(){
    int scholarAmnt = scholarAmnt;
  }
  public int getpublishpaper(){
    return this.getPublishPaper;
  }
  public String getthesisadvisor(){
    return this.getThesisAdvisor;
  }
  public int getcoursetaken(){
    return this.getCourseTaken;
  }
  public int getscholaramnt(){
    return this.getScholarAmnt;
  }
  /**
   * prints the information of a student
   * @return [prints the information of a student.]
   */
  public String print(){
    return System.out.println("Student id: "+ stuID +" , major: " +major+
    " , minor: "+minor+" , Class Standing: "+classStanding);
  }
}
