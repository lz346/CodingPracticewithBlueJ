
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char[] temp = valueToBeReversed.toCharArray();
        String result = "";
        for (int i = temp.length - 1; i >= 0; i--){
            result = result+temp[i];
        }
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len = word.length();
        int mid = len/2;
        if (len%2==0){
            return word.charAt(mid-1);
        }
        else{     
            return word.charAt(mid);
        }
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] temp = value.toCharArray();
        String result = "";
        for (int i = 0; i <= temp.length - 1; i++){
            if (temp[i] != charToRemove){
                result = result+temp[i];
            }
        }
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] words = sentence.split("\\s");
        return words[words.length-1];
    }
}
