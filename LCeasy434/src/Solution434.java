import java.util.ArrayList;

public class Solution434 {

        public int countSegments(String s) {
            int segmentCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                    segmentCount++;
                }
            }

            return segmentCount;
        }
}

