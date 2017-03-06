package Controle;

import Entidades.Doador;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDoador {
    
    public GerenciadorDoador(){};
    
    public void adicionarDoador(String nome, String cpf, String dataNascimento, 
            String sexo, String tipoSanguineo, double peso){
        Doador d = new Doador();
        d.setNome(nome);
        d.setCpf(cpf);
        d.setDataNascimento(dataNascimento);
        d.setSexo(sexo);
        d.setTipoSanguineo(tipoSanguineo);
        d.setPeso(peso);
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudDoador cad = fabrica.criaCrudDoador();
        cad.adicionar(d);
    }
    
    public void atualizarDoador(String nome, String cpf, String dataNascimento, 
            String sexo, String tipoSanguineo, double peso){
        Doador d = new Doador();
        d.setNome(nome);
        d.setCpf(cpf);
        d.setDataNascimento(dataNascimento);
        d.setSexo(sexo);
        d.setTipoSanguineo(tipoSanguineo);
        d.setPeso(peso);
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudDoador cad = fabrica.criaCrudDoador();
        cad.atualizar(d);
    } 
    
    public List<Doador> listar(){
        List<Doador> lista = new ArrayList<>();
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudDoador cad = fabrica.criaCrudDoador();
        lista = cad.listar();
        return lista;
    }
    
    public void remover (String cpf){
        FabricaDao fabrica = FabricaDaoC.criarFabrica();
        CrudDoador cad = fabrica.criaCrudDoador();
        cad.remover(cpf);
    }
    
}
