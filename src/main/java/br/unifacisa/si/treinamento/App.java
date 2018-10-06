package br.unifacisa.si.treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import br.unifacisa.si.treinamento.App;

@SpringBootApplication
@EnableAutoConfiguration

public class App {
	public static void main(String[] args) {
	SpringApplication.run(App.class,args);
	}
}
