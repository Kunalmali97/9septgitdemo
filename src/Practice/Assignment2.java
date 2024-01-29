package Practice;

public class Assignment2 {
	
	//for same area
//	public int land(int l,int b) 
//	{
//		int land1=l*b;
//		int land2=l*b;
//		int land3=l*b;
//		int land4=l*b;
//		int total= land1+land2+land3+land4;
//		//int land3=l*b;
//		System.out.println(total);
//		return total;
//	}
//	
//	public static void main(String[] args) {
//		Assignment2 a = new Assignment2();
//		a.land(10,20);
//	}

	
	
	//using object calculate area
	
	public int LandArea(int a,int b) {
		
		int area=a*b;
		System.out.println(area);
		return area;
	}
	
	public static void main(String[] args) {
		Assignment2 a = new Assignment2();
		
		System.out.print("area1 is "); 
		int area1= a.LandArea(12, 20);
		
		System.out.print("area2 is "); 
		int area2= a.LandArea(23, 21);
		
		System.out.print("area3 is "); 
		int area3= a.LandArea(4, 30);
		
		
		int total_area=area1+area2+area3;
		System.out.println("the total land area is : "+total_area);
	}

}
