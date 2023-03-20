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
            if (data.size() == 0) {
                data.add(student);
                return String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
            } else {
                for (int i = 0; i < data.size(); i++) {
                    if (!this.data.get(i).equals(student)) {
                        data.add(student);
                        return String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
                    } else {
                        return String.format("Student is already in the hall.");
                    }
                }
            }
        }
        return String.format("The hall is full.");
    }

    public String remove(Student student) {
        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).equals(student)) {
                data.remove(student);
                return String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());
            }
        }
        return String.format("Student not found.");
    }

    public String getStudent(String firstName, String lastName) {
        for (int i = 0; i < data.size(); i++) {
            if (this.data.get(i).firstName.equals(firstName)){
                return String.format(String.valueOf(this.data.get(i)));
            }
        }
        return firstName;
    }

    public String getStatistics() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Hall size: %d", this.data.size())).append(System.lineSeparator());
        for (Student student:this.data){
            sb.append(String.format("Student: %s %s, Best Course = %s ",student.getFirstName(), student.getLastName(), student.getBestCourse())).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
