/** Affiliates.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-01
 * Assignment 9
 * Create a class named Affiliates that is the main file for everything to branch off of
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public abstract class Affiliates{
  //starting hashmap and variables
  HashMap<Integer, Object> hmap = new HashMap<Integer, Object>();
  private String name;
  private int age;
  private int phoneNumber;
  private int yearCame;
//setters and getters
  public void setName(String name){
    String name = name;
  }
  public String getName(){
    return name;
  }

  public void setAge(int age){
    int age = age;
  }
  public String getAge(){
    return age;
  }

  public void setPhoneNumber(int phoneNumber){
    int phoneNumber = phoneNumber;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }

  public void setYearCame(int yearCame){
    int yearCame = yearCame;
  }
  public String getYearCame(){
    return yearCame;
  }
/**
 * comparing the two people and putting them in an array list to see who is higher
 */
  public void comparable(){
    ArrayList<Integer> senority  = new ArrayList<Integer>();
    int tempYear1 = this.yearCame;
    int size = senority.size();
    senority.add(tempYear1);

    for(int index = 0; index < size; index++){
      if(tempYear1.compareTo(senority.get(index)) >= 1){
        senority.add(tempYear1);
        int secIndex = senority.get(index);
        int temp = tempYear1;
        tempYear1 = senority.get(index);
        secIndex = temp;
      }
      else if(tempYear1.compareTo(senority.get(index)) <= -1){
        senority.add(tempYear1);
      }
      else{
        senority.add(tempYear1);
      }
    }
  }
  /**
   * prints the information of the affiliate
   */
  public print(){
    return System.out.println("Name: "+ name +" , Age: "+ age +" , PhoneNumber: "+ phoneNumber +" , Year Came: "+ yearCame);
  }
  /**
   * main function
   * @param args [main function]
   */
  public static void main(String[] args) {
    //asking what selection they want to do
    Scanner kb = new Scanner(System.in);
    System.out.println("Choose one of the following: \n1) Create an "
    +"affiliate record\n2)Print information for an Affiliate given the id\n "
    +"3)List all affiliates in order of senority\n4)Delete a record given the "
    +"id\n5)Exit");
    int selection = kb.nextInt();
    //start selection 1 and ask questions for input
    if(selection == 1){
      Affiliate newAff = new Affiliate();

      Scanner kb2 = new Scanner(System.in);
      System.out.println("Is it a Student, Faculty, or Staff: ");

      if(kb2.nextStr() == "Student"){
        Scanner kb9 = new Scanner(System.in);
        System.out.println("Enter the Student id: ");
        newAff.setStuID(kb9.nextInt());

        Scanner kb10 = new Scanner(System.in);
        System.out.println("Enter the Major: ");
        newAff.setMajor(kb10.nextStr());

        Scanner kb11 = new Scanner(System.in);
        System.out.println("Enter the Minor: ");
        newAff.setMinor(kb11.nextStr());

        Scanner kb12 = new Scanner(System.in);
        System.out.println("Enter the Class Standing: ");
        newAff.setClassStanding(kb12.nextStr());

        Scanner kb8 = new Scanner(System.in);
        System.out.println("Is it a graduate or undergraduate: ");

        hmap.put(newAff.getStuID(), newAff);

        if(kb8.nextStr() == "graduate"){

          Scanner kb13 = new Scanner(System.in);
          System.out.println("Enter the number of published papers: ");
          newAff.setPublishPaper(kb13.nextInt());

          Scanner kb14 = new Scanner(System.in);
          System.out.println("Enter the thesis advisor: ");
          newAff.setThesisAdvisor(kb14.nextStr());

        }
        else{
          Scanner kb15 = new Scanner(System.in);
          System.out.println("Enter the number of courses taken: ");
          newAff.setCourseTaken(kb15.nextInt());

          Scanner kb16 = new Scanner(System.in);
          System.out.println("Enter the scholarship amount: ");
          newAff.setScholarAmnt(kb16.nextInt());


        }
      }
      else if(kb2.nextStr() == "Faculty"){
        Scanner kb21 = new Scanner(System.in);
        System.out.println("Enter the faculty id: ");
        newAff.setfacID(kb21.nextInt());

        Scanner kb22 = new Scanner(System.in);
        System.out.println("Enter the department: ");
        newAff.setDepartment(kb22.nextStr());

        Scanner kb23 = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        newAff.setSalary(kb23.nextInt());

        Scanner kb24 = new Scanner(System.in);
        System.out.println("Enter the number of papers: ");
        newAff.setNumOfPapers(kb24.nextInt());

        hmap.put(newAff.getfacID(), newAff);

        Scanner kb25 = new Scanner(System.in);
        System.out.println("Is it an assistant, associate, or full professor");
        if(kb25.nextStr == assistant){
          Scanner kb26 = new Scanner(System.in);
          System.out.println("Enter the number of years until tenure: ");
          newAff.setYearUntilTenure(kb26.nextInt());

        }
        else if(kb25.nextStr == associate){
          Scanner kb27 = new Scanner(System.in);
          System.out.println("Enter the number of years since tenure: ");
          newAff.setYearSinceTenure(kb27.nextInt());
        }
        else{
          Scanner kb28 = new Scanner(System.in);
          System.out.println("Enter the number of years until retirement: ");
          newAff.setYearUntilRetirement(kb28.nextInt());
        }
      }
      else{
        Scanner kb29 = new Scanner(System.in);
        System.out.println("Enter the staff id: ");
        newAff.setStaffID(kb29.nextInt());

        Scanner kb30 = new Scanner(System.in);
        System.out.println("Enter the title: ");
        newAff.settitle(kb30.nextStr());

        Scanner kb31 = new Scanner(System.in);
        System.out.println("Enter the building they deal with: ");
        newAff.setBuilding(kb31.nextStr());

        Scanner kb32 = new Scanner(System.in);
        System.out.println("Is it full or part time");
        if(kb32.nextStr == full){
          Scanner kb33 = new Scanner(System.in);
          System.out.println("Enter the yearly salary: ");
          newAff.setYearlySalary(kb33.nextInt());
        }
        else{
          Scanner kb34 = new Scanner(System.in);
          System.out.println("Enter the hourly salary: ");
          newAff.setHourlySalary(kb34.nextInt());
        }
      }

      Scanner kb3 = new Scanner(System.in);
      System.out.println("Enter the name: ");
      newAff.setName(kb3.nextStr());

      Scanner kb4 = new Scanner(System.in);
      System.out.println("Enter the age: ");
      newAff.setAge(kb4.nextInt());

      Scanner kb5 = new Scanner(System.in);
      System.out.println("Enter the phone number: ");
      newAff.setPhoneNumber(kb5.nextInt());

      Scanner kb6 = new Scanner(System.in);
      System.out.println("Enter the year came: ");
      newAff.setYearCame(kb6.nextInt());


    }
    //start selection 2 and ask for input to display information
    else if(selection == 2){
      System.out.println("Type the id: ");
      Scanner kb7 = new Scanner(System.in);
      int idNum = kb7.nextInt();
      Object newinfo = hmap.get(idNum);
      newinfo.display();
    }
    //start selection 3 and list all affiliates in order
    else if(selection == 3){
      Arrays.toString(senority.toArray());
    }
    //start selection 4 and remove the person
    else if(selection == 4){
      System.out.println("Type the id number you want to remove: ");
      Scanner kb20 = new Scanner(System.in);
      hmap.remove(kb20.nextInt());
    }
    //start selection 5. end the program
    else{
      System.out.println("Good Bye!");
    }
  }
}
