package Controle;

import interfaces.CrudDoadorIf;
import interfaces.FabricaDaoIf;
import Entidades.Doador;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDoador {
    
    public GerenciadorDoador(){};
    
    public boolean adicionarDoador(String nome, String cpf, String dataNascimento, String sexo, String tipoSanguineo, double peso){
        Doador d = new Doador(nome, cpf, dataNascimento, sexo, tipoSanguineo, peso);
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        return cad.adicionar(d);
    }
    
    public boolean atualizarDoador(String nome, String cpf, String dataNascimento, String sexo, String tipoSanguineo, double peso){
        Doador d = new Doador(nome, cpf, dataNascimento, sexo, tipoSanguineo, peso);        
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        return cad.atualizar(d);
    } 
    
    public List<Doador> listar(){
        List<Doador> lista = new ArrayList<>();
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        lista = cad.listar();
        return lista;
    }
    
    public boolean remover (String cpf){
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        return cad.remover(cpf);
    }
    
}
