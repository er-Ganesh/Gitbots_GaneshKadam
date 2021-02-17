package Giboats;

import java.util.*;

public class AgeComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		
		if(o1.getAge()<o2.getAge())
			return -1;
		else if(o2.getAge()<o1.getAge())
			return +1;
		else
		return 0;
	}

	
}
