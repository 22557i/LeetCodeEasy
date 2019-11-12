package Homework6;



import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/**
 * Created by Hao Wu on 10/14/19.
 */
public class Q8 {
    public File img = new File("/Users/haroldwu/Desktop/Code&Program files/LeetCodeEasy/6205Assignment/src/Homework6/Boston.jpg");
     BufferedImage in;
    {
        try {
            in = ImageIO.read(img);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BufferedImage newImg = new BufferedImage(in.getWidth(),in.getHeight(),BufferedImage.TYPE_INT_ARGB);

    static double[][] convertRGB(BufferedImage img){

        double[][] intensity = new double[img.getWidth()][img.getHeight()];
        System.out.println("Width: "+img.getWidth());
        System.out.println("Height: "+img.getHeight());
        for (int i = 0; i <img.getWidth() ; i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                int rgb = img.getRGB(i,j);
                int r =(rgb>>16)&0xFF;
                int g =(rgb>>8)&0xFF;
                int b = rgb&0xFF;
                double info = 0.2989*r+ 0.5870*g+0.1140*b;
                intensity[i][j] = info;
            }
        }
        return intensity;
    }
    public static void main(String[] args) {
        Q8 q = new Q8();

        double data[][] =convertRGB(q.in);
        double [] list = new double[data.length*data[0].length];
        double [] list1 = new double[data.length*data[0].length];
        double [] list2 = new double[data.length*data[0].length];
        Double [] list3 = new Double[data.length*data[0].length];
        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data[0].length ; j++) {
                list[i*data[0].length+j] = data[i][j];
                list1[i*data[0].length+j] = data[i][j];
                list2[i*data[0].length+j] = data[i][j];
                list3[i*data[0].length+j] = data[i][j];
            }
        }
        TimSort<Double> timsort = new TimSort<Double>(list3, Collections.reverseOrder());

        long startTime =  System.currentTimeMillis();
        InsertSort(list);
        long endTime =  System.currentTimeMillis();
        System.out.println("Insert cost "+(endTime-startTime)+"ms");

        startTime =  System.currentTimeMillis();
        selectSort(list1);
        endTime =  System.currentTimeMillis();
        System.out.println("SelectionSort cost "+(endTime-startTime)+"ms");

        startTime =  System.currentTimeMillis();
        quicksort(list2);
        endTime =  System.currentTimeMillis();
        System.out.println("QuickSort cost "+(endTime-startTime)+"ms");

        startTime =  System.currentTimeMillis();
        timsort.sort(list3,Collections.reverseOrder());
        endTime =  System.currentTimeMillis();
        System.out.println("TimSort cost "+(endTime-startTime)+"ms");
    }

    public static void selectSort(double[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr.length-1;j++){
                if(arr[j]>arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr, i, min);
            }
        }
    }

    public static void swap(double[] arr,int a,int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    public static void InsertSort(double array[]){
        for(int index = 1; index<array.length; index++){
            double temp = array[index];
            int leftindex = index-1;
            while(leftindex>=0 && array[leftindex]<temp){
                array[leftindex+1] = array[leftindex];
                leftindex--;
            }
            array[leftindex+1] = temp;
        }
    }
    public static int division(double[] list, int left, int right) {

        double base = list[left];
        while (left < right) {

            while (left < right && list[right] <= base)
                right--;

            list[left] = list[right];


            while (left < right && list[left] >= base)
                left++;

            list[right] = list[left];
        }


        list[left] = base;
        return left;
    }
    public static void quicksort(double nums[]){
        Sort(nums,0,nums.length-1);
    }

    public static void Sort(double[] list, int left, int right){

        if (left < right) {

            int base = division(list, left, right);

            Sort(list, left, base - 1);


            Sort(list, base + 1, right);
        }
    }
}
