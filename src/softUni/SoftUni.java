package softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {

    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.data.size();
    }

    public String insert(Student student) {
        if (data.size() < capacity) {
            this.data.add(student);
        }
        return String.valueOf(this.student);
    }

    public String remove(Student student) {
        for (Student student1 : this.data) {
            if (!student1.getFirstName().equals(student.getFirstName())){
                System.out.printf("Removed student %s %s.",student1.getFirstName(), student1.getLastName());
                this.data.remove(student1);
            } else {
                System.out.println("Student not found.");
            }
        }
        return null;
    }



    public String getStudent(String firstName, String lastName){

        return firstName;
    }

    public String getStatistics() {



        return String.format("Hall size: {addedStudentsCount}");
//        Student: {firstName} {lastName}, Best Course = {bestCourse}
//        Student: {firstName} {lastName}, Best Couse = {bestCourse}
//        (…)"

    }
}
