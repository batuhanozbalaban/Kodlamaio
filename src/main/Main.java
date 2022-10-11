package main;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*****--------    Kurslar    --------*****");
		Course course1 = new Course (1,"2022 Java Yazılım Geliştirici Kampı", "java.jpeg", 100);
		Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", "net.png", 90);
		Course course3 = new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "javaScript.png", 50);
		
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		System.out.println("------------------------------------------------------");
		courseManager.getAll();
		System.out.println("*****--------    Kategoriler    --------*****");
		
		Category category = new Category(1, "Programlama");
		Category category2 = new Category(2, "Yazılım");
		Category category3 = new Category(3, "Yazılım");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		
		categoryManager.add(category);
		categoryManager.add(category2);
		categoryManager.add(category3);
		System.out.println("------------------------------------------------------");
		categoryManager.getAll();
		
		System.out.println("*****--------    Eğitmenler    --------*****");
		
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroð");

		Logger[] loggers = { new FileLogger(), new MailLogger() };

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);

		instructorManager.add(instructor);
	}
		

}
