public class reverseWords {
    public static void main(String[] args) {
        String myString = reverse("let's eat, grandma");
        System.out.println(myString);

    }
   // Input: let's eat, grandma

    //Output: s'tel tae, amdnarg
    public static String reverse(String sentence) {
        //take in the string and set every word to an index in a string arrauy
        int length = sentence.length();
        //first we want to create an array of strings, each one being one of the words, REGARDLESS of punctuation
        String[] reverseArray = new String[length];

        int numberWords = 0;

        for(int i = 0; i < length; i++) {
            //initialize string to "" or else its "null"
            reverseArray[i] = "";
            //we run through the entire string, adding each character to the array if it is NOT a space
            if(sentence.charAt(i) != ' ') {
                //add the character to the string array at index numberWords
                reverseArray[numberWords] = reverseArray[numberWords] + sentence.charAt(i);
            }
            else {
                //this is a space
                numberWords++;
            }
        }
        System.out.println("Here is the number of words before reversal: " + numberWords);
        numberWords++;
        //numberwords needs to be incremented one time so it actually equals the number of words
        //now we have the sentence in array format like this
        /*
         * index
         * 0        let's
         * 1        eat,
         * 2        grandma
         */
        //this loop will run through the array
        for(int i = 0; i < numberWords; i++) {
            String reverseString = "";
            System.out.println("Here is the word we are reversing: " + reverseArray[i]);
            //this loop will run through each word in the array
            for(int k = 0; k < reverseArray[i].length(); k++) {
                //if we are not on the last character in the string, we will always reverse it
                if(k < (reverseArray[i].length()-1)) {
                    reverseString = reverseArray[i].charAt(k) + reverseString;
                } else{
                    //case where we are on the last one
                    if(Character.isLetter(reverseArray[i].charAt(k))) {
                        //if its a letter, we just reverse it as usual
                        reverseString = reverseArray[i].charAt(k) + reverseString;
                    } else {
                        //its a punctuation that should go at the end
                        reverseString = reverseString + reverseArray[i].charAt(k);
                    }
                }
            }
            reverseArray[i] = reverseString;
            
        }
        String resultString = "";
        //now we just need to create the result
        for(int i = 0; i < numberWords; i ++) {
            resultString = resultString + reverseArray[i];
            if(i < numberWords - 1) {
                resultString += " ";
            }
        }
        return resultString;
    }
}
