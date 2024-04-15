package spring.example.spring.API.repository;

import org.springframework.stereotype.Repository;
import spring.example.spring.API.models.Student;

import java.util.HashMap;

@Repository
public class StudentRepository {
    HashMap<String, Student> StudentDB =new HashMap<>();
    HashMap<String,Integer> studentResult = new HashMap<>();

    public void saveStudent(Student student) {
        System.out.println("Request recevied repository layer");
        String id = student.getId();
        System.out.println("Adding student object in  repository layer");
        StudentDB.put(id, student);
        System.out.println("Student got added into the system");
    }
 public Student getStudentById(String id){
        return StudentDB.get(id);
 }
public Integer  getResultById(String id){
        return studentResult.get(id);
}

public void updateStudentResultById(String id, int marks){
    studentResult.put(id , marks);
}
 public Student updateStudentById(String id, Student student) {
     if (!StudentDB.containsKey(id)) {
         return null;
     }
    StudentDB.put(id,student);
     System.out.println(StudentDB);
     return StudentDB.get(id);
 }
}
