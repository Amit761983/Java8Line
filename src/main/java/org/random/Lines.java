package org.random;

public class Lines {

    public static void main(String[] args) {
        streamLines();
        mixingLineTerminators();
        emptyLines();
    }

    public static void streamLines()
    {
        var multiline = "This\r\nis a\r\nmultiline\r\nstring";
        multiline.lines()
                    .map(line -> "// " + line)
                    .forEach(System.out::println);
        System.out.println();
    }

    public static void mixingLineTerminators()
    {
        var mixedMultiline = "This\ris a\nmultiline\r\nstring";
        mixedMultiline.lines()
                .map(line -> "// " + line)
                .forEach(System.out::println);

        System.out.println();
    }

    private static void emptyLines() {
        System.out.println("Lines (including empty ones): " + "empty\n\nline".lines().count());
        System.out.println("Lines (excluding last empty one): " + "last\n\nline\n".lines().count());
        System.out.println("Lines (not excluding all trailing empty ones): " + "trailing\n\nlines\n\n\n".lines().count());
    }
}
