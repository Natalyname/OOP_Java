package src.main.java.homework4;

import src.main.java.homework4.controller.StudentController;
import src.main.java.homework4.controller.TeacherController;
import src.main.java.homework4.repository.StudentRepository;
import src.main.java.homework4.repository.TeacherRepository;
import src.main.java.homework4.service.StudentService;
import src.main.java.homework4.service.TeacherService;
import src.main.java.homework4.view.SortType;
import src.main.java.homework4.view.StudentView;
import src.main.java.homework4.view.TeacherView;


public class Main {
    public static void main(String[] args) {
        StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();


        studentView.create("Иван Федоров", 19, "343-4343");
        studentView.create("Полина Иванова", 18, "576-7676");
        studentView.create("Полина Иванова", 18, "576-7676");
        studentView.create("Феофан Сидоров", 20, "456-4554");

        studentView.create("Терентий Попов", 17, "789-9878");
        studentView.create("Евлампия Субботина", 18, "908-0880");

        studentView.sendOnConsole(SortType.AGE);

        teacherView.create("Ираида Полонская", 32, "212-1221");
        teacherView.create("Ираида Полонская", 32, "212-1221");
        teacherView.create("Бенедикт Прилучин", 29, "345-4565");
        teacherView.create("Стожар Сбруев", 37, "765-5656");
        teacherView.create("Милолика Пожарская", 40, "978-7878");
        teacherView.create("Софокл Волжский", 33, "901-2353");
        teacherView.sendOnConsole(SortType.ID);

        teacherView.edit("Стожар Сбруев", 37, "765-7575");
        teacherView.sendOnConsole(SortType.ID);

        studentView.edit("Полина Ивановна", 18, "576-7676");
        studentView.edit("Полина Иванова", 18, "776-7676");
        studentView.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
