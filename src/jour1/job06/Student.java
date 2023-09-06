package jour1.job06;

public class Student {
    private String studentName;
    private int[] studentGrades;

    public Student(String studentName, int[] studentGrades) {
        this.studentName = studentName;
        this.studentGrades = studentGrades;
    }

    public int highestGrade() {
        int newHighestGrade = this.studentGrades[0];
        for (int grade : this.studentGrades) {
            if (newHighestGrade < grade) {
                newHighestGrade = grade;
            }
        }
        return newHighestGrade;
    }

    public int lowestGrade() {
        int newLowestGrade = this.studentGrades[0];
        for (int grade : this.studentGrades) {
            if (newLowestGrade > grade) {
                newLowestGrade = grade;
            }
        }
        return newLowestGrade;
    }

    public float average() {
        float gradeSum = 0;
        for (int grade : this.studentGrades) {
            gradeSum += grade;
        }
        return gradeSum / this.studentGrades.length;
    }

    public void showInfo() {
        System.out.println("Student name: " + this.studentName);
        System.out.println("Highest grade: " + highestGrade());
        System.out.println("Lowest grade: " + lowestGrade());
        System.out.println("Average: " + average());
    }
}
