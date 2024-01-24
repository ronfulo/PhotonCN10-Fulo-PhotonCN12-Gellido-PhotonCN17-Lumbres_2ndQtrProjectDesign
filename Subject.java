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
public class Subject {
    private String subName;
    private ArrayList<Teacher> SubjTeachers;
    private float unit;
    
    public Subject(String n, float u) {
        this.subName = n;
        this.unit = u;
    }
    public void addTeacher(Teacher t) {
        this.getSubjTeachers().add(t);
    }

    /**
     * @return the subName
     */
    public String getSubName() {
        return subName;
    }

    /**
     * @param subName the subName to set
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * @return the SubjTeachers
     */
    public ArrayList<Teacher> getSubjTeachers() {
        return SubjTeachers;
    }

    /**
     * @param SubjTeachers the SubjTeachers to set
     */
    public void setSubjTeachers(ArrayList<Teacher> SubjTeachers) {
        this.SubjTeachers = SubjTeachers;
    }

    /**
     * @return the unit
     */
    public float getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(float unit) {
        this.unit = unit;
    }
}
