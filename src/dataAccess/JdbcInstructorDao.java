package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen bilgileri jdbc ile veritabanına eklendi.");
		
	}

}
