/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Ryan
 */
public abstract class Employee {
  private String employeeFName;
  private String employeeLName;
  private String employeeID;

    public String getEmployeeFName() {
        return employeeFName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

   

    public void setEmployeeFName(String employeeFName) {
        this.employeeFName = employeeFName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

   

    public String getEmployeeLName() {
        return employeeLName;
    }

    public void setEmployeeLName(String employeeLName) {
        this.employeeLName = employeeLName;
    }
    
}
