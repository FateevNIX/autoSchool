package welcome.com;

public class ReferenceTypes {


    public void firstMiddleAndLastSymbols(String str) {
        int first = 0;
        int middle = str.length();
        int last = str.length() - 1;
        if (middle % 2 == 0) { //проверка на наличие среднего символа. Если число четное, то его нет
            System.out.println("First char is: " + str.charAt(first) + ". There are no middle char, because number of symbols are even. "
                    + "Last char is: " + str.charAt(last));
        } else {
            middle = (middle / 2);
            System.out.println("First char is: " + str.charAt(first) + ". Middle char is: " + str.charAt(middle)
                    + ". Last char is: " + str.charAt(last));
        }
    }
    public void sentenceBeforeDotAndNumberOfSpaces(String str) {
        int indexOfFirstDot = str.indexOf(".") + 1;
        String[] numberOfWords = str.split(" ");
        int numberOfSpaces = numberOfWords.length - 1;
        System.out.println("Your first sentence is: " + str.substring(0, indexOfFirstDot));
        System.out.println("Number of spaces in whole string are: " + numberOfSpaces);
    }
    public void replaceSubstringInString(String fullString, String substringToBeReplaced, String newSubstring) {

        boolean isContain = fullString.contains(substringToBeReplaced);
        if (isContain) {
            fullString = fullString.replace(substringToBeReplaced, newSubstring);
            System.out.println(fullString);
        } else {
            System.out.println("There are no such substring as: " + substringToBeReplaced);
        }
    }
    public void findLongestWordInSentence(String str){
        String[] arrayOfWords = str.split(" ");
        int i;
        int counterOfLongestWords = 0;
        String longestWord = "";
        for(i = 0; i < arrayOfWords.length; i++){
            if(arrayOfWords[i].length() > longestWord.length()){
                longestWord = arrayOfWords[i];
                counterOfLongestWords = 0;
            }
            else if(arrayOfWords[i].length() == longestWord.length()){
                counterOfLongestWords++;
            }
        }
        if(counterOfLongestWords > 0) {
            System.out.println("There are several longest words");
        }
        else{
                System.out.println("The longest word is: " + longestWord);
            }


    }


    }

