/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Jhoenica C. Gellido
 */
public class Student {
    protected String name;
    protected ArrayList<Task> TaskList = new ArrayList<>();
    protected static ArrayList<Student> StudentUsers = new ArrayList<>();
    
    public Student(String n) {
        this.name = n;
        this.TaskList = new ArrayList<> ();
        StudentUsers.add(this);
    }
    public void addTask(Task t) {
        this.TaskList.add(t);
    }
    public void startTask(Task s) {
        s.setInProgress(true);
        System.out.println(s.getName() + " is in progress.");
    }
    public void checkProgress(Task t) {
        if(t.isInProgress() == true && t.isIsFinished() == false) {
            System.out.println("Current Status: in progress");
        }
        else if (t.isInProgress() == false && t.isIsFinished() == false) {
            System.out.println("Current Status: not yet started");
        }
        else if (t.isIsFinished() == true) {
            System.out.println("Task is already done");
        }
    }
    public void markDone(Task t) {
        t.setIsFinished(true);
        this.TaskList.remove(t);
        System.out.println("Congratulations! " + t.getName() + " is completed." );
    }
    public void showList() {
        System.out.println("Unfiltered task list: ");
        for(Task t: this.TaskList) {
            System.out.println(t.getName());
        }
        System.out.println("Number of tasks: " + this.TaskList.size());
    }
    public void showListBySub(Subject s) {
        System.out.println("Tasks for " + s.getSubName());
        for(Task t: this.TaskList) {
            if (t instanceof SchoolReq) {
                SchoolReq schoolTask = (SchoolReq) t;
                
                if (schoolTask.getSubject().equals(s)) {
                    System.out.println(schoolTask.getName());
                }
            }
        }
    }
    public void sortTasksByDeadline() {
        int thisCount = 0;
        Comparator<Task> deadlineComparator = Comparator.comparing(Task::getDeadline);
        Collections.sort(this.TaskList, deadlineComparator);
        System.out.println("Sorted task list by deadline:");
        for (Task t : this.TaskList) {
            System.out.println(t.getName() + " - Deadline: " + t.getDeadline());
            thisCount++;
        }
        System.out.println("Total tasks: " + thisCount);
    }
    public void bonusLangGustoKo() {
        System.out.println("ECs with incentive");
        for(Task t: this.TaskList) {
            if (t instanceof Extracurriculars) {
                Extracurriculars EC = (Extracurriculars) t;
                
                if (EC.isAddsToGrade() == true) {
                    System.out.println(EC.getName());
                }
            }
        }
    }
}
