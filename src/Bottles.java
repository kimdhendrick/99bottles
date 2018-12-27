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
        switch (number) {
            case 0: {
                return quantity(number).substring(0, 1).toUpperCase() + quantity(number).substring(1) + " bottles of beer on the wall, " +
                        "no more bottles of beer.\n" +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n";
            }
            default: {
                return number + " " + container(number) + " of beer on the wall, " +
                        number + " " + container(number) + " of beer.\n" +
                        "Take " + pronoun(number) + " down and pass it around, " +
                        quantity(number - 1) + " " + container(number - 1) + " of beer on the wall.\n";
            }
        }
    }

    private String container(int number) {
        if (number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }

    private String pronoun(int number) {
        if (number == 1) {
            return "it";
        } else {
            return "one";
        }
    }

    private String quantity(int number) {
        if (number == 0) {
            return "no more";
        } else {
            return String.valueOf(number);
        }
    }
}
