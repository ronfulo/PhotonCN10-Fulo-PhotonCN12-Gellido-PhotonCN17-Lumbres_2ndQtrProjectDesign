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
public class SchoolReq extends Task{
    private String type;
    private Subject subject;
    private boolean isRequired;
    private boolean isIndiv;
    
    public SchoolReq(String n, Subject s, LocalDateTime d, int imp, int tot, boolean ind) {
        super(n, d, imp, tot);
        this.isRequired = true;
        this.isIndiv = ind;
        this.subject = s;
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
     * @return the subject
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * @return the isRequired
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * @param isRequired the isRequired to set
     */
    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * @return the isIndiv
     */
    public boolean isIsIndiv() {
        return isIndiv;
    }

    /**
     * @param isIndiv the isIndiv to set
     */
    public void setIsIndiv(boolean isIndiv) {
        this.isIndiv = isIndiv;
    }
}
