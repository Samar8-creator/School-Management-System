public class Course {
    private String code;
    private String title;
    private int creditHours;
    private int numberOfQuizzes;
    private int numberOfAssignments;
    private int numberOfAssessments;
    private Assessment[] assessments;
    public Course(String code, String title, int creditHours, int numberOfQuizzes, int numberOfAssignments) {
        this.code = code;
        this.title = title;
        this.creditHours = creditHours;
        this.numberOfQuizzes = numberOfQuizzes;
        this.numberOfAssignments = numberOfAssignments;
        numberOfAssessments=0;
        this.assessments=new Assessment[10];
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getNumberOfQuizzes() {
        return numberOfQuizzes;
    }

    public void setNumberOfQuizzes(int numberOfQuizzes) {
        this.numberOfQuizzes = numberOfQuizzes;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public void setNumberOfAssignments(int numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }
    public void addAssessment(int ID, String type, int day, int month, int year, double totalMarks, double marksObtained){
        this.assessments[numberOfAssessments]=new Assessment(ID, type, day,month,  year, totalMarks, marksObtained);
        numberOfAssessments++;
    }
    public double CalculateGPA(){
        double percentage=0;
        double totalSum=0;
        double obtainedSum=0;
        for (int i=0;i<numberOfAssessments;i++){
            totalSum=assessments[i].getMarksObtained()+obtainedSum;
            obtainedSum=assessments[i].getTotalMarks()+totalSum;
        }
        percentage=(obtainedSum/totalSum)*100;
        return percentage;
    }

    public void displayState(){
        System.out.println("Code = "+getCode());
        System.out.println("Title = "+getTitle());
        System.out.println("Credit Hours = "+getCreditHours());
        System.out.println("Number Of Quizzes = "+getNumberOfQuizzes());
        System.out.println("Number Of Assignment = "+getNumberOfAssignments());
        System.out.println("-------Information Of Assessments-------");
        for (int i=0;i<numberOfAssessments;i++) {
            System.out.println("ID = " + assessments[i].getID());
            System.out.println("Type = " + assessments[i].getType());
            System.out.println("Day = " + assessments[i].getDay());
            System.out.println("Month = " + assessments[i].getMonth());
            System.out.println("Year = " + assessments[i].getYear());
            System.out.println("Total Marks = " + assessments[i].getTotalMarks());
            System.out.println("Obtained Marks = " + assessments[i].getMarksObtained());
            System.out.println("Percentage = " + assessments[i].getPercentage());
        }
    }
}
