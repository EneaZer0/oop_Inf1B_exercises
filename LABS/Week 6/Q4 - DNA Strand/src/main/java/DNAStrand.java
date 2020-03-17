import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DNAStrand {

    private String dnaString;

    public DNAStrand(String dna) {
        dnaString = dna;
    }

    public boolean isValidDNA() {
        boolean isValidDNA = false;
        if (dnaString.length() != 0) {
            isValidDNA = true;
            boolean temporal = true;
            char[] validLetters = "ATCG".toCharArray();
            for (char letter : dnaString.toCharArray()) {
                for(int i = 0; i < validLetters.length; i++) {
                    if (letter == validLetters[i]) {
                        temporal = true;
                        break;
                    } else {
                        temporal = false;
                    }
                }
                isValidDNA =isValidDNA && temporal;

            }
        }

        return isValidDNA;
    }

    public String complementWC() {
        String complementWC = "";
        if (dnaString.length() != 0) {
            char[] validLetters = "ATCG".toCharArray();
            for (char letter : dnaString.toCharArray()) {
                if(letter == 'A') {
                    complementWC = complementWC + "T";
                } else if (letter == 'T') {
                    complementWC = complementWC + "A";
                } else if (letter == 'C') {
                    complementWC = complementWC + "G";
                } else if (letter == 'G') {
                    complementWC = complementWC + "C";
                }
            }
        }

        return complementWC;
    }

    public String palindromeWC() {
        char[] temporal = complementWC().toCharArray();
        String palindrome = "";
        for (int i = temporal.length -1; i > -1; i--) {
            palindrome = palindrome + temporal[i];
        }
        return palindrome;
    }

    public boolean containsSequence(String seq) {
        boolean isThereSequence = false;
        if (seq.length() != 0) {
            if (dnaString.contains(seq)) {
                isThereSequence = true;
            }
        }

        return isThereSequence;
    }

    public String toString() {
        String dna = dnaString;
        return dna;
    }


}
