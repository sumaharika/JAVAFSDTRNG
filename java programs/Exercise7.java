package practice1;

abstract class Emplo {
	private String name;
	private int EmploHour;
	void display() {
		System.out.println("name is  "+name+"\n" +"Exercise hour is" +" EmploHour");
	}
	public Emplo() {
		
	}
	public Emplo(String name, int EmploHour) {
		this.name=name;
		this.EmploHour = EmploHour;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
			return name;
			
	}
	
	    
	 public void setEmploHour(int paymentPerHour, int EmploHour) {
	   this.EmploHour=EmploHour; 
	    	
	    }
	    public int getEmploHour() {
	    	return EmploHour;
	    }
	    abstract void salary(int x,int y);
}
public  class Exercise7 extends Emplo{
	Exercise7(){
		super();
	 }
	 Exercise7(String name,int EmploHour){
		 super(name,EmploHour);
		 
	 }
	 void salary(int days,int total_sal) {
		 if((total_sal/days)>500){
			 System.out.println("The pay is Good");
			 
		 }
		 else {
			 System.out.println("The pay is not Good");
		 }
	 }
	 public static void main(String[]args) {
		 Exercise7 e1=new Exercise7("suma",20);
		 e1.display();
		 Exercise7 e2=new Exercise7();
		 e2.setName("harika");
		 System.out.println(e2.getname());
		 e2.salary(10,10000);
		 
		 }
	 
	 
}

