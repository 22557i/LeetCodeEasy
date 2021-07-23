package QQQ123;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class gradesManager {
    public static void main(String[] args) throws IOException {
        File csv = new File("./Quiz2019Fall/src/QQQ123/grades.csv");
        BufferedReader br = new BufferedReader(new FileReader(csv));
        String line = br.readLine();
        ArrayList<Student> students = new ArrayList<>();

        while ((line =br.readLine())!=null){
            String records[] = line.split(",");
            int id = Integer.valueOf(records[1]);
            Student s= findStudent(students,id);
            if(s==null){
                s = new Student(records[0],id);
                students.add(s);
            }
            s.getFinalGrades().add(Double.valueOf(records[20]));


        }

        for(Student s:students){
            System.out.println("Name: "+s.name+" Id: " +s.id+" Grade: "+s.getfinal());

        }
        System.out.println("---------------------------------------------------");
        File csv1 = new File("./Quiz2019Fall/src/QQQ123/2020Fall.csv");
        BufferedReader br1 = new BufferedReader(new FileReader(csv1));
        line = br1.readLine();
        line = br1.readLine();

        while ((line =br1.readLine())!=null){
            String records[] = line.split(",");
            int id = Integer.valueOf(records[3]);
            Student s= findStudent(students,id);
            if(s==null){
                s = new Student(records[0]+" "+records[1],id);
                students.add(s);
            }
            for(int i =16;i<=20;i++){
                s.getAssignments().add(Double.valueOf(records[i]));
            }

            for(int i =21;i<=29;i++){
                s.getQuizzes().add(Double.valueOf(records[i]));
            }
            s.getQuizzes().sort(Comparator.reverseOrder());
            s.setMidterm(Integer.valueOf(records[30]));
        }
        for(Student s:students)
            System.out.println(s);
        System.out.println(students.size());

    }
    public static Student findStudent(ArrayList<Student> list, int id){
        for(Student student:list) {
            if (student.id==id) return student;
        }
        return null;
    }
}
class Student{
    public String name;
    public int id;
    public ArrayList<Double> finalGrades = new ArrayList<>();
    public ArrayList<Double> quizzes =new ArrayList<>();
    public int Midterm;
    public ArrayList<Double> assignments = new ArrayList<>();
    public double grades;
    public String gpa;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Double> getFinalGrades() {
        return finalGrades;
    }

    public void setFinalGrades(ArrayList<Double> finalGrades) {
        this.finalGrades = finalGrades;
    }

    public ArrayList<Double> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(ArrayList<Double> quizzes) {
        this.quizzes = quizzes;
    }

    public int getMidterm() {
        return Midterm;
    }

    public void setMidterm(int midterm) {
        Midterm = midterm;
    }

    public ArrayList<Double> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Double> assignments) {
        this.assignments = assignments;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public double getfinal(){
        double sum=0;
        for(double d:finalGrades)
            sum+=d;

        return sum/finalGrades.size();
    }
    public String getNquizzes(int n){
        String res = "";
        for (int i = 0; i < n; i++) {
            res+=quizzes.get(i);
            if(i<n-1){
               res+=",";
            }
        }
        return res;
    }

    public double calcu(ArrayList<Double> l, int n){
        double res = 0;
        for(int i=0;i<n;i++){
            res+=l.get(i);
        }
        return res/(n+1);
    }
    public double calculateFinalGrades(int n){
        double sum=0;
        sum+= 0.5*getfinal();
        sum+=0.25*(calcu(getQuizzes(),n)*(n+1)+this.getMidterm()*3)/(n+4);
        double ass =0;
        for(double d:getAssignments()){
            ass+=d;
        }
        sum+=0.05*ass;
        return sum;
    }
    public String getClassess(double grades){
        if(grades>=93)return "A";
        if(grades>=89)return "A-";
        if(grades>=85)return "B+";
        if(grades>=80)return "B";
        if(grades>=77)return "B-";
        if(grades>=74)return "C+";
        else return "C";
    }
    @Override
    public String toString(){
        return this.name+","
                +this.id+","
                +"\""+getNquizzes(9)+"\""+","
                +"\""+getNquizzes(8)+"\""+","
                +"\""+getNquizzes(7)+"\""+","
                +"\""+getNquizzes(6)+"\""+","
                +calcu(getQuizzes(),9)+","
                +calcu(getQuizzes(),8)+","
                +calcu(getQuizzes(),7)+","
                +calcu(getQuizzes(),6)+","
                +calcu(getAssignments(),5)*6/5+","
                +Midterm+","
                +calculateFinalGrades(9)+","
                +getClassess(calculateFinalGrades(9))+","
                +calculateFinalGrades(8)+","
                +getClassess(calculateFinalGrades(8))+","
                +calculateFinalGrades(7)+","
                +getClassess(calculateFinalGrades(7))+","
                +calculateFinalGrades(6)+","
                +getClassess(calculateFinalGrades(6))+",";

    }
}