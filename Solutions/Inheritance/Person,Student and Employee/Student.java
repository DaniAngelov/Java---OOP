// github.com/DaniAngelov

public class Student extends Person
{
	private double score;
	
	Student(String name, int age, boolean isMale,double score) 
	{
		super(name, age, isMale);
		if(score >= 2 && score <= 6)
		this.score = score;
		else
			System.out.println("Not correct score");
	}
	
	 void showStudentInfo()
	{
		showPersonInfo();
		System.out.println("score: " + this.score );

	}
	
}
