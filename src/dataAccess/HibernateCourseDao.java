package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
	
	List<Course> courses;
	public HibernateCourseDao() {
		courses = new ArrayList<Course>();
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs bilgileri Hibernate ile veritabanına eklendi");
		courses.add(course);
		
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

}
