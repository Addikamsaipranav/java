class Demo
{
public static int wordCount(String phrase) {
    StringTokenizer strTok = new StringTokenizer(phrase);
    return strTok.countTokens();
}
public static String replaceSubString(String original,
        String findString, String replaceString) {

    // If string to find and the replace string are the same then return
    // original b/c there is nothing to replace
    if (findString.equals(replaceString)) {
        return original;
    }

    // Make a StringBuffer object for original.
    StringBuffer modifiedString = new StringBuffer(original);

    // Find the first occurrence of findstring.
    int index = modifiedString.indexOf(findString);

    while (index != -1) {
        // Replace this occurrence of the substring.
        modifiedString.replace(index, (index + findString.length()),
                replaceString);

        // Find the next occurrence of findString.
        index = modifiedString.indexOf(findString);
    }

    // Return the modified string.
    return modifiedString.toString();

}
public static String arrayToString(char[] array) {
    String newString = String.valueOf(array);
    return newString;
}
public static String mostFrequent(String sentence) {

    // group existing chars together
    Map<String, Long> frequentChars = Arrays.stream(
            sentence.toLowerCase().split("")).collect(
            Collectors.groupingBy(c -> c, Collectors.counting()));

    // order highest to lowest
    Comparator<Entry<String, Long>> byValue = (entry1, entry2) -> entry1
        .getValue().compareTo(entry2.getValue());

    Optional<Entry<String, Long>> val = frequentChars.entrySet()
            .stream().sorted(byValue.reversed()).findFirst();

    return val.get().getKey();
}
public static void main(String[] args) {

    String phrase = "the dog jumped over the fence";

    // Number of words in a string
    System.out.println("Number of words in \"" + phrase + "\" is "
            + StringOperations.wordCount(phrase));

    // Show most frequent char
    System.out.println("Most frequently occurring character: "
            + StringOperations.mostFrequent(phrase));

    // Replace string
    System.out.println("Modified phrase replacing the with that: "
            + StringOperations.replaceSubString(phrase, "the", "that"));

    // Convert an array to a string and display it.
    String arrayToString = StringOperations.arrayToString(phrase
            .toCharArray());
    System.out.println("Converted arrayToString: " + arrayToString);
}
}