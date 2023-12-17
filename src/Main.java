public class Main {
    public static void main(String[] args) {
        String sentence = "Ich esse Tomaten aus dem Garten";
        System.out.println(reverseWords(sentence));
    }

    public static String reverseWords(String sentence) {
        // Aufteilen des Satzes in einzelne Wörter (ist dann ein Array aus Wörtern)
        String[] words = sentence.split(" ");

        // Erstellen eines zweiten Wörterarrays für die umgetauschten Wörter
        String[] reversed = new String[words.length];

        // hier benutzen wir einen Trick:
        // "i" ist die Position in dem Neuen, vertauschen Array.
        // "words.length - i - 1" ist (wenn i = 0) ist die letzte position in dem Array words
        // ("- 1", da Arrays bei 0 beginnen, array.length aber die Anzahl der items in dem Array gibt und nicht die "größtmögliche Position").
        // Bsp.: Array = { 1, 2, 3, 4 }
        //                 ^0 ^1 ^2 ^3   (^4 außerhalb des Arrays)
        //       Array.length = 4
        // Wenn wir i dann inkrementieren, (also i = 1), sind wir an der zweiten Position von "reversed" und "words.length - i - 1" wäre dann die Vorletzte in "words".
        // Bsp.: i = 0
        //       Array1 = { 1, 2, 3, 4 }, length = 4
        //             i = 0^
        //       Array2 = { 5, 6, 7, 8 }, length = 4
        //         length - i - 1 = 3^
        //       Array1[i] -> 1
        //       Array2[array2.length - i - 1] -> 8
        //
        //       i = 1
        //       Array1 = { 1, 2, 3, 4 }, length = 4
        //                i = 1^
        //       Array2 = { 5, 6, 7, 8 }, length = 4
        //      length - i - 1 = 3^

        //       Array1[i] -> 2
        //       Array2[array2.length - i - 1] -> 7
        //
        //       ...
        for (int i = 0; i < words.length; i++) {
            reversed[i] = words[words.length - i - 1];
        }

        // Der resultierende vertauschte Satz
        String result = "";

        // Wir müssen nur noch durch die vertauchten Wörter loopen und diese dann einzeln
        // an den resultierenden Satz anhängen. Wie eine Summe aus mehreren Zahlen bilden.
        for (int i = 0; i < reversed.length; i++) {
            result = result + reversed[i] + " ";
        }

        // Anschließend geben wir den resultierenden Satz zurück.
        return result;

    }



}
  /*
    public static String reverseWordsOneLiner(String sentence) {
        return String.join(" ", Arrays.asList(sentence.split("\\s")).reversed());
    }
     */
