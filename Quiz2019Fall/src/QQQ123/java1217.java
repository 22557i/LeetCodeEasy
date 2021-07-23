package QQQ123;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java1217 {
    public static void main(String[] args) throws IOException {
        String []arr={"peters"};
        double []trips={0.1};
        File file = new File("input.text");
        method1(file,arr,trips);
    }
    static class Person{
        private String name;
        private List<Double> trips = new ArrayList();
        private double avaTrip;
        Person(String n){
            this.name = n;
        }
        public Person add(double t){
            this.trips.add(t);
            this.setAvaTrip();
            return this;
        }

        public String getName() {
            return name;
        }
        public List<Double> getTrips(){
            return this.trips;
        }
        public double getAva(){
           double sum =0;
           for(double d :this.trips)
               sum+=d;
            return sum/trips.size();
        }
        public void setAvaTrip(double d){
            this.avaTrip =d;
        }
        public void setAvaTrip(){
            this.avaTrip =getAva();
        }
        public double getAvaTrip(){
            return this.avaTrip;
        }
        @Override
        public String toString(){
            return this.name+" "+ this.getAvaTrip()+" ";
        }

    }
    public static int method1(File file,String arr[],double[] averageLength) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        File fileIn = new File ("input.txt");
        Scanner input = new Scanner(fileIn);

        String targetName = "";
        double v = -1;
        int count =0;
        while (input.hasNext()){
            count++;
            String s[] = input.next().split(" ");
            if((Double.valueOf(s[1])+Double.valueOf(s[2]))/2>v){
                v = (Double.valueOf(s[1])+Double.valueOf(s[2]))/2;
                targetName = s[0];
            };
        }
        for(int i =0;i< arr.length;i++){
           if(averageLength[i]>v){
               v = averageLength[i];
               targetName = arr[i];
           }
        }

        fileOutputStream.write((targetName+" "+v).getBytes());

        return count=arr.length;
    }
    public static void method2(File file,double[]arr,int n) throws IOException {
        double ava = Arrays.stream(arr).sum()/arr.length;
        System.out.println(ava);
        int l=0, m=0,h=0;
        for(double d:arr){
            if(d<ava)l++;
            else if (d==ava)m++;
            else h++;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(("below:"+l+", equal: "+m+", above: "+h+"").getBytes());
    }
    public void method3(String arr[],double[] avaTrips, int n){


        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j].compareTo(arr[j+1])<0){
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    double d = avaTrips[j];
                    avaTrips[j] = avaTrips[j+1];
                    avaTrips[j+1] = d;
                }
            }
        }
    }

}
