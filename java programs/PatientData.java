package practice1;
class testPatient{
	private String name;
	private int age;
	private boolean  Vaccine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVaccine() {
		return Vaccine;
	}
	public void setVaccine(boolean vaccine) {
		this.Vaccine = vaccine;
	
		if(vaccine == true) {
			System.out.println("good");
		}
		else {
			System.out.println("please get vaccinated soon");
		}
	}
	public boolean getvaccine(boolean b) {
		return Vaccine;
	}
	
}
public class PatientData {

	public static void main(String[] args) {
		testPatient t=new testPatient();
		t.setName("ABC");
		t.setAge(25);
		t.setVaccine(false);
		System.out.println(t.getName()+" "+t.getAge()+" "+t.getvaccine(false));
		
	}

	}

	


