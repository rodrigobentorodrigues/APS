package interfaces;

import Entidades.Doador;
import java.util.List;

public interface CrudDoadorIf {
    
    public boolean adicionar(Doador d);
    public boolean atualizar(Doador d);
    public List<Doador> listar();
    public boolean remover(String cpf);
    
}
