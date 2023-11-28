import java.util.ArrayList;

public class Student {
    private String name;
    private String groupNum;
    private int year;
    private int mathRate;
    private int peRate;
    private int informaticRate;
    private double averageRate;
    private double minAverageRate = 3;

    public Student(String name, String groupNum, int year, int mathRate, int peRate, int informaticRate) {
        this.name = name;
        this.groupNum = groupNum;
        this.year = year;
        this.mathRate = mathRate;
        this.peRate = peRate;
        this.informaticRate = informaticRate;
        this.averageRate = (mathRate + informaticRate + peRate)/3;
    }

    public String exam (ArrayList<Student> studentList){
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getAverageRate() < minAverageRate) {
                studentList.remove(i);
            } else {
                studentList.get(i).setYear(getYear() + 1);
            }
        }
        return studentList.toString();
    }

    public StringBuilder printStudents (ArrayList<Student> studentList, int year){
        StringBuilder studentsNames = new StringBuilder();
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getYear() == year) {
                studentsNames.append(studentList.get(i).getName() + ", ");
            }
        }
        return studentsNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMathRate() {
        return mathRate;
    }

    public void setMathRate(int mathRate) {
        this.mathRate = mathRate;
    }

    public int getPeRate() {
        return peRate;
    }

    public void setPeRate(int peRate) {
        this.peRate = peRate;
    }

    public int getInformaticRate() {
        return informaticRate;
    }

    public void setInformaticRate(int informaticRate) {
        this.informaticRate = informaticRate;
    }

    public double getAverageRate() {
        return averageRate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNum='" + groupNum + '\'' +
                ", year=" + year +
                ", mathRate=" + mathRate +
                ", peRate=" + peRate +
                ", informaticRate=" + informaticRate +
                '}';
    }
}
