package problemstatement;

public class employee {
	private int id;
	private String name;
	private float salary;
	private String location;
	private int age;
	public employee(int id, String name, float salary,String location,int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", location=" + location + ", age="
				+ age + "]";
	}

	

}
