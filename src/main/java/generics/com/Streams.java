package generics.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Streams {
    public void generateRandomWords() {
        int numberOfWords = 50;
        List<String> randomStrings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings.add(new String(word));
        }
        randomStrings.set(15,"");
        randomStrings.set(30,"");
        Stream stream = randomStrings.stream();
        stream.forEach(x->System.out.println(x.toString().length()));
        stream.filter(x-> !equals("")).anyMatch(("d"::equals));
    }


}