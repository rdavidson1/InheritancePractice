/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Ryan
 */
public class Employee {
  private String employeeFName;
  private String employeeLName;
  private String employeeID;
  private int employeeAge;

    public String getEmployeeFName() {
        return employeeFName;
    }

    public String getEmployeeLName() {
        return employeeLName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeFName(String employeeFName) {
        this.employeeFName = employeeFName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }
    
    public void setEmployeeLName(String employeeLName) {
        this.employeeLName = employeeLName;
    }
}
