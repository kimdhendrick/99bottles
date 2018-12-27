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
                return "No more bottles of beer on the wall, " +
                        "no more bottles of beer.\n" +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n";
            }
            case 1: {
                return number + " " + container(number) + " of beer on the wall, " +
                        number + " " + container(number) + " of beer.\n" +
                        "Take it down and pass it around, " +
                        "no more bottles of beer on the wall.\n";
            }
            default: {
                return number + " " + container(number) + " of beer on the wall, " +
                        number + " " + container(number) + " of beer.\n" +
                        "Take " + pronoun() + " down and pass it around, " +
                        (number - 1) + " " + container(number - 1) + " of beer on the wall.\n";
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

    private String pronoun() {
        return "one";
    }
}
