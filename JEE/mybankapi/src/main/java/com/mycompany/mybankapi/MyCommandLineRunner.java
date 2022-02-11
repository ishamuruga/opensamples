package com.mycompany.mybankapi;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.mycompany.mybankapi.model.AutonomousCollege;
import com.mycompany.mybankapi.model.DeemedUniv;
import com.mycompany.mybankapi.model.MathsTeacher;
import com.mycompany.mybankapi.model.PhysicsTeacher;
import com.mycompany.mybankapi.model.Student;
import com.mycompany.mybankapi.model.StudentType;
import com.mycompany.mybankapi.model.Subject;
import com.mycompany.mybankapi.repo.TeacherRepo;
import com.mycompany.mybankapi.service.CollegeManager;
import com.mycompany.mybankapi.service.StudentsManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private StudentsManager sManager;

    @Autowired
    private CollegeManager cManager;

    @Autowired
    private TeacherRepo tRepo;

    @Override
    public void run(String... args) throws Exception {
        
        String name = "Rajini" + UUID.randomUUID().toString();
        String email = "Rajini@gmail" + UUID.randomUUID().toString() + ".com";
        Student stu1 = new Student(name ,email);

        Subject sub1 = new Subject();
        sub1.setMarksScored(89);
        sub1.setName("Maths");
        sub1.setPassedDate(new Date());

        Subject sub2 = new Subject();
        sub2.setMarksScored(81);
        sub2.setName("Lang");
        sub2.setPassedDate(new Date());

        Subject sub3 = new Subject();
        sub3.setMarksScored(77);
        sub3.setName("Science");
        sub3.setPassedDate(new Date());
        
        List<Subject> subjects = Arrays.asList(
            sub1,sub2,sub3
        );

        stu1.setSubjects(subjects);

        StudentType sType = new StudentType();
        sType.setName("PART");

        stu1.setType(sType);
        
        sManager.add(stu1);

        DeemedUniv dm1 = new DeemedUniv();
        dm1.setAddress("Address123");
        dm1.setCountofPrograms(4);
        dm1.setName("DmUni" + UUID.randomUUID().toString());
        dm1.setPhdOffered(true);

        AutonomousCollege am1 = new AutonomousCollege();
        am1.setAddress("am address");
        am1.setAffUniName("Chennai Unin");
        am1.setName("Coll Name" + UUID.randomUUID().toString());
 
        //cManager.save(dm1);
        //cManager.save(am1);

        System.out.println("===============================done");

        //cManager.fetchAll().forEach(System.out::println);

        //System.out.println(sManager.findbyId(1l));  

        MathsTeacher mt = new MathsTeacher();
        mt.setCoreSub("algebra");
        mt.setMaxHours(25);
        mt.setName("Engineering Maths by M K Venkararaman");

        PhysicsTeacher pt = new PhysicsTeacher();
        pt.setName("Ballani");
        pt.setWeeks(2);

        tRepo.save(mt);
        tRepo.save(pt);

        tRepo.findAll().forEach(System.out::println);
    }
    
}
