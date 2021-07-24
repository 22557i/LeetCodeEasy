package PonyAI;

    /*
     * Click `Run` to execute the snippet below!
     */

import java.io.*;
import java.util.*;


/*
Given an array of non-negative integers, is there an expression, which uses each integer exactly once, that evaluates to target integer value?

Rule: There would be at most 7 numbers, all integers < 100.
Integer can swap order from original array.
Allow using operator + - * / and ()
Division happens on rational number field Q.

Some sample expressions:
(1 + 2) * (3 + 4) = 21
8 / (3 - 8 / 3) = 24

Bonus: output the expression itself in a human readable form.
*/

    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

class Solution {
        public boolean solution(int[] arr, int target) {
            List<Double> list = new ArrayList<>();
            for(int n:arr){
                list.add((double)n);
            }
            return dfs(list,target);
        }

        public boolean dfs(List<Double> list, double target){
            if(list.size() == 1){
                if(Math.abs(list.get(0)-target) <0.00001)return true;
                return false;
            }
            for(int i =0;i<list.size();i++){
                for(int j = i+1;j<list.size();j++){
                    List<Double> tempList = this.helper(list.get(i), list.get(j));

                    for(int idx =0;idx<tempList.size();idx++){

                        List<Double> nextLayer = new ArrayList<>();
                        nextLayer.add(tempList.get(idx));

                        for(int k =0;k<list.size();k++)
                        {
                            if(k==i||k==j)continue;
                            else nextLayer.add(list.get(k));
                        }
                        if(dfs(nextLayer, target))return true;
                    }
                }
            }
            return false;
        }

        private List<Double> helper(double n1, double n2) {
            List<Double> list = new ArrayList<>();

            list.add(n1+n2);
            list.add(n1-n2);
            list.add(n2-n1);
            list.add(n1*n2);
            list.add(n1/n2);
            list.add(n2/n1);
            return list;
        }

        public static void main(String[] args){
            int arr[] = {8,3,8,3};
            Solution s = new Solution();
            System.out.println(s.solution(arr,24));
        }
    }


/*
Your previous Plain Text content is preserved below:

#include <iostream>
using namespace std;

// Have you joined the google meeting?

// To execute C++, please define "int main()"
int main() {
  auto words = { "Hello, ", "World!", "\n" };
  for (const string& word : words) {
    cout << word;
  }
  return 0;
}

 */

