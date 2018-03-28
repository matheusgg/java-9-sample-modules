package br.com.sample;

import java.lang.reflect.Method;

public class Main {

    public static void main (final String... args) {
        System.out.println("Module br.com.sample");

        br.com.sample.one.Main.main();

        /**
         * Acessando a classe br.com.sample.one.internal.Simple do modulo br.com.sample.one via reflection sem que a mesma esteja exportada
         */
        try {
            final Class<?> mainClass = Class.forName("br.com.sample.one.internal.Simple");
            final Object instance = mainClass.getConstructor().newInstance();
            final Method mainMethod = mainClass.getDeclaredMethod("show");
            mainMethod.invoke(instance);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
