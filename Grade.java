public class Grade {
    private String name;
    private int minPercentage;
    private int maxPercentage;
    private String remarks;
    public Grade(String name, int minPercentage, int maxPercentage, String remarks) {
        this.name = name;
        this.minPercentage = minPercentage;
        this.maxPercentage = maxPercentage;
        this.remarks = remarks;
    }
    public Grade(Grade g){
        this.setName(g.getName());
        this.setMinPercentage(g.getMinPercentage());
        this.setMaxPercentage(g.getMaxPercentage());
        this.setRemarks(g.getRemarks());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPercentage() {
        return minPercentage;
    }

    public void setMinPercentage(int minPercentage) {
        this.minPercentage = minPercentage;
    }

    public int getMaxPercentage() {
        return maxPercentage;
    }

    public void setMaxPercentage(int maxPercentage) {
        this.maxPercentage = maxPercentage;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String Remarks(){
        if (maxPercentage>=80 && maxPercentage<=100)
            return "Excellent";
        else if (maxPercentage>=65 && maxPercentage<=79)
            return "Good";
        else if (maxPercentage>=50 && maxPercentage<=64)
            return "Satisfactory";
        else if (maxPercentage>=40 && maxPercentage<=49)
            return "Pass";
        else
            return "Fail";
    }
    public String Grading(){
        if (maxPercentage>=80 && maxPercentage<=100)
            return "A";
        else if (maxPercentage>=65 && maxPercentage<=79)
            return "B";
        else if (maxPercentage>=50 && maxPercentage<=64)
            return "C";
        else if (maxPercentage>=40 && maxPercentage<=49)
            return "D";
        else
            return "F";
    }
    public double GradePointAverage(char grade){
        if (grade=='A')
            return 4.0;
        else if (grade=='B')
            return 3.0;
        else if (grade=='C')
            return 2.0;
        else if (grade=='D')
            return 1.0;
        else
            return 0.0;
    }

    public void displayState(){
        System.out.println("Name = "+getName());
        System.out.println("Min Percentage = "+getMinPercentage());
        System.out.println("Max Percentage = "+getMaxPercentage());
        System.out.println("Remarks = "+getRemarks());
    }
}
