package Main;

import School.School;
import School.Sinif;
import School.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = createStudent(10);
        addToStudentsToClasses(students);
        allOfStudents(students);
        Sinif[] siniflar = addToStudentsToClasses(students);
        School school = new School();
        school.setClasses(siniflar);

        for (Sinif sinif:school.getClasses()) {
            System.out.println(sinif.getGradeOfClass() + " sinifimizin ögrencileri");
            System.out.println(Arrays.toString(sinif.getStudents()));
        }
    }

    private static Student[] createStudent(int n){
        Student[] students = new Student[n];

        for (int i = 0 ; i < n ; i++){
            Student student = new Student();
            createName(student, i);
            createAge(student, i);
            student.setStudentNumber(createStudentNumber(student));

            students[i] = student;
        }
        return students;
    }

    private static String createStudentNumber(Student pStudent){
        String studentNumber;
        String twoLettersOfFirstName;
        int age = pStudent.getAge();
        String lastThreeLetterOfLastName;

        if (pStudent.getLastName().length() >= 3){
            twoLettersOfFirstName = pStudent.getFirstName().substring(0, 2).toUpperCase();
            lastThreeLetterOfLastName = pStudent.getLastName().substring(pStudent.getLastName().length() - 3).toUpperCase();
        }else{
            twoLettersOfFirstName = pStudent.getFirstName().substring(0, 2);
            lastThreeLetterOfLastName = pStudent.getLastName();
        }

        studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
        return studentNumber;
    }

    private static void allOfStudents(Student[] pStudent){
        for(Student student:pStudent){
            char charFirstLetter = student.getFirstName().charAt(0);
            String firstLetter = Character.toString(charFirstLetter).toUpperCase();
            String viewOfRegistration = student.getStudentNumber() + ", " + firstLetter + student.getFirstName().substring(1) + " " + student.getLastName().toUpperCase();
            System.out.println(viewOfRegistration);
        }
    }

    private static void createName(Student pStudent, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". student firstname: ");
        String firstName = scanner.nextLine();

        while (firstName.length() <= 0){
            System.out.println(" Please enter valid firstname!!!");
            firstName = scanner.nextLine();
        }
        pStudent.setFirstName(firstName);

        System.out.println("Enter " + (pI+1) + ". student lastname: ");
        String lastName = scanner.nextLine();
        while (lastName.length() <= 0){
            System.out.println(" Please enter valid lastname!!!");
            lastName = scanner.nextLine();
        }
        pStudent.setLastName(lastName);
    }

    private static void createAge(Student pStudent, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". student age: ");
        int studentAge = scanner.nextInt();
        pStudent.setAge(studentAge);

        if(6 > pStudent.getAge() || pStudent.getAge() > 10){
            System.out.println("Please enter a value between 6 and 10.  " + (pI+1) + ". student age: ");
            studentAge = scanner.nextInt();
            pStudent.setAge(studentAge);
        }
    }

    private static Sinif[] addToStudentsToClasses(Student[] pStudent){
        Sinif sinif1 = new Sinif();
        sinif1.setGradeOfClass("1. Grade");
        Sinif sinif2 = new Sinif();
        sinif2.setGradeOfClass("2. Grade");
        Sinif sinif3 = new Sinif();
        sinif3.setGradeOfClass("3. Grade");
        Sinif sinif4 = new Sinif();
        sinif4.setGradeOfClass("4. Grade");
        Sinif sinif5 = new Sinif();
        sinif5.setGradeOfClass("5. Grade");

        for (Student student: pStudent){
            switch (student.getAge()){
                case 6:
                    sinif1.addStudents(student);
                    break;
                case 7:
                    sinif2.addStudents(student);
                    break;
                case 8:
                    sinif3.addStudents(student);
                    break;
                case 9:
                    sinif4.addStudents(student);
                    break;
                case 10:
                    sinif5.addStudents(student);
                    break;
            }
        }

        Sinif[] siniflar = new Sinif[5];
        siniflar[0]=sinif1;
        siniflar[1]=sinif2;
        siniflar[2]=sinif3;
        siniflar[3]=sinif4;
        siniflar[4]=sinif5;
        return siniflar;
    }

}
