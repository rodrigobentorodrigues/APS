package Controle;

import interfaces.CrudDoadorIf;
import interfaces.FabricaDaoIf;
import Entidades.Doador;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDoador {
    
    public GerenciadorDoador(){};
    
    public void adicionarDoador(String nome, String cpf, String dataNascimento, String sexo, String tipoSanguineo, double peso){
        Doador d = new Doador(nome, cpf, dataNascimento, sexo, tipoSanguineo, peso);
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        cad.adicionar(d);
    }
    
    public void atualizarDoador(String nome, String cpf, String dataNascimento, String sexo, String tipoSanguineo, double peso){
        Doador d = new Doador(nome, cpf, dataNascimento, sexo, tipoSanguineo, peso);        
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        cad.atualizar(d);
    } 
    
    public List<Doador> listar(){
        List<Doador> lista = new ArrayList<>();
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        lista = cad.listar();
        return lista;
    }
    
    public void remover (String cpf){
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudDoadorIf cad = fabrica.criaCrudDoador();
        cad.remover(cpf);
    }
    
}
