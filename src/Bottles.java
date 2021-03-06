import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

        return capitalize(bottleNumber + " of beer on the wall, ") +
                bottleNumber + " of beer.\n" +
                bottleNumber.action() + ", " +
                bottleNumber.successor() + " of beer on the wall.\n";
    }

    private String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}

class BottleNumber {
    public static BottleNumber of(int number) {
        try {
            return (BottleNumber) Class.forName("BottleNumber" + number).getConstructor(Integer.TYPE).newInstance(number);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            return new BottleNumber(number);
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

    public BottleNumber successor() {
        return BottleNumber.of(this.number - 1);
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

    public BottleNumber successor() {
        return BottleNumber.of(99);
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

class BottleNumber6 extends BottleNumber {
    public BottleNumber6(int number) {
        super(number);
    }

    public String container() {
        return "six-pack";
    }

    public String quantity() {
        return "1";
    }
}
