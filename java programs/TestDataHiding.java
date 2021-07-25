package practice1;
//Encapsulation
class TestData{
	private String name;
	private int age;
	private float salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float Salary) {
		this.salary = Salary;
	}
}

public class TestDataHiding {

	public static void main(String[] args) {
		TestData t= new TestData();
		t.setName("suma");
		t.setSalary(25000);
		t.setAge(22);
		System.out.println(t.getName()+" "+t.getSalary()+" "  +t.getAge());
				
	}

}
