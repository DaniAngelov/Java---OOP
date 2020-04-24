// github.com/DaniAngelov

public class Computer 
{
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;
	
	Computer()
	{
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}
	Computer(int year, double price,double hardDiskMemory,double freeMemory)
	{
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	Computer(int year, double price,boolean isNotebook,
			double hardDiskMemory,double freeMemory, String operationSystem)
	{
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	int comparePrice(Computer c)
	{
		if(this.getPrice() > c.getPrice())
		{
			System.out.println("First computer is more expensive than the second one");
		return -1;
		}
		else if(this.getPrice() == c.getPrice())
		{
			System.out.println("Both computers are at the same price");
			return 0;
		}
		else 
		{
			System.out.println("First computer is cheaper than the second one");
			return 1;
		}
	}
	
	
//	void changeOperationSystem(String newOperationSystem)
//	{
//		this.operationSystem = newOperationSystem;
//	}
//	
//	void useMemory(int memory)
//	{
//		if(this.freeMemory - memory < 0)
//			System.out.println("Not enough free memory!");
//		else
//			this.freeMemory -= memory;
//	}
//	
//	void print()
//	{
//		
//		
//		System.out.println("Year: " + year);
//		System.out.println("Price: " + price);
//		System.out.println("It's a notebook: " + isNotebook);
//		System.out.println("Hard Disk Memory: " + hardDiskMemory);
//		System.out.println("Free Memory: " + freeMemory);
//		System.out.println("Operation System: " + operationSystem);
//		
//		System.out.println("-----------------------------");
//	}
}
