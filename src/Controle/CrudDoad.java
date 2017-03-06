
package Controle;

import Entidades.Doador;
import java.util.List;

public interface CrudDoad {
    
    public void adicionar(Doador d);
    public void atualizar(Doador d);
    public List<Doador> listar();
    public void remover(String cpf);
    
}
