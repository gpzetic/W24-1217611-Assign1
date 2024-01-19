import java.util.List;

public class Student {
    private String firstName, lastName;
    private int studentNum;
    private List<String> activities;
    public Student(String firstName, String lastName, int studentNum, List<String> activities) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
        setActivities(activities);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }
    public int getStudentNum() {
        return studentNum;
    }
    public void setStudentNum(int studentNum) {
        if (studentNum < 0) {
            throw new IllegalArgumentException("Student number is negative or too high");
        }
        this.studentNum = studentNum;
    }
    public List<String> getActivities() {
        return activities;
    }
    public void setActivities(List<String> activities) {
        if (!activities.isEmpty() && activities != null) {
            this.activities = activities;
        }
        else throw new IllegalArgumentException("Activities cannot be empty");
    }
}
