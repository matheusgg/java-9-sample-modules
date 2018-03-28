/**
 * javac -d mods/br.com.sample.two --module-path mods src/br.com.sample.two/module-info.java $(find src/br.com.sample.two -name "*.java")
 * <p>
 * java --module-path mods -m br.com.sample.two/br.com.sample.two.Main
 */
module br.com.sample.two {

    /**
     * requires transitive indica que quem importar este modulo br.com.sample.two importara automaticamente o modulo br.com.sample.one
     */
    requires transitive br.com.sample.one;

    /**
     * requires static e semelhante ao escopo provided do maven, ou seja, este modulo estara disponivel apenas em tempo de compilacao
     */
    //    requires static br.com.sample.one;
}