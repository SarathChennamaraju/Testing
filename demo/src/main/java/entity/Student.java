package entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Student {
    
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    private int id;
    
	
	private String name;
    private int age;
    private double salary;
	public Student(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void performSomeAction() {
        // Example method where logging is added
        Logger.debug("Performing some action for student: {}", name);
        // Business logic...
        logger.info("Action completed for student: {}", name);
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}