package week3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.core.logging.Logger;
import week3Homework3.dataAccess.CourseDao;
import week3Homework3.entities.Course;

public class CourseManager {
	CourseDao courseDao;
	private Logger[] loggers;
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	List<Course> courses = new ArrayList<Course>();
	public void add(Course course)throws Exception {
		for(Course course1:courses) {
			if(course1.getCourseName()==course.getCourseName()) {
				throw new Exception("Kurs ismi aynı. Lütfen değiştirin");
			}
		}
		
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük lütfen değiştirin.");
		}
		
		courses.add(course);
		courseDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	
}
