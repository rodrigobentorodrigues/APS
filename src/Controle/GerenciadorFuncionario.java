
package Controle;

import Entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario {
    
    public GerenciadorFuncionario(){};
    
    public void adicionaFuncionario(String nome, String sexo, String habilitacao,
            int idade, String email, String senha){
        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setSexo(sexo);
        f.setHabilitacao(habilitacao);
        f.setIdade(idade);
        f.setEmail(email);
        f.setSenha(senha);
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionario cad = fabrica.criaCrudFuncionario();
        cad.adicionar(f);
    }
    
    public void removerFuncionario(String email){
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionario cad = fabrica.criaCrudFuncionario();
        cad.remover(email);
    }
    
    public void atualizarFuncionario(String nome, String sexo, String habilitacao,
            int idade, String email, String senha){
        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setSexo(sexo);
        f.setHabilitacao(habilitacao);
        f.setIdade(idade);
        f.setEmail(email);
        f.setSenha(senha);
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionario cad = fabrica.criaCrudFuncionario();
        cad.atualizar(f);
    }
    
    public List<Funcionario> listar(){
        List<Funcionario> lista = new ArrayList<>();
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudFuncionario cad = fabrica.criaCrudFuncionario();
        lista = cad.listar();
        return lista;
    }
    
}
