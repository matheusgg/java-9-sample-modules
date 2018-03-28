package br.com.sample.two;

public class Main {

    public static void main (final String... args) {
        System.out.println("Module br.com.sample.two");

        br.com.sample.one.Main.main();
    }
}
