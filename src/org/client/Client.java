package org.client;
//import packagename.classname
import org.test.Company;
import org.test.Employee;

public class Client {

	private void clientId() {
		System.out.println("Client id is 8768");

	}
	private void clientName() {
		System.out.println("Client name is raja");

	}
	
	public static void main(String[] args) {
		
		Client c=new Client();
		c.clientId();
		c.clientId();
		
		Company c1=new Company();
		c1.compId();
		c1.compName();
		
		Employee e=new Employee();
		e.empId();
		e.empName();
		
	}
	
}
