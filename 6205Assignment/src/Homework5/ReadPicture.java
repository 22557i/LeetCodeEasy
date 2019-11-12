package Homework5;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Hao Wu on 10/9/19.
 */
public class ReadPicture {
    public File img = new File("/Users/haroldwu/Desktop/Code&Program files/LeetCodeEasy/6205Assignment/src/Homework5/Boston.jpg");
    BufferedImage in;
    {
        try {
            in = ImageIO.read(img);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BufferedImage newImg = new BufferedImage(in.getWidth(),in.getHeight(),BufferedImage.TYPE_INT_ARGB);

    double[][] convertRGB(BufferedImage img){
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
        ReadPicture r = new ReadPicture();
        double data[][] =r.convertRGB(r.in);
        double [] list = new double[data.length*data[0].length];
        double [] list1 = new double[data.length*data[0].length];
        double [] list2 = new double[data.length*data[0].length];
        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j <data[0].length ; j++) {
                list[i*data[0].length+j] = data[i][j];
                list1[i*data[0].length+j] = data[i][j];
                list2[i*data[0].length+j] = data[i][j];
            }
        }


        long startTime =  System.currentTimeMillis();
        Mergesort.mergeSort(list);
        long endTime =  System.currentTimeMillis();
        System.out.println("MergeSort cost "+(endTime-startTime)+"ms");

        startTime =  System.currentTimeMillis();
        HeapSort.heap_sort(list1,list1.length);
         endTime =  System.currentTimeMillis();
        System.out.println("HeapSort cost "+(endTime-startTime)+"ms");

         startTime =  System.currentTimeMillis();
        QuickSort.quicksort(list2);
         endTime =  System.currentTimeMillis();
        System.out.println("QuickSort cost "+(endTime-startTime)+"ms");
    }
}
