package Controle;

import Entidades.Doacao;
import interfaces.CrudDoacaoIf;
import interfaces.FabricaDaoIf;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDoacao {

    public GerenciadorDoacao() {
    }

    ;
    
    public boolean adicionar(String cpf, String nome, String fator, String data, String hora) {
        Doacao d = new Doacao(cpf, nome, fator, data, hora);
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoacaoIf cad = fabrica.criaCrudDoacao();
        return cad.adicionar(d);
    }

    public boolean remover(String cpf) {
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoacaoIf cad = fabrica.criaCrudDoacao();
        return cad.remover(cpf);
    }
    
    public List<Doacao> listar(){
        List<Doacao> lista = new ArrayList<>();
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoacaoIf cad = fabrica.criaCrudDoacao();
        lista = cad.listar();
        return lista;
    }

}
