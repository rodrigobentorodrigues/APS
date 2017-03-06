package Controle;

import interfaces.FabricaDaoIf;

public class FabricaDaoBD implements FabricaDaoIf{

    private static FabricaDaoBD instance;
    
    private FabricaDaoBD(){};
    
    @Override
    public CrudFuncionario criaCrudFuncionario() {
        return new CrudFuncionario();
    }

    @Override
    public CrudDoador criaCrudDoador() {
        return new CrudDoador();
    }
    
    public static synchronized FabricaDaoBD getInstance(){
        if(instance == null){
            return new FabricaDaoBD();
        }else{
            return instance;
        }
    }
    
}
