package Ejercicio_2;

public class Student extends Person {
	private String course;
	private String degree;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String course, String degree) {
		super(name, age);
		this.course = course;
		this.degree = degree;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", degree=" + degree + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
