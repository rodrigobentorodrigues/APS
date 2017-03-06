
package Controle;

public class FabricaDaoBD implements FabricaDao{

    public FabricaDaoBD(){};
    
    @Override
    public CrudFuncionario criaCrudFuncionario() {
        return new CrudFuncionario();
    }

    @Override
    public CrudDoador criaCrudDoador() {
        return new CrudDoador();
    }
    
}
