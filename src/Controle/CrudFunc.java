
package Controle;

import Entidades.Funcionario;
import java.util.List;

public interface CrudFunc {

    public void adicionar(Funcionario f);
    public void atualizar(Funcionario f);
    public List<Funcionario> listar();
    public void remover(String email);
    
}
