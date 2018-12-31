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
        BottleNumber bottleNumber = BottleNumber.of(number);
        BottleNumber nextBottleNumber = BottleNumber.of(bottleNumber.successor());
        // BottleNumber nextBottleNumber = bottleNumber.successor();

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
    public static BottleNumber of(Object number) {
        if (number instanceof BottleNumber) {
            return (BottleNumber) number;
        }

        switch ((int) number) {
            case 0:
                return new BottleNumber0((int) number);
            case 1:
                return new BottleNumber1((int) number);
            default:
                return new BottleNumber((int) number);
        }
    }

    protected int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return quantity() + " " + container();
    }

    public String container() {
        return "bottles";
    }

    public String pronoun() {
        return "one";
    }

    public String quantity() {
        return String.valueOf(this.number);
    }

    public String action() {
        return "Take " + pronoun() + " down and pass it around";
    }

    public int successor() {
        return this.number - 1;
    }
}

class BottleNumber0 extends BottleNumber {
    public BottleNumber0(int number) {
        super(number);
    }

    public String quantity() {
        return "no more";
    }

    public String action() {
        return "Go to the store and buy some more";
    }

    public int successor() {
        return 99;
    }
}

class BottleNumber1 extends BottleNumber {
    public BottleNumber1(int number) {
        super(number);
    }

    public String container() {
        return "bottle";
    }

    public String pronoun() {
        return "it";
    }
}
