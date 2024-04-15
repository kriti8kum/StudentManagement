package spring.example.spring.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.example.spring.API.models.Student;
import spring.example.spring.API.service.ExamService;
import spring.example.spring.API.service.StudentService;

@RestController
public class studentController {
    @Autowired
    StudentService studentService;

    @Autowired
    ExamService examService;

    @GetMapping("/students/details")
    public String getStudents(){
        return "Hello";
    }

    @GetMapping("/student/details")
    public Student getStudentDetailsById(@RequestParam String id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/students/upload")
    public String uploadStudent(@RequestBody Student student){
        System.out.println("request recvied in controller layer");
        studentService.saveStudent(student);
    return "Student got saved";
}

@PutMapping("/students/marks/update")
public  void updateMarks(@RequestParam String id, @RequestParam int marks){
    studentService.updateStudentResultById(id, marks);
}

@GetMapping("/students/marks")
public Integer studentMarksById(@RequestParam  String id){
        return examService.getStudentResultById(id);
}
@PutMapping("/students/details/update")
    public Student updateStudentById(@RequestParam String id, @RequestBody Student student){
        return studentService.updateStudentById(id, student);
}

}