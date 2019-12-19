public class Student {

//data fields
public static final int NUM_TESTS = 3;   //not an instance variable

    //instance variables or Data fields
    private String myName;
    private String myGrade;
    private int[] myTests;

    //Constructors
    public Student(String myName, String myGrade, int[] myTests){
        this.myName = myName;
        this.myGrade = myGrade;
        this.myTests = myTests;
    }

    //default Constructor
    public Student() {
      myName = "";   //set to "empty string"
      myGrade = "";
      myTests = new int[NUM_TESTS];
    }

    public String getName(){
      return myName;
    }

    public String getGrade(){
      return myGrade;
    }

    public int[] getTestScores(){
      return myTests;
    }

    //Mutator Methods

    public void setName(String name){
      myName = name;
    }

    public void setGrade(String grade){
      myGrade = grade;
    }

    public void setName(int[] tests){
      myTests = tests;
    }

    public void computeGrade(){
      if(myName.equals("")){
        myGrade = "No Grade";
      } else if(getTestAverage() >= 60){
          myGrade = "Pass";
      } else{
          myGrade = "Fail";
      }
    }

    public double getTestAverage(){
      double total = 0;
      for(int score : myTests){
        total += score;
      }

      return (total/NUM_TESTS);
  }

}
