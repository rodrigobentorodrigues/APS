package Controle;

import interfaces.CrudFuncionarioIf;
import interfaces.FabricaDaoIf;
import Entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario {
    
    public GerenciadorFuncionario(){};
    
    public void adicionaFuncionario(String nome, String sexo, String habilitacao, int idade, String email, String senha){
        Funcionario f = new Funcionario(nome, sexo, habilitacao, idade, email, senha);
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionarioIf cad = fabrica.criaCrudFuncionario();
        cad.adicionar(f);
    }
    
    public void removerFuncionario(String email){
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionarioIf cad = fabrica.criaCrudFuncionario();
        cad.remover(email);
    }
    
    public void atualizarFuncionario(String nome, String sexo, String habilitacao, int idade, String email, String senha){
        Funcionario f = new Funcionario(nome, sexo, habilitacao, idade, email, senha);
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionarioIf cad = fabrica.criaCrudFuncionario();
        cad.atualizar(f);
    }
    
    public List<Funcionario> listar(){
        List<Funcionario> lista = new ArrayList<>();
        FabricaDaoIf fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionarioIf cad = fabrica.criaCrudFuncionario();
        lista = cad.listar();
        return lista;
    }
    
}
