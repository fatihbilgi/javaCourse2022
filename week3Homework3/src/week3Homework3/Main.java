package week3Homework3;

import week3Homework3.business.CategoryManager;
import week3Homework3.business.CourseManager;
import week3Homework3.core.logging.DatabaseLogger;
import week3Homework3.core.logging.FileLogger;
import week3Homework3.core.logging.Logger;
import week3Homework3.core.logging.MailLogger;
import week3Homework3.dataAccess.HibernateCategoryDao;
import week3Homework3.dataAccess.HibernateCourseDao;
import week3Homework3.dataAccess.JdbcCategoryDao;
import week3Homework3.entities.Category;
import week3Homework3.entities.Course;
import week3Homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category = new Category(001, "Java");
		Course course = new Course(01,"Java 2022 Kampı",10);
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);

	}

}
