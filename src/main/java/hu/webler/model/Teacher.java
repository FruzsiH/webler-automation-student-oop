package hu.webler.model;

import hu.webler.value.School;

public class Teacher extends Person {

    private boolean isMale;
    private final School school;
    private String course;

    public Teacher() {
        this("");
    }

    public Teacher(String firstname) {
        this(firstname, true, "Java");
    }

    public Teacher(String firstname, boolean isMale, String course) {
        super(firstname);
        this.isMale = isMale;
        //this.school = "Webler"; amíg string volt, de érdemes ENUM-ot használni
        this.school = School.WEBLER;
        this.course = course;
    }

    public String getGender(boolean isMale) {
        return isMale ? "male" : "female";
    }

    public boolean isMale() {
        return isMale;
    }

    public String getCourse() {
        return course;
    }

    public School getSchool() {
        return school;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void setCourse(String course) {
        this.course = course;
    }



    @Override
    public String toString() {
        return "Teacher name: " + super.getFirstName() + " school: " + school +
                " course: " + course + " gender: " + getGender(isMale);
    }
}
