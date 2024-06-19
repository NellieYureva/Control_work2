package model;

import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class StudentGroup {

    private Teacher teacher;
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private List<Student> studentsDB;  
    
    public List<Student> getStudentsDB() {
        return studentsDB;
    }

    public void setStudentsDB(List<Student> studentsDB) {
        this.studentsDB = studentsDB;
    }

    public StudentGroup(Teacher teacher, List <Student> students) {
        this.teacher = teacher;
        this.studentsDB = students;        
    }  
    
}
    


   

