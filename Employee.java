/*
 * Author: 
 * Employee class has all the attributes that are associated in resemblance of a real employee.
 * Parameters are id, department, experience factors, group no.
 * Listed methods are mostly get and set methods along with a toString method to print out
 * these employee attributes in a concise and user-friendly format.
 */

import java.io.*;
import java.util.*;

public class Employee {
    private int id;
    private int department;
    private int[] expFactor= new int[4];
    private int group;


    public Employee(int id, int department, int[] expFactor, int group) {
        this.id = id;
        this.department = department;
        this.expFactor = expFactor;
        this.group = group;
    }

    public Employee(){
        this.id=0;
        this.department=0;
        this.expFactor=new int[]{0,0,0,0};
        this.group=0;
    }

    public int getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setGroup(int groupno) {
        this.group=groupno;
    }

    public int getGroup(){
        return group;
    }

    public int getId() {
        return id;
    }

    public int[] getExpFactor() {
        return expFactor;
    }

    public void setExpFactor(int[] expFactor) {
        this.expFactor = expFactor;
    }
    
    //Since departments are stored as integers using switch here to update them to department names
    //Turning the employee class into a printable format with attribute information along.
    public String toString(){
    	String a;
    	switch(department) {
    	case 1: a="Technology";
    			break;
    	case 2: a="Trading";
    			break;
    	case 3: a="Operations";
				break;
    	case 4: a="Shared Services";
				break;
		default: a="Invalid Department";
    	}
    	return "id: "+id+" "+"Department: "+a+" "+"tech_exp: "+Integer.toString(expFactor[0])+
    											" trade_exp: "+Integer.toString(expFactor[1])+
    											" op_exp: "+Integer.toString(expFactor[2])+
    											" shared_exp: "+Integer.toString(expFactor[3])+
    														" group no: "+group+". \n";
    }
}
