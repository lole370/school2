package asp1;

import java.util.List;

public class Letter {
    private List<Character> letters;


    public Letter(List<Character> letters) {
        this.letters = letters;
    }

    public List<Character> getLetters() {
        return letters;
    }

    public void addLetter(char letter) {
        this.letters.add(letter);
    }

    public boolean containsLetter(char letter) {
        return this.letters.contains(letter);
    }
}
