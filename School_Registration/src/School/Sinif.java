package School;

public class Sinif {
    private String gradeOfClass;
    private Student[] students = new Student[2];

    public void addStudents(Student pStudent){
        if (students[0] == null){
            this.students[0]=pStudent;
        }else if(students[1] == null){
            this.students[1] = pStudent;
        }else{
            System.out.println("Sinifin kontenjani dolmustur.");
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public String getGradeOfClass() {
        return gradeOfClass;
    }

    public void setGradeOfClass(String gradeOfClass) {
        this.gradeOfClass = gradeOfClass;
    }
}
