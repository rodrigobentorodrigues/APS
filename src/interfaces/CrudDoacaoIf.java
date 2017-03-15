package interfaces;

import Entidades.Doacao;
import java.util.List;

public interface CrudDoacaoIf {

    public boolean adicionar(Doacao d);
    public List<Doacao> listar();
    public boolean remover(String nome);

}
