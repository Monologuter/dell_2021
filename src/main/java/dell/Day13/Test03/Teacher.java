package dell.Day13.Test03;

import java.util.Objects;

public class Teacher {
    private  int number ;
    private double area;
    private  String teacher;

    public Teacher() {
    }

    public Teacher(int number, double area, String teacher) {
        this.number = number;
        this.area = area;
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher1 = (Teacher) o;
        return getNumber() == teacher1.getNumber() &&
                Double.compare(teacher1.getArea(), getArea()) == 0 &&
                Objects.equals(getTeacher(), teacher1.getTeacher());
    }
}
