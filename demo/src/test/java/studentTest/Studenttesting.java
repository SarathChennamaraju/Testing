package studentTest;

import org.junit.jupiter.api.Test;

import entity.Student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class Studenttesting {

    @Test
    public void testGettersAndSetters() {
        // Arrange
    //	Student p1;
    //	@BeforeEach
    //	public  before() {
           Student student = new Student(1,"John", 25, 50000.0);
    	//}
    	
    	
    //	@AfterEach
    //	public void after() {
    //		p1=null;
    //	}
        

        // Act
 //       student.setId(1);
  //      student.setName("John");
   //     student.setAge(25);
   //     student.setSalary(50000.0);

        // Assert
        @Test
        public static void testGetId(){
        assertEquals(1, student.getId());
        }
        assertEquals("John", student.getName());
        assertEquals(25, student.getAge());
        assertEquals(50000.0, student.getSalary(), 0.001);
    }

    @Test
    public void testEqualsAndHashCode() {
        // Arrange
        Student student1 = new Student(1L, "John", 25, 50000.0);
        Student student2 = new Student(1L, "John", 25, 50000.0);
        Student student3 = new Student(2L, "Alice", 22, 45000.0);

        // Assert
        assertTrue(student1.equals(student2) && student2.equals(student1));
        assertEquals(student1.hashCode(), student2.hashCode());

        assertFalse(student1.equals(student3) || student3.equals(student1));
        assertNotEquals(student1.hashCode(), student3.hashCode());
    }

    @Test
    public void testToString() {
        // Arrange
        Student student = new Student(1L, "John", 25, 50000.0);

        // Act
        String toStringResult = student.toString();

        // Assert
        assertTrue(toStringResult.contains("id=1"));
        assertTrue(toStringResult.contains("name=John"));
        assertTrue(toStringResult.contains("age=25"));
        assertTrue(toStringResult.contains("salary=50000.0"));
    }

    // Additional test cases as needed

}
