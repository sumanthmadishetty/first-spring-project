package com.sumanth.firstSpringProject;

public class Employee {

  private int empNo;
  private String eName;

  public Employee() {
  }

  // public Employee(int empNo, String eName) {
  // this.empNo = empNo;
  // this.eName = eName;
  // }

  public int getEmpNo() {
    return this.empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getEName() {
    return this.eName;
  }

  public void setEName(String eName) {
    this.eName = eName;
  }

  public Employee empNo(int empNo) {
    this.empNo = empNo;
    return this;
  }

  public Employee eName(String eName) {
    this.eName = eName;
    return this;
  }

  // @Override
  // public boolean equals(Object o) {
  // if (o == this)
  // return true;
  // if (!(o instanceof Employee)) {
  // return false;
  // }
  // Employee employee = (Employee) o;
  // return empNo == employee.empNo && Objects.equals(eName, employee.eName);
  // }

  // @Override
  // public int hashCode() {
  // return Objects.hash(empNo, eName);
  // }

  @Override
  public String toString() {
    return "{" + " empNo='" + getEmpNo() + "'" + ", eName='" + getEName() + "'" + "}";
  }

}
