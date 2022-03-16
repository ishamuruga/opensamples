package com.mycompany.mybankapi.api;

import java.util.List;
import java.util.Optional;

import com.mycompany.mybankapi.exceptions.UnderAgeStudentException;
import com.mycompany.mybankapi.model.Student;
import com.mycompany.mybankapi.service.StudentsManager;
import com.mycompany.mybankapi.service.StudentsManagerImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class StudentsController extends BaseController{

    Logger logger = LoggerFactory.getLogger(StudentsController.class);

    //private StudentsManager manager = new StudentsManagerImpl();

    @Autowired
    private StudentsManager manager;
    
    @GetMapping(value="/fetch",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> fetchAllStudets(){
        logger.debug(this.getStudents().toString());
        return new ResponseEntity<List<Student>>(this.getStudents(),HttpStatus.OK);
    }

    @GetMapping(value="/fetch/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> fetchById(@PathVariable int id){

        Optional<Student> stu = this.getStudents().stream().filter(x->x.getId()==id).findFirst();

        if (stu.get() != null){
            return new ResponseEntity<Student>(stu.get(),HttpStatus.OK);
        } else {
            return new ResponseEntity<Student>(new Student("",""),HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value="/save",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> savedata(@RequestBody Student req) throws IllegalAccessException, UnderAgeStudentException {
        
        Student stu = manager.add(req);

        return new ResponseEntity<Student>(stu,HttpStatus.OK);
    }


}
