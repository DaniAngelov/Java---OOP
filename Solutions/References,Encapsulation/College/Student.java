// github.com/DaniAngelov

public class Student
{
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	
	Student()
	{
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	Student(String name,String subject,int age)
	{
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public int getYearInCollege() {
		return yearInCollege;
	}
	public void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isDegree() {
		return isDegree;
	}
	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	void upYear()
	{
		this.setYearInCollege(this.getYearInCollege() + 1);
		
		if(this.getYearInCollege() == 4)
		{
			this.setDegree(true);
			System.out.println("The student has graduated !");
		}		
		
	}
	
	double receiveScholarship(double min,double amount)
	{
		if(this.getGrade() >= min && this.getAge() < 30)
		{
			this.setMoney(this.getMoney() + amount);
			System.out.println("Congratulations ! Your money increased by " + amount + "!");
		}
		
		return this.getMoney();
	}
}
