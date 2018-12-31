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

        return bottleNumber.quantity().substring(0, 1).toUpperCase() + bottleNumber.quantity().substring(1) + " " + bottleNumber.container() + " of beer on the wall, " +
                bottleNumber.quantity() + " " + bottleNumber.container() + " of beer.\n" +
                bottleNumber.action() + ", " +
                nextBottleNumber.quantity() + " " + nextBottleNumber.container() + " of beer on the wall.\n";
    }
}

class BottleNumber {
    private int number;

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
