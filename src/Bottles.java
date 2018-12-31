import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

class Bottles {
    public String song() {
        return verses(99, 0);
    }

    public String verses(int starting, int ending) {
        return rangeClosed(ending, starting)
                .map(i -> (ending + starting) - i)
                .mapToObj(i -> verse(i))
                .collect(joining("\n"));
    }

    public String verse(int number) {
        BottleNumber bottleNumber = new BottleNumber(number);
        BottleNumber nextBottleNumber = new BottleNumber(bottleNumber.successor());

        return capitalize(bottleNumber + " of beer on the wall, ") +
                bottleNumber + " of beer.\n" +
                bottleNumber.action() + ", " +
                nextBottleNumber + " of beer on the wall.\n";
    }

    private String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}

class BottleNumber {
    protected int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return quantity() + " " + container();
    }

    public String container() {
        if (this.number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }

    public String pronoun() {
        if (this.number == 1) {
            return "it";
        } else {
            return "one";
        }
    }

    public String quantity() {
        if (this.number == 0) {
            return "no more";
        } else {
            return String.valueOf(this.number);
        }
    }

    public String action() {
        if (this.number == 0) {
            return "Go to the store and buy some more";
        } else {
            return "Take " + pronoun() + " down and pass it around";
        }
    }

    public int successor() {
        if (this.number == 0) {
            return 99;
        } else {
            return this.number - 1;
        }
    }
}

class BottleNumber0 extends BottleNumber {
    public BottleNumber0(int number) {
        super(number);
    }

    public String quantity() {
        if (this.number == 0) {
            return "no more";
        } else {
            return String.valueOf(this.number);
        }
    }
}
