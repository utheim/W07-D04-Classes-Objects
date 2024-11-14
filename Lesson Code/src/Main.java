

import omar.school.Teacher;
import omar.school.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        syntax for creating a new object of the instance school.Student
//      Class   objectName new constructor()
        Student student1 = new Student("Mihai","Tataru","Java",new ArrayList<>(Arrays.asList("Romanian", "Russian", "Deutsch", "English"
        )));

        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getCourse());

        Student student2 = new Student("Maryam","Mohammadi","Java",new ArrayList<>(Arrays.asList("Persian", "Turkish", "english", "german")));

        System.out.println(student2.getFirstName());

        System.out.println(student1.getLanguages());
        System.out.println(student2.getLanguages());

//        student1.firstName = "Mihai CHANGED";

        System.out.println(student1.getFirstName());

        System.out.println(student2.getCountry());
        System.out.println(student1.getCountry());

        Student student3 = new Student("John","Smith",new ArrayList<String>(Arrays.asList("English","German")));

        System.out.println(student3.getFirstName());
        System.out.println(student3.getCourse());

        System.out.println(student2.getIsHandRaised());
        student2.changeHandRaise();
        System.out.println(student2.getIsHandRaised());
        student2.changeHandRaise();
        System.out.println(student2.getIsHandRaised());

//        student1.firstName = "";
        student1.setFirstName("");

        System.out.println(student1.getFirstName());



        System.out.println(student3.getCourse());
        student3.setCourse("Architects");
        System.out.println(student3.getCourse());

        Student.addNewCourse("Python");

        student3.setCourse("Python");
        System.out.println(student3.getCourse());


//        System.out.println(Student.possibleCourses);


        String something = new String("Maryam");

        System.out.println(something);

        var myString = "Some value";

        System.out.println(myString.getClass());


        Teacher omar = new Teacher("Omar","Kamal",new ArrayList<String>(Arrays.asList("Java")),new ArrayList<String>(Arrays.asList("English")),"Bahrain",new ArrayList<>(Arrays.asList(student1,student2,student3)));




        ArrayList<Integer> myArrayList = new ArrayList<>();


        Random random = new Random();


        String whatOmarSays = student3.getIsHandRaised() ? "Yes what is your question?" : "Lets continue with the lesson";


        if(student3.getIsHandRaised() ==true){
            whatOmarSays = "Yes what is your question?";
        }
        else{
            whatOmarSays = "Lets continue with the lesson";
        }


//                         Boolean ? is true : is false
        System.out.println(omar.getCountry().equals("Germany") ? "He lives ih the same country as his students." : "He dosn't live in the same country as his sttudents.");


        System.out.println(omar);


    }

//   Method overloading
    public static int addTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static double addTwoNumbers(double num1, double num2){
        return num1 + num2;
    }

}

