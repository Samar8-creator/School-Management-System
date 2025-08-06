public class Student {
    private int ID;
    private String name;
    private String program;
    private int numberOfCourses;
    private Course[] courses;

    public Student(int ID, String name, String program) {
        this.ID = ID;
        this.name = name;
        this.program = program;
        numberOfCourses=0;
        this.courses = new Course[6];
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public void registerCourse(Course c){
        this.courses[numberOfCourses]=c;
        numberOfCourses++;
    }
    public void displayState(){
        System.out.println("Name = "+getName());
        System.out.println("ID = "+getID());
        System.out.println("Program  ="+getProgram());
        System.out.println("------- Courses Information -------");
        for (int i=0;i<numberOfCourses;i++){
            System.out.println("Code = "+courses[i].getCode());
            System.out.println("Title = "+courses[i].getTitle());
            System.out.println("Credit Hours = "+courses[i].getCreditHours());
            System.out.println("Number Of Quizzes = "+courses[i].getNumberOfQuizzes());
            System.out.println("Number Of Assignment = "+courses[i].getNumberOfAssignments());
        }
    }

    public void GradeBook(){

    }

    }

