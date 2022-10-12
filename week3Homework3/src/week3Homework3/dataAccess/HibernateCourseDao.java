package week3Homework3.dataAccess;

import week3Homework3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	public void add(Course course) {
		System.out.println("Kurs veritabanına eklendi: Hibernate");

	}

}
