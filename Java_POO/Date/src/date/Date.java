package date;

import dateClass.dateClass;
import dateService.dateService;

/**
 *
 * @author jpach
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dateService ds = new dateService();
        dateClass dc = ds.fecha();

        ds.diferencia(dc);
        System.out.println(dc.toString());
        ds.fechaA(dc);
    }

}
