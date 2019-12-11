package RandomQuestionNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Hao Wu on 12/4/19.
 */
public class RandomNo {
    static void findQuestions(int n){
        Random r = new Random();
        int total = n;
        Set<Integer> set = new HashSet<>();
        int i =0;
        while (i<5){
            int temp = r.nextInt(total)+1;
            if(!set.contains(temp)){
                set.add(temp);
                i++;
            }
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        findQuestions(40);
        char[]set = {'a','b','c'};

    }

}
