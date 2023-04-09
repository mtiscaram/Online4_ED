package notaMedia;

/**
 * Clase principal extendida de la superclase Notas
 *
 * @author mtisc
 * @version 15.03.2023
 */
public class NotaMediaFinal extends Notas {
    
    

    
    /**
     * Variables de tipo double
     * <ol>
     * <li>nota1</li>
     * <li>nota2</li>
     * <li>nota3</li>
     * </ol>
     * que se obtienen llamando a diferentes métodos
     */
    /**
     * Diferentes métodos que se llaman de la clase Notas
     *
     * @see primeraNota()
     * @see segundaNota()
     * @see terceraNota()
     * @see CalculoNotaMedia(nota1, nota2, nota3)
     */
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        double nota1 = primeraNota();
        double nota2 = segundaNota();
        double nota3 = terceraNota();
        calculoNotaMedia(nota1, nota2, nota3);
      
    }

    

    

}
