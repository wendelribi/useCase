package useCase;

import br.com.wendel.domain.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

public class TestCasoDeUso {

    public static void main(String args[]) throws Exception {

        GerenteCasos gerente = new GerenteCasos();
        Caracteristica caracteristica = new Caracteristica("123", "nomeCaracteristica");
        CasoDeUso caso = new CasoDeUso("IdCasodeuso1", "nomeCasodeuso1", "DescricaoCaracteristica1");
        Passo passo = new Passo("idpasso", "nomepasso", "condiao", "resposta");
        Fluxo fluxo = new Fluxo("id11", "nome111", "Descricptionnnn", "ToSteppppp", "FromStepppp");

        gerente.incluirCasoDeUso(caso, caracteristica);
        gerente.incluirFluxo(fluxo, caso);
        gerente.incluirPasso(passo, fluxo);
        
        String s = "getFluxo()";
        
        Class<?> classe = caracteristica.getListaDeCasos().get(0).getFluxo().get(0).getClass();
        for (Method atributo : classe.getDeclaredMethods()) {
            System.out.println(atributo.getName());
        }

        //System.out.println(caracteristica.getListaDeCasos().getClass);
    }
}
