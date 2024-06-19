package model.DB;

import java.util.ArrayList;
import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

public class DataBase {

    public static List<Student> studentsDB = new ArrayList<>();
    public static List<Teacher> teacherDB = new ArrayList<>();
    
    
    public static List <StudentGroup> studentGroups = new ArrayList<>();
      
    
    public static void fillDB(){
        
        Student s1 = new Student(1, "Irina", "Svetlova", 1);
        Student s2 = new Student(2, "Sergey", "Krotov", 1);
        Student s3 = new Student(3, "Olga", "Sidorova", 1);
        Student s4 = new Student(4, "Anton", "Firsov", 1); 
        studentsDB.add(s1);
        studentsDB.add(s2);
        studentsDB.add(s3);
        studentsDB.add(s4);
   
        Teacher t1 = new Teacher(1, "Ivan", "Иванов", 1);
        Teacher t2 = new Teacher(2, "Artem", "Trofimov", 1);
        teacherDB.add(t1);
        teacherDB.add(t2);

       
    }       
}

