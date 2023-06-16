package assignment11;

import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		
		HashMap<Key,Student> studentMap = new HashMap<>();
		
	    for(Student tmp : students)
		    studentMap.put(new Key(tmp.getFirstName(), tmp.getLastName()), tmp);
		
		return studentMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
        double maxGPA = 0;
        
        for(Student tmp : maps.values())
        	maxGPA += tmp.getGpa();
        
		//implements
		return (maxGPA / maps.size());	 		  
}
}