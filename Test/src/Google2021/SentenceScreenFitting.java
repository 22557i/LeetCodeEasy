package Google2021;

public class SentenceScreenFitting {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int sentenceCount = 0;
        int rowCount = 1;
        int currRowWidth = 0;
        boolean isRoom = true;
        while (rowCount <= rows) {
            for (String word : sentence) {
                if (word.length() > cols) {
                    return 0;
                }
                currRowWidth += word.length() + 1;
                if (currRowWidth == cols + 1) {
                    currRowWidth--;
                }
                if (currRowWidth > cols) {
                    rowCount++;
                    if (rowCount > rows) {
                        isRoom = false;
                        break;
                    }
                    currRowWidth = word.length() + 1;
                }
            }
            if (isRoom) sentenceCount++;
        }
        return sentenceCount;
    }
}
