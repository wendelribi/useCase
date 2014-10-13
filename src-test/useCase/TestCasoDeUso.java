package useCase;

import br.com.wendel.domain.*;
import javax.swing.JOptionPane;

public class TestCasoDeUso {

	public static void main(String args[]) throws Exception{
        
        GerenteCasos gerente = new GerenteCasos();
        Caracteristica caracteristica = new Caracteristica("123", "nomeCaracteristica");
        CasoDeUso caso = new CasoDeUso("IdCasodeuso1", "nomeCasodeuso1", "DescricaoCaracteristica1");
        Passo passo = new Passo("idpasso", "nomepasso", "condiao", "resposta");
        Fluxo fluxo = new Fluxo("id11", "nome111", "Descricptionnnn", "ToSteppppp", "FromStepppp");

        gerente.incluirCasoDeUso(caso, caracteristica);
        gerente.incluirCasoDeUso(caso, caracteristica);
        gerente.incluirCasoDeUso(caso, caracteristica);
        gerente.incluirCasoDeUso(caso, caracteristica);
        gerente.incluirFluxo(fluxo, caso);
        gerente.incluirPasso(passo, fluxo);
        
    }  
}
