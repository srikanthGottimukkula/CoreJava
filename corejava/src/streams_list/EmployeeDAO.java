package streams_list;

import java.util.*;

public class EmployeeDAO {

		
	public static List<Employee>  getEmployees(){
	List<Employee> list = new ArrayList<>();
	list.add(new Employee(1,"srikanth","eee",800));
	list.add(new Employee(2,"abhiram","ece",900));
	list.add(new Employee(3,"srikrishna","ece",700));
	list.add(new Employee(4,"ram","cse",600));
	list.add(new Employee(5,"shiva","eee",400));
	
	return list;
	
	
	}
	
	
	
	
}
