package ahorcado;

import ahorcadoClass.ahorcadoClass;
import ahorcadoService.ahorcadoService;

public class Ahorcado {

    public static void main(String[] args) {
        ahorcadoService as = new ahorcadoService();
        ahorcadoClass ac = as.insert();
        
        as.juego(ac);
    }

}
