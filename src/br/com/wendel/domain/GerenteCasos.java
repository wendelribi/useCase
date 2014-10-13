package br.com.wendel.domain;

import br.com.wendel.integracao.IECaso;
import br.com.wendel.integracao.Json;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GerenteCasos implements IECaso {

    Caracteristica caracteristica;

    public void criarCaracteristica(String id, String nome, CasoDeUso caso) {
        caracteristica = new Caracteristica(id, nome, caso);
    }

    public void incluirPasso(Passo passo, Fluxo fluxo) {
        fluxo.setListaDePassos(passo);
    }

    public void incluirFluxo(Fluxo fluxo, CasoDeUso caso) {
        caso.setFluxo(fluxo);
    }

    public void incluirCasoDeUso(CasoDeUso caso, Caracteristica caracteristica) {
        if (caracteristica.listaDeCasos.size() == 0) {
            caracteristica.setListaDeCasos(caso);
        } else {
            if (pesquisarCaso(caso.getId(), caracteristica) != null) {
                throw new RuntimeException("ID Existente, tente outro.");
            }
            caracteristica.setListaDeCasos(caso);
        }
    }

    public CasoDeUso pesquisarCaso(String id, Caracteristica caracteristica) {
        for (int i = 0; i <= caracteristica.listaDeCasos.size(); i++) {
            if (id.equals(caracteristica.listaDeCasos.get(i).getId())) {
                return caracteristica.listaDeCasos.get(i);
            }
        }
        return null;
    }

    @Override
    public void salvar(Caracteristica caracteristica, String local) throws IOException {
        new Json().salvar(caracteristica, local);
    }

    @Override
    public Caracteristica carregar(String local) throws FileNotFoundException {
        return new Json().carregar(local);
    }

}
