public class Test {
    public static void main(String[] args) {
        Student s=new Student(111,"Ali","BSCS");
        Course oop=new Course("CS-101","OOP",3,3,4);
        Course dld=new Course("CS-201","DLD",3,3,4);
        Course math=new Course("CS-301","Math",3,3,4);
        Course phy=new Course("CS-401","Phy",3,3,4);
        Course eng=new Course("CS-501","English",3,3,4);
        oop.addAssessment(1, "Quiz", 1, 2, 2024, 20, 18);
        oop.addAssessment(2, "Quiz", 5, 2, 2024, 10, 8);
        oop.addAssessment(3, "Quiz", 10, 2, 2024, 15, 13);
        oop.addAssessment(4, "Quiz", 25, 2, 2024, 20, 14);
        oop.addAssessment(1, "Assignment", 3, 2, 2024, 20, 20);
        oop.addAssessment(2, "Assignment", 8, 2, 2024, 20, 19);
        oop.addAssessment(3, "Assignment", 13, 2, 2024, 25, 22);
        oop.addAssessment(4, "Assignment", 27, 2, 2024, 20, 12);
        oop.addAssessment(1, "MidTermExam", 20, 2, 2024, 40, 30);
        oop.addAssessment(1, "Final Term Exam", 4, 3, 2024, 50, 45);

        dld.addAssessment(1, "Quiz", 1, 2, 2024, 20, 12);
        dld.addAssessment(2, "Quiz", 5, 2, 2024, 10, 9);
        dld.addAssessment(3, "Quiz", 10, 2, 2024, 15, 15);
        dld.addAssessment(4, "Quiz", 25, 2, 2024, 20, 19);
        dld.addAssessment(1, "Assignment", 3, 2, 2024, 20, 19);
        dld.addAssessment(2, "Assignment", 8, 2, 2024, 20, 19);
        dld.addAssessment(3, "Assignment", 13, 2, 2024, 25, 20);
        dld.addAssessment(4, "Assignment", 27, 2, 2024, 20, 16);
        dld.addAssessment(1, "MidTermExam", 20, 2, 2024, 40, 39);
        dld.addAssessment(1, "Final Term Exam", 4, 3, 2024, 50, 48);

        eng.addAssessment(1, "Quiz", 1, 2, 2024, 20, 12);
        eng.addAssessment(2, "Quiz", 5, 2, 2024, 10, 9);
        eng.addAssessment(3, "Quiz", 10, 2, 2024, 15, 15);
        eng.addAssessment(4, "Quiz", 25, 2, 2024, 20, 19);
        eng.addAssessment(1, "Assignment", 3, 2, 2024, 20, 19);
        eng.addAssessment(2, "Assignment", 8, 2, 2024, 20, 19);
        eng.addAssessment(3, "Assignment", 13, 2, 2024, 25, 20);
        eng.addAssessment(4, "Assignment", 27, 2, 2024, 20, 16);
        eng.addAssessment(1, "MidTermExam", 20, 2, 2024, 40, 39);
        eng.addAssessment(1, "Final Term Exam", 4, 3, 2024, 50, 48);

        math.addAssessment(1, "Quiz", 1, 2, 2024, 20, 12);
        math.addAssessment(2, "Quiz", 5, 2, 2024, 10, 9);
        math.addAssessment(3, "Quiz", 10, 2, 2024, 15, 15);
        math.addAssessment(4, "Quiz", 25, 2, 2024, 20, 19);
        math.addAssessment(1, "Assignment", 3, 2, 2024, 20, 19);
        math.addAssessment(2, "Assignment", 8, 2, 2024, 20, 19);
        math.addAssessment(3, "Assignment", 13, 2, 2024, 25, 20);
        math.addAssessment(4, "Assignment", 27, 2, 2024, 20, 16);
        math.addAssessment(1, "MidTermExam", 20, 2, 2024, 40, 39);
        math.addAssessment(1, "Final Term Exam", 4, 3, 2024, 50, 48);

        phy.addAssessment(1, "Quiz", 1, 2, 2024, 20, 12);
        phy.addAssessment(2, "Quiz", 5, 2, 2024, 10, 9);
        phy.addAssessment(3, "Quiz", 10, 2, 2024, 15, 15);
        phy.addAssessment(4, "Quiz", 25, 2, 2024, 20, 19);
        phy.addAssessment(1, "Assignment", 3, 2, 2024, 20, 19);
        phy.addAssessment(2, "Assignment", 8, 2, 2024, 20, 19);
        phy.addAssessment(3, "Assignment", 13, 2, 2024, 25, 20);
        phy.addAssessment(4, "Assignment", 27, 2, 2024, 20, 16);
        phy.addAssessment(1, "MidTermExam", 20, 2, 2024, 40, 39);
        phy.addAssessment(1, "Final Term Exam", 4, 3, 2024, 50, 48);

        s.registerCourse(oop);
        s.registerCourse(dld);
        s.registerCourse(eng);
        s.registerCourse(math);
        s.registerCourse(phy);

        s.displayState();
        oop.displayState();
//        System.out.println(oop.calculatingCoursePercentage());
//        s.printGradeBook();


    }
}

