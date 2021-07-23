package tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class devert {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        try{

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./Test/src/tools/amend.csv"), "utf-8"));

           reader.readLine();
//            reader.readLine();
            String line = null;
            while((line = reader.readLine())!=null){
                String temp[] = line.split(",");
                Student s = new Student(temp[1], temp[1]);
                s.assignments = 0.25* (Double.valueOf(temp[4])+Double.valueOf(temp[5])+Double.valueOf(temp[6])+Double.valueOf(temp[7]));
                for (int i = 9; i < 18; i++) s.quizzes.add(Double.valueOf(temp[i]));
                s.quizzes.sort((a,b)->Double.compare(b,a));
                s.finalGrade = Double.valueOf(temp[8]);
                students.add(s);
            }
            //students.sort((a,b)->(a.NUID.compareTo(b.NUID)));
            System.out.println(" ");

    }catch (Exception e){
            e.printStackTrace();
        }
        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    private static class Student{
        private String lastName;
        private String NUID;
        public double assignments;
        public ArrayList<Double>quizzes = new ArrayList<>();
        public double finalGrade;

        public Student(String lastName, String NUID) {
            this.lastName = lastName;
            this.NUID = NUID;
        }

        public ArrayList<Double> getQuizzes() {
            return quizzes;
        }

        private double quizGrade(int waives){
            double sum = 0;
            for (int i = 0; i <9-waives ; i++) {
                sum+=this.quizzes.get(i);
            }
            return sum/(9-waives);
        }
        private double calFinal(int waives) {
            return this.finalGrade * 0.5 +
                    this.assignments*0.25 +
                    this.quizGrade(waives) * 0.25;
        }
        @Override
        public String toString() {
           return this.NUID+","
                   +this.assignments+","
                   +this.quizGrade(0)+","
                   +this.finalGrade+","
                   +this.quizGrade(1)+","
                   +this.calFinal(1)+","
                   +calGpa(this.calFinal(1))+","
                   +this.quizGrade(2)+","
                   +this.calFinal(2)+","
                   +calGpa(this.calFinal(2))+","
                   +this.quizGrade(3)+","
                   +this.calFinal(3)+","
                   +calGpa(this.calFinal(3))+",";
        }
    }
    private static String calGpa(double point){
        if (point>=93)return "A";
        if (point>=90)return "A-";
        if (point>=85)return "B+";
        if (point>=82)return "B";
        if (point>=79)return "B-";
        if (point>=75)return "C+";
        if (point>=70)return "C";
        if (point>=65)return "C-";
        return "F";

    }
}

