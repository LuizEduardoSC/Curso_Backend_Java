package br.com.leduardo.anotacao;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Define a anotação
@Retention(RetentionPolicy.RUNTIME) // disponível em tempo de execução
@Target(ElementType.TYPE)           // pode ser usada em classes, interfaces, enums
public @interface Tabela {
    String value(); // nome da tabela
}
