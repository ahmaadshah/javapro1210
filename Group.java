package homeWoork;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private  List<String> studentNames = new ArrayList<>();

    public void addStudent(String name) {
        studentNames.add(name);
    }
    public List<String> findStudentsByInitial(String initial){
        List<String> matchingStudents = new ArrayList<>();
            for ( String name : studentNames) {
                if (name.startsWith(initial)){
                    matchingStudents.add(name);
                }
            }
            return matchingStudents;
    }

    public static void main(String[] args) {
        Group group  = new Group();
        group.addStudent("Ahmad Hosseini");
        group.addStudent("Daria Kutlueva");
        group.addStudent("Svetlana Franchyk ");
        group.addStudent("Maria Kioseva");

        String initial = "A";
        List<String> matchingStudents = group.findStudentsByInitial(initial);
        System.out.println(" " + initial + "':" + matchingStudents);
    }
}
