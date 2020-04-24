// github.com/DaniAngelov

public class College {

	public static void main(String[] args) 
	{
		Student s1 = new Student("Ivan", "Informatika",22);
		Student s2 = new Student("Dani", "Informacionni sistemi",25);
		Student s3 = new Student("Joro", "Informatika",29);
		Student s4 = new Student("Ivo", "Softuerno injenerstvo",31);
		Student s5 = new Student("Kaloqn", "Informatika",24);
		Student s6 = new Student("Vladimir", "Informatika",25);
		Student s7 = new Student("Jivko", "Informatika",20);
		Student s8 = new Student("Boro", "Informatika",21);
		
		s1.receiveScholarship(3, 300);
		s2.receiveScholarship(3.75, 2000);
		s3.receiveScholarship(3.50, 1000);
		
		s4.upYear();
		s5.upYear();

		
		StudentGroup g1 = new StudentGroup("Informacionni sistemi");
		StudentGroup g2 = new StudentGroup("Softuerno injenerstvo");
		StudentGroup g3 = new StudentGroup("Informatika");
		
		
		g1.addStudent(s2);
		g2.addStudent(s4);
		g3.addStudent(s5);
		g3.addStudent(s1);
		g3.addStudent(s6);
		g3.addStudent(s7);
		g3.addStudent(s8);
		g3.printStudentInGroup();
		
		s7.setGrade(5.0);
		
		
		g3.theBestStudent();
	}

}
