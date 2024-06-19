package servise;

import java.util.List;

import model.StudentGroup;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupService {

    

    public Student createStudent(String name, String lastName, int idgroup) {
        int id;
        int size = DataBase.studentsDB.size();
        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Student student = new Student(id, name, lastName, idgroup);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Teacher createTeacher(String name, String lastName, int idgroup) {
        int id;
        int size = DataBase.teacherDB.size();
        if (size == 0) {
            id = 1;
        } else {
            id = size + 1;
        }
        Teacher teacher = new Teacher(id, name, lastName, idgroup);
        DataBase.teacherDB.add(teacher);
        return teacher;
    }

    public Student getByIdStudent(int id) throws Exception {
        Student student = DataBase.studentsDB//список студентов
                .stream()//запускаем поток для вычислений
                // пример лямда-выражения (s -> s.getId() == id)
                .filter(s -> s.getId() == id)//вызываем метод filter фильтруя по условию (s = student(переменная))
                .findFirst()//вернуть первого найденого студента
                .orElse(null);// если не нашли вернуть null (orElse закрывет поток stream)
        if (student == null) {
            throw new Exception("Студент не найден");//выбрасываем проверяемое исключение, которое компилятор требует отработать
        }
        return student;
    }

    public Teacher getByIdTeacher(int id) throws Exception {
        Teacher teacher = DataBase.teacherDB
                .stream()                
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        if (teacher == null) {
            throw new Exception("Учитель не найден");
        }
        return teacher;
    }


    public List<Student> getAllStudents(){
        return DataBase.studentsDB;
    }

    public List<Teacher> getAllTeahers(){
        return DataBase.teacherDB;
    }

    public StudentGroup studentGroups(Teacher teacher, List<Student> students) {
        return null;
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return null;
    }

}