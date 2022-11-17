import java.util.Scanner;

class Area{
	int length,breadth;
	void setDim(int x, int y){
		this.length=x;
		this.breadth=y;
	}
	
	int getArea(){
		int area=length*breadth;
		System.out.println("Area of the Rectangle: "+area);
		return area;
	}
}

class AreaCO{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length: ");
		int x=sc.nextInt();
		System.out.print("Enter the breadth: ");
		int y=sc.nextInt();
		
		Area a=new Area();
		a.setDim(x,y);
		a.getArea();
		
	}
}