package com.wym.model;

import java.io.Serializable;

public class Emp implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.eid
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    private Object company;

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    private Integer eid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.name
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.sex
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.email
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.salary
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    private String salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp.cid
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    private Integer cid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.eid
     *
     * @return the value of emp.eid
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.eid
     *
     * @param eid the value for emp.eid
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.name
     *
     * @return the value of emp.name
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.name
     *
     * @param name the value for emp.name
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.sex
     *
     * @return the value of emp.sex
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.sex
     *
     * @param sex the value for emp.sex
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.email
     *
     * @return the value of emp.email
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.email
     *
     * @param email the value for emp.email
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.salary
     *
     * @return the value of emp.salary
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public String getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.salary
     *
     * @param salary the value for emp.salary
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp.cid
     *
     * @return the value of emp.cid
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp.cid
     *
     * @param cid the value for emp.cid
     *
     * @mbg.generated Wed Jan 17 16:58:27 CST 2018
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }
}