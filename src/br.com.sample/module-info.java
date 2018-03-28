/**
 * javac -d mods/br.com.sample --module-path mods src/br.com.sample/module-info.java $(find src/br.com.sample -name "*.java")
 * <p>
 * java --module-path mods -m br.com.sample/br.com.sample.Main
 */
module br.com.sample {

    /**
     * Indica que o modulo depende deste outro modulo
     */
    //    requires br.com.sample.one;
    requires br.com.sample.two;
}