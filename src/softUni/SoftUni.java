package softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {

    public int capacity;
    public List<Student> data;


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
            if (!getStudent(student.firstName, student.lastName).equals(student)) {
                data.add(student);
                return String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
            } else {
                return String.format("Student is already in the hall.");
            }
        }
        return String.format("The hall is full.");
    }

    public String remove(Student student) {
        for (int i = 0; i < data.size(); i++) {
            if (!this.data.get(i).equals(student)) {
                data.remove(student);
                return String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());

            } else {
                return String.format("Student not found.");
            }
        }
        return null;
    }

    public String getStudent(String firstName, String lastName) {

        return firstName;
    }

    public String getStatistics() {

        return String.format("Hall size: %d%n",data.size());
//        Student: {firstName} {lastName}, Best Course = {bestCourse}
//        Student: {firstName} {lastName}, Best Couse = {bestCourse}
//        (…)"

    }
}
