package q2aa;

import java.time.LocalDateTime;

/**
 *
 * @author Jhoenica C. Gellido
 */
public class Q2AA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDateTime jan31 = LocalDateTime.of(2024, 1, 31, 12, 0);
        Student s1 = new Student("Ambher");
        Student s2 = new Student("Ronna");
        Teacher t1 = new Teacher("Sir Tarcy", new Subject("CS", 1));
        Subject chem = new Subject("Chemistry", 1);
        SchoolReq sr1 = new SchoolReq("Chem Pre-Lab", chem, jan31, 5, 2, true);
        SchoolReq sr2 = new SchoolReq("Chem quiz", chem, jan31, 3, 2, true);
        SchoolReq sr3 = new SchoolReq("Exercise07", new Subject("CS", 1), jan31, 4, 2, true);
        System.out.println("Scenario 1");
        s1.addTask(sr1);
        s1.checkProgress(sr1);
        s1.markDone(sr1);
        System.out.println("Scenario 2");
        s2.addTask(sr2);
        s2.checkProgress(sr2);
        s2.startTask(sr2);
        s2.checkProgress(sr2);
        s2.markDone(sr2);
        System.out.println("Scenario 3");
        Section p1 = new Section("A");
        Section p2 = new Section("B");
        t1.assignTask(sr3, p1);
        t1.assignTask(sr3, p2);
        
        for(Student student: p1.students) {
            student.addTask(sr3);
            System.out.println("You have a new task: " + sr3.getName());
        }
        
        for(Student student: p2.students) {
            student.addTask(sr3);
            System.out.println("You have a new task: " + sr3.getName());
        }
        
        Student user = p1.students.get(0);
        user.markDone(sr3);
        System.out.println("Congratz! Task completed and removed from the student's list.");
        
    }
}
