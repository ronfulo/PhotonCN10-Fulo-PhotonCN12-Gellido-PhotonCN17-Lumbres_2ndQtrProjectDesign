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
public class Teacher {
    protected String name;
    protected Subject Specialization;
    protected ArrayList<Section> handledSections;
    
    public Teacher(String n, Subject s) {
        this.name = n;
        this.Specialization = s;
        this.handledSections = new ArrayList<> ();
    }
    public void assignTask(Task t, Student s) {
        s.TaskList.add(t);
    }
    public void assignTask(Task t, Section s) {
        for (Student student : s.students) {
            student.TaskList.add(t);
        }
    }
}
