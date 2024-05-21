package Principal;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */

import Interfaz.Ventana_Inicio_Admin;

public class Aplicacion {
    public static void main(String[] Kronos) {
        Ventana_Inicio_Admin ventana_adm = new Ventana_Inicio_Admin();
        ventana_adm.setVisible(true);
        ventana_adm.setLocationRelativeTo(null);
    }
}
