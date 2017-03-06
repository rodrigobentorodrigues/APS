
package Controle;

import Entidades.Doador;
import Entidades.Funcionario;

public interface FabricaDao {

    public CrudFuncionario criaCrudFuncionario();
    public CrudDoador criaCrudDoador();
    
}
