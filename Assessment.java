public class Assessment {
    private int ID;
    private String type;
    private int day;
    private int month;
    private int year;
    private double totalMarks;
    private double marksObtained;
    private double percentage;
    private Grade grade;

    public Assessment(int ID, String type, int day, int month, int year,
                      double totalMarks, double marksObtained) {
        this.ID = ID;
        this.type = type;
        this.day = day;
        this.month = month;
        this.year = year;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
        // this.percentage = percentage;
        // this.grade=new Grade(g);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    public double getPercentage() {
        return percentage;
    }
    public double calculatePercentage(){
        this.percentage=(totalMarks/marksObtained)*100;
        return this.percentage;
    }
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    public void displayState(){
        System.out.println("ID = "+getID());
        System.out.println("Type = "+getType());
        System.out.println("Day = "+getDay());
        System.out.println("Month = "+getMonth());
        System.out.println("Year = "+getYear());
        System.out.println("Total Marks = "+getTotalMarks());
        System.out.println("Obtained Marks = "+getMarksObtained());
        System.out.println("Percentage = "+getPercentage());
    }
}
