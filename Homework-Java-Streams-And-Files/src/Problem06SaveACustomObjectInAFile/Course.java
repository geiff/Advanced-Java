package Problem06SaveACustomObjectInAFile;

import java.io.Serializable;

public class Course implements Serializable{
    private String name;
    private int numberOfStudents;

    public Course (String name, int numberOfStudents){
        this.setName(name);
        this.setNumberOfStudents(numberOfStudents);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course " +
                "name = " + name +
                ", numberOfStudents = " + numberOfStudents;
    }
}
