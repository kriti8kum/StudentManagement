package spring.example.spring.API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.example.spring.API.models.Student;
import spring.example.spring.API.repository.StudentRepository;
@Service

public class StudentService {
   @Autowired
    StudentRepository studentRepository;
    public void saveStudent(Student student){
        System.out.println("Student  object recived service layer");
        studentRepository.saveStudent(student);
        System.out.println("student got saved in db");
    }

    public void updateStudentResultById(String id, int marks){
     studentRepository.updateStudentResultById(id, marks);
    }
    public Student getStudentById(String id){
        return studentRepository.getStudentById(id);
    }
    public Student updateStudentById(String id, Student student){
        return studentRepository.updateStudentById(id, student);
    }
}
