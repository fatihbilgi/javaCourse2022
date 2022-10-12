package week3Homework3.dataAccess;

import week3Homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	
	public void add(Instructor instructor) {
		System.out.println("Eğitmen veritabanına eklendi: Hibernate");
		
	}


}
