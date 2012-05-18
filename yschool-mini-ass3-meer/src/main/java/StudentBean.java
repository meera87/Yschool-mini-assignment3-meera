/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Meer
 */
@ManagedBean
@SessionScoped
public class StudentBean {

    private String sname;
    private String grade;
    private String subject;
    private int marks;

    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() {
    }

    /**
     * @return the sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname the sname to set
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
   /* public String validateStudent() {
       
        boolean added = true; 
        FacesMessage doneMessage = null;
        String outcome = null;
        if (added) {
        doneMessage = new FacesMessage("Successfully added student marks");
        outcome = "response";
        } else {
        doneMessage = new FacesMessage("Failed to add student marks");
        outcome = "index";
        }
        FacesContext.getCurrentInstance().addMessage(null, doneMessage);
        return outcome;
    }  */
}
