package loops;

public class Loops {

    public static void loops() {
        // while loop
        // syntax:
        // while (bedingung) {
        //      was wiederholt wird
        // }
        // solange bedingung = true ist, wird das, was in dem block darunter steht ausgeführt
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i += 1;
        }
        // looped 10 mal. i wird jedes mal um 1 erhöht. wenn i = 10 dann: i < 10 = false und der loop stoppt


        // for loop
        // syntax:
        // for (loopvariable; bedingung; aktion nach einer "runde") {
        //      was wiederholt wird
        // }
        // loopvariable ist die variable, die die anzahl der wiederholungen speichert
        // (wie int i = 0; bei dem while loop, nur hier in klammern)
        //
        // solange bedingung = true wird wiederholt
        //
        // aktion nach einer runde ist beispielsweise i++ (erhöht i um 1) aber auch i += 2 (erhöht i um 2 nach jeder runde)

        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
    }
}
