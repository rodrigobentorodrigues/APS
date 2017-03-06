
package Controle;

public class FabricaDaoC {
    
    public static FabricaDao criarFabrica(){
        return new FabricaDaoBD();
    }
    
}
