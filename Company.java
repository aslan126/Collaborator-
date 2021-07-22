import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;


public class Company {
    private String compName = new String();
    private ArrayList<Employee> employees;

    public Company(String compName, ArrayList<Employee> employees){
        this.compName =compName;
        this.employees = employees;
    }

    public Company(){
        this.compName ="";
        this.employees = new ArrayList<Employee>();
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void addEmployees(Employee employeeex) {
        employees.add(employeeex);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void creatingCompany(String compName, int numbofEmployees, int expertise){
        setCompName(compName);
        Random rand = new Random();
        for (int i=1; i<=numbofEmployees; i++){
            int [] expArray = new int[4];
            //Minding the expertise with minimum experience level
            for (int j=0; j<expertise-1; j++){
                expArray[j] = rand.nextInt(100)+1;
            }
            expArray[expertise-1] = (int) (Math.random() * 70 + 30);
            for (int k =expertise; k<4; k++){
                expArray[k] = rand.nextInt(100)+1;
            }
            int randDept = (int) (Math.random() * (4) +1);
            Employee ex = new Employee(i, randDept, expArray,0);
            addEmployees(ex);
        }
    }
    
    public String toString(){
    	String x = "\n \n"+
    			"Your collaboration result is below: \n"
    			+"Company name: "+compName+"\n"
    			+"List of employees with group names: \n"
    			+"id Department ExpertiseLevels Group";
    	
    	for (int i =0; i<employees.size();i++) {
    		x = x + "\n" + employees.get(i).toString();
    	}
    	return x;
    }

}
