/**
 * javac -d mods/br.com.sample.one --module-path mods src/br.com.sample.one/module-info.java $(find src/br.com.sample.one -name "*.java")
 * <p>
 * java --module-path mods -m br.com.sample.one/br.com.sample.one.Main
 */
module br.com.sample.one {

    /**
     * exports ... to ... indica que este pacote estara visivel apenas para o modulo especificado
     */
    //    exports br.com.sample.one to br.com.sample;
    exports br.com.sample.one;

    /**
     * Permite que os modulos acessem as classes desse pacote via reflection
     */
    opens br.com.sample.one.internal;
}