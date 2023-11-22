package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Entity.Student;
import jakarta.persistence.Id;
import repository.StudentRepository;
import service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @Autowired
    private StudentRepository studentrepository;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Id id) {
        return studentService.getStudentById(id).orElse(null);
    }

    @PostMapping
    public String saveStudent(@RequestBody Student student) {
         studentService.saveStudent(student);
        return "Student detail saved successfully";   
        }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Id id) {
        studentService.deleteStudent(id);
    }
}
