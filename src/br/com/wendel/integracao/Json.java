package br.com.wendel.integracao;

import br.com.wendel.domain.Caracteristica;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author wendel
 */
public class Json {

    public Caracteristica carregar(String local) throws FileNotFoundException {
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(local));
            Caracteristica obj = gson.fromJson(br, Caracteristica.class);
            return obj;
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel carregar o arquivo;");
            return null;
        }
    }

    public void salvar(Caracteristica caracteristica, String local) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String g = gson.toJson(caracteristica);
        try {
            FileWriter writer = new FileWriter(local);
            writer.write(g);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
