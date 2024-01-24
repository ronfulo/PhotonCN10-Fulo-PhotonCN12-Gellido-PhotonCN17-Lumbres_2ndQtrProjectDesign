/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2aa;
import java.util.ArrayList;
/**
 *
 * @author Jhoenica C. Gellido
 */
public class Section {
    protected String name;
    protected ArrayList<Student> students;
    public static ArrayList<Section> secdirectory;
    
    public Section(String secname) {
        secdirectory.add(this);
        this.name = secname;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student sheesh) {
        this.students.add(sheesh);
    }
    public void removeStudent(Student sheesh) {
        this.students.remove(sheesh);
    }
}
