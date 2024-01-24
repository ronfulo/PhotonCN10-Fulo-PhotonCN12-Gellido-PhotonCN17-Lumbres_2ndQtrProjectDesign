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
public class Extracurriculars extends Task {
    private int difficulty;
    private String type;
    private String name;
    private boolean addsToGrade;
    public Extracurriculars(String n, String desc, String t, LocalDateTime ddl, int imp, int tot, int d, boolean a) {
        super(n, ddl, desc, imp, tot);
        this.addsToGrade = a;
        this.type =t;
        this.difficulty = d;
    }

    /**
     * @return the difficulty
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
     * @return the addsToGrade
     */
    public boolean isAddsToGrade() {
        return addsToGrade;
    }

    /**
     * @param addsToGrade the addsToGrade to set
     */
    public void setAddsToGrade(boolean addsToGrade) {
        this.addsToGrade = addsToGrade;
    }
}
