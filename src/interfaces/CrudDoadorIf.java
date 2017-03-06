package interfaces;

import Entidades.Doador;
import java.util.List;

public interface CrudDoadorIf {
    
    public void adicionar(Doador d);
    public void atualizar(Doador d);
    public List<Doador> listar();
    public void remover(String cpf);
    
}
