package spring.example.spring.API.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.example.spring.API.repository.StudentRepository;

@Service
public class ExamService {
    @Autowired
    StudentRepository studentRepository;
    public Integer getStudentResultById(String id){
        return studentRepository.getResultById(id);
    }
}
