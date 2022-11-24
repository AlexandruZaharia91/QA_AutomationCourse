public class PigLatin {
    final char[] vowel = {'a', 'e', 'i', 'o', 'u', 'ă', 'î'};
    boolean checkWord = false;


    public static void main(String[] args) {
        PigLatin start = new PigLatin();
        System.out.println("new word is: " + start.checkWord("chair"));

    }

    public String checkWord(String word) {
        String newWord = null;
        if (vowel(word)) {
            newWord = word + "ay";
        } else if ((consonant(word).length() > 0)) {
            newWord = consonant(word);
        }

        return newWord;
    }


    public boolean vowel(String word) {
        for (char elem : vowel) {
            if (word.charAt(0) == elem) {
                checkWord = true;
                break;
            }
        }
        if ((word.charAt(0) == 'x' && word.charAt(1) == 'r') || (word.charAt(0) == 'y' && word.charAt(1) == 't')) {
            checkWord = true;
        }
        return checkWord;
    }


    public String consonant(String word) {
        String vowelToString = new String(vowel);

        char[] newValue = new char[0];
        if (!(vowelToString.contains("" + word.charAt(0) + "")) && vowelToString.contains("" + word.charAt(1) + "")) {
            newValue = word.toCharArray();
            newValue[0] = ' ';
            newValue[1] = ' ';
        } else if (!(vowelToString.contains("" + word.charAt(0) + "") && vowelToString.contains("" + word.charAt(1) + ""))) {
            newValue = word.toCharArray();
            newValue[0] = ' ';
            newValue[1] = ' ';
        }
        return new String(newValue) + "" + word.charAt(0) + "" + "" + word.charAt(1) + "" + "ay";
    }

    public boolean consonantAndQu(String word) {
        String vowelToString = new String(vowel);
        if (!(vowelToString.contains("" + word.charAt(0) + "") && vowelToString.contains("" + word.charAt(1) + "")) && vowelToString.contains("" + word.charAt(2) + "")) {
            checkWord = true;
        }
        return checkWord;
    }

    public boolean consonantWithY(String word) {
        String vowelToString = new String(vowel);
        char[] changeWord = word.toCharArray();
        for (int i = 0; i < changeWord.length; i++) {
            if (changeWord[i] == 'y') {
                if (!(vowelToString.contains("" + word.charAt(i - 1) + "") && vowelToString.contains("" + word.charAt(i + 1) + ""))) {
                    checkWord = true;
                }
            }
        }
        return checkWord;
    }


}
