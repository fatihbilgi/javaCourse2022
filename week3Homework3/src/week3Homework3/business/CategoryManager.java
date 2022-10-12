package week3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.core.logging.Logger;
import week3Homework3.dataAccess.CategoryDao;
import week3Homework3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
	
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	List<Category> categories = new ArrayList<Category>();
	public void add(Category category) throws Exception {
		for (Category category1:categories) {
			if(category1.getCategoryName()==category.getCategoryName()) {
				throw new Exception("Kategori isimleri aynı. Lütfen değiştirin.");
			}
		}
		categories.add(category);
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	
	
}
