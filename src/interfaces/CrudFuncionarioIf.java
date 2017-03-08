package interfaces;

import Entidades.Funcionario;
import java.util.List;

public interface CrudFuncionarioIf {

    public boolean adicionar(Funcionario f);
    public boolean atualizar(Funcionario f);
    public List<Funcionario> listar();
    public boolean remover(String email);
    
}
