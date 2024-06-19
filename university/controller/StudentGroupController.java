package controller;

import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;
import servise.StudentGroupService;

public class StudentGroupController {
    private StudentGroupService service = new StudentGroupService();

    public Student createStudent(String name, String lastName, int idgroup) {
        return service.createStudent(name, lastName, idgroup);
    }

    public Teacher createTeacher(String name, String lastName, int idgroup) {
        return service.createTeacher(name, lastName, idgroup);
    }

    public StudentGroup createStudentGroup (Teacher teacher, List <Student> students){
        return service.createStudentGroup(teacher, students);
    }

    public Student getByIdStudent(int id) {

        Student student = null;
        try {
            student = service.getByIdStudent(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public Teacher getByIdTeacher(int id) {

        Teacher teacher = null;
        try {
            teacher = service.getByIdTeacher(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    public List<Teacher> getAllTeachers() {
        return service.getAllTeahers();
    }
}
