import java.util.ArrayList;
import java.util.Scanner;
public class Collaborator {
    public static void main(String[] args) {
        System.out.println("Welcome to Collaborator");
        System.out.println("What is your company name?");
        Scanner scan=new Scanner(System.in);
        String companyname = scan.next();
        System.out.println("How many employees work in your company? (Give a number between 30-50)");
        int numofEmployee = scan.nextInt();
        //Verification
        while(numofEmployee>50 || numofEmployee<30) {
        	System.out.println("Please enter a value between 30-50!");
        	numofEmployee =scan.nextInt();		
        }
        System.out.println("What is your field of expertise?");
        System.out.println("Press 1 for: Technology \n Press 2 for: Trading \n Press 3 for: Operations \n Press 4 for: Shared Services");
        int expField =scan.nextInt();
        while(expField>4 || expField<1) {
        	System.out.println("Please enter a value between 1-4!");
        	expField =scan.nextInt();		
        }


        Company compex = new Company();
        compex.creatingCompany(companyname, numofEmployee, expField);


        //Collaboration
        //Divide # by 4 create groups of 4 rest add to first 3 groups
        //Choose one person from each department add to group
        //
        int[] findMin = new int[4];
        for(int n=0; n<numofEmployee; n++) {
        	Employee y = compex.getEmployees().get(n);
            int yd = compex.getEmployees().get(n).getDepartment();
            switch(yd) {
            case 1: {findMin[0]+=1;};
				break;
            case 2: {findMin[1]+=1;};
				break;
            case 3: {findMin[2]+=1;};
				break;
            case 4: {findMin[3]+=1;};
				break;
            default: System.out.println("Error Check Inputs!");	
            }
            }
        int noOfGroups=0;
        for(int i=0; i<4; i++) {
        	for (int j=1; j<4; j++) {
        		if(findMin[j]<findMin[i]) {
        			noOfGroups=findMin[j];
        		}
        	}
        }
        
        for(int d=1; d<=4; d++){
            int gg =1;
            for(int n=0; n<numofEmployee; n++) {
                Employee y = compex.getEmployees().get(n);
                int yd = compex.getEmployees().get(n).getDepartment();
                if(yd == d){
                    int yn = y.getGroup();
                    if(yn==0){
                        if(!(gg<=noOfGroups)){
                        gg=1;}
                        y.setGroup(gg);
                        gg=gg+1;
                    }
                }

            }
        }
       System.out.println(compex);

    }}

