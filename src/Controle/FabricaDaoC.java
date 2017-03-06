package Controle;

import interfaces.FabricaDaoIf;

public class FabricaDaoC {
    
    public static FabricaDaoIf criarFabrica(){
        return FabricaDaoBD.getInstance();
    }
    
}
