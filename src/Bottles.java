class Bottles {
    public String verse(int number) {
        return number + " bottles of beer on the wall, " +
                number + " bottles of beer.\n" +
                "Take one down and pass it around, " +
                (number - 1) + pluralize(number) + " of beer on the wall.\n";
    }

    private String pluralize(int number) {
        return " bottle" + ((number - 1) == 1 ? "" : "s");
    }
}