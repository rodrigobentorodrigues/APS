package interfaces;

import Entidades.Doacao;
import Entidades.Doador;
import java.util.List;

public interface CrudDoacaoIf {

    public boolean adicionar(Doacao d);
    public boolean atualizar(Doacao d);
    public List<Doacao> listar();
    public boolean remover(String cpf);

}
