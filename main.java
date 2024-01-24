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
        Student s2 = new Student("Runa");
        Subject chem = new Subject("Chemistry", 1);
        SchoolReq sr1 = new SchoolReq("Chem Pre-Lab", chem, jan31, 5, 2, true);
        SchoolReq sr2 = new SchoolReq("Chem quiz", chem, jan31, 3, 2, true);
        System.out.println("Scenario A");
        s1.addTask(sr1);
        s1.checkProgress(sr1);
        s1.markDone(sr1);
        System.out.println("Scenario B");
        s2.addTask(sr2);
        s2.checkProgress(sr2);
        s2.startTask(sr2);
        s2.checkProgress(sr2);
        s2.markDone(sr2);
        //Scenario 2 implementations are in classes
        
    }
}
