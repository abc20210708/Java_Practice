package haetbit.person_Answer.person.model.vo;

public class Person {
// 필드부
	private String name;		// 이름
	private int age;				// 나이
	private double height;	// 키
	private double weight;	// 몸무게
	
// 생성자부
	public Person() {}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}	
	
// 메소드부
	// getter /setter 메소드
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {		this.age = age;	}
	public double getHeight() {		return height;	}
	public void setHeight(double height) {		this.height = height;	}
	public double getWeight() {		return weight;	}
	public void setWeight(double weight) {		this.weight = weight;	}
		
	// toString() 메소드
	@Override
	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight;
	}
	
}
