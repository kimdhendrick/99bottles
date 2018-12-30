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
        return quantity(number).substring(0, 1).toUpperCase() + quantity(number).substring(1) + " " + container(number) + " of beer on the wall, " +
                quantity(number) + " " + container(number) + " of beer.\n" +
                action(number) + ", " +
                quantity(successor(number)) + " " + container(successor(number)) + " of beer on the wall.\n";
    }

    private String container(int number) {
        return new BottleNumber(number).container();
    }

    private String pronoun(int number) {
        return new BottleNumber(number).pronoun(number);
    }

    private String quantity(int number) {
        return new BottleNumber(number).quantity();
    }

    private String action(int number) {
        return new BottleNumber(number).action();
    }

    private int successor(int number) {
        return new BottleNumber(number).successor();
    }
}

class BottleNumber {
    private int number;

    public BottleNumber(int number) {
        this.number = number;
    }

    public String container() {
        if (this.number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }

    public String pronoun() {
        return pronoun(-1);
    }
    
    public String pronoun(int deleteMe) {
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
            return "Take " + pronoun(this.number) + " down and pass it around";
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
