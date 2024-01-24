/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q2aa;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.ArrayList;
/**
 *
 * @author Jhoenica C. Gellido
 */
public abstract class Task {
    private String name;
    private String description;
    private LocalDateTime deadline;
    private boolean isFinished;
    private boolean inProgress;
    private int importance;
    private int totalTime;
    boolean setInProgress;
    boolean setIsFinished;
   
    
    public Task(String n, LocalDateTime d, int imp, int tot) {
        this.name = n;
        this.deadline = d;
        this.isFinished = false;
        this.inProgress = false;
        this.importance = imp;
        this.totalTime = tot;
        this.description = "";
    }
    public Task (String n, LocalDateTime d, String desc, int imp, int tot) {
        this.name = n;
        this.deadline = d;
        this.isFinished = false;
        this.inProgress = false;
        this.importance = imp;
        this.totalTime = tot;
        this.description = desc;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the deadline
     */
    public LocalDateTime getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the isFinished
     */
    public boolean isIsFinished() {
        return isFinished;
    }

    /**
     * @param isFinished the isFinished to set
     */
    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    /**
     * @return the inProgress
     */
    public boolean isInProgress() {
        return inProgress;
    }

    /**
     * @param inProgress the inProgress to set
     */
    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * @return the importance
     */
    public int getImportance() {
        return importance;
    }

    /**
     * @param importance the importance to set
     */
    public void setImportance(int importance) {
        this.importance = importance;
    }

    /**
     * @return the totalTime
     */
    public int getTotalTime() {
        return totalTime;
    }

    /**
     * @param totalTime the totalTime to set
     */
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

}
