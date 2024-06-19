package view;

import java.util.List;
import java.util.Scanner;

import controller.StudentGroupController;
import model.StudentGroup;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupView {
    private StudentGroupController controller = new StudentGroupController();

    public void start(){
        DataBase.fillDB();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - создать студента");
                System.out.println("2 - найти студжента по id");
                System.out.println("3 - распечатать информацию о всех студентах");
                System.out.println("4 - распечатать информацию об учебной группе");
                System.out.println("5 - создать учителя");
                System.out.println("6 - найти учителя по id");
                System.out.println("7 - распечатать информацию о всех учителях");         
                System.out.println("8 - выход");
                
                switch (scanner.nextInt()) {
                    case 1 -> createStudent();
                    case 2 -> getByIdStudent();
                    case 3 -> getAllStudents();
                    case 4 -> createStudentGroup();
                    case 5 -> createTeacher();
                    case 6 -> getByIdTeacher();
                    case 7 -> getAllTeachers();       
                    case 8 -> System.exit(0);                
                
                    default -> System.out.println("Операция не поддерживается");
                }
            }
        }

    }

    private Student createStudent(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите имя студента:");
            String name = scanner.nextLine();
            System.out.println("Введите фамилию:");
            String lastName = scanner.nextLine();
            System.out.println("Введите номер группы:");
            int groupId = scanner.nextInt();
            Student student = controller.createStudent(name, lastName, groupId);
            System.out.println(student);
            return student;
        }
        
    }
    private Student getByIdStudent(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите id студента: ");
            int id = scanner.nextInt();
            Student student = controller.getByIdStudent(id);
            System.out.println(student);
            return student;
        }
    }
    
    private List<Student> getAllStudents(){
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }

    public StudentGroup createStudentGroup (){
        StudentGroup studentGroup = controller.createStudentGroup(getByIdTeacher(), getAllStudents());
        return studentGroup;
    }

    private Teacher createTeacher(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите имя учителя:");
            String name = scanner.nextLine();
            System.out.println("Введите фамилию:");
            String lastName = scanner.nextLine();
            System.out.println("Введите номер группы:");
            int groupId = scanner.nextInt();
            Teacher teacher = controller.createTeacher(name, lastName, groupId);
            System.out.println(teacher);
            return teacher;
        }
        
    }
    private Teacher getByIdTeacher(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите id учителя: ");
            int id = scanner.nextInt();
            Teacher teacher = controller.getByIdTeacher(id);
            System.out.println(teacher);
            return teacher;
        }
    }
    
    private List<Teacher> getAllTeachers(){
        List<Teacher> teachers = controller.getAllTeachers();
        System.out.println(teachers);
        return teachers;
    }

}


