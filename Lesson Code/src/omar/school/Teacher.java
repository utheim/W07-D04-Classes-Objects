package omar.school;

import java.util.ArrayList;

public class Teacher {



    private String firstName;
    private String lastName;
    private ArrayList<String> courses;
    private ArrayList<String> languages;
    private String country;
    private ArrayList<Student> students;


    public Teacher(String firstName,String lastName, ArrayList<String> courses, ArrayList<String> languages, String country, ArrayList<Student> students){
        System.out.println(Student.possibleCourses);
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
        this. languages = languages;
        this.country = country;
        this.students = students;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCountry(){
        return country;
    }

    public ArrayList<String> getLanguages(){
        return languages;
    }
    public ArrayList<String> getCourses(){
        return courses;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public String toString(){


        return "school.Teacher{firstName= " + firstName + ", lastName= " + lastName +
                ", country= " + country + ", languages= " + languages + ", \nstudents= " + students + ", courses= "
                + courses + "}" + " and the hex representation is" + super.toString();
    }

}
