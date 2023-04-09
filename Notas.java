package notaMedia;

import java.util.Scanner;

/**
 * Programa que te pide por teclado introducir tres notas:
 * <ol>
 * <li>nota1, </li>
 * <li>nota2, </li>
 * <li>nota3 </li>
 * </ol>
 * y calcula la media de las dos notas más altas
 *
 * @author mtisc
 */
public class Notas {
    static Scanner sc = new Scanner(System.in);
    
    protected double nota1;
    protected double nota2;
    protected double nota3;
    
    

    /**
     * Getter
     *
     * @return double con valor de <code> nota1 </code>
     */
    public double getNota1() {

        return nota1;
    }

    /**
     * Setter
     *
     * @param nota1 double que establece el valor de <code>nota1</code>
     */
    public void setNota1(double nota1) {
    }

    /**
     * Getter
     *
     * @return double con valor de <code>nota2</code>
     */
    public double getNota2() {

        return nota2;
    }

    /**
     * Setter
     *
     * @param nota2 double que establece el valor de <code>nota2</code>
     */
    public void setNota2(double nota2) {
    }

    /**
     * Getter
     *
     * @return double devuelve el valor de  <code>nota3</code>
     */
    public double getNota3() {

        return nota3;
    }

    /**
     * Setter
     *
     * @param nota3 double que establece el valor de <code>nota3</code>
     */
    public void setNota3(double nota3) {
    }

    /**
     * Método que te pide por consola introducir la nota del primer examen.
     * si nota1 es menor a cero o mayor a 10,
     * Imprime por consola: Nota no válida, introduzca nota correcta. 
     * Si la nota es válida:
     *
     * @return <code>nota1</code>
     */
    public static double primeraNota() {
       
        double nota1;
        System.out.println("Introduce nota del primer exámen: ");
        nota1 = sc.nextDouble();
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota no válida, introduzca nota correcta");
            nota1 = sc.nextDouble();
        }
        return nota1;
    }

    /**
     * Método que te pide por consola introducir la nota del segundo examen.
     * si nota2 es menor a cero o mayor a 10,
     * Imprime por consola: Nota no válida, introduzca nota correcta.
     * Si la nota es válida:
     *
     * @return <code>nota2</code>
     */
    public static double segundaNota() {
        
        double nota2;
        System.out.println("Introduce nota del segundo exámen: ");
        nota2 = sc.nextDouble();
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota no válida, introduzca nota correcta");
            nota2 = sc.nextDouble();
        }
        return nota2;
    }

    /**
     * Método que te pide por consola introducir la nota del tercer examen.
     * si nota2 es menor a cero o mayor a 10,
     * Imprimer por consola: Nota no válida, introduzca nota correcta. 
     * Si la nota es válida:
     *
     * @return <code>nota3</code>
     */
    public static double terceraNota() {
        
        double nota3;
        System.out.println("Introduce nota del tercer exámen: ");
        nota3 = sc.nextDouble();
        if (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota no válida, introduzca nota correcta");
            nota3 = sc.nextDouble();
        }
        return nota3;
    }

    /**
     * Método que calcula la media de las dos notas más altas. 
     * La notaMedia es calculada en función de los valores nota1, nota2 y nota3: 
     * Primer caso: si nota1 es mayor o igual a nota3 y nota2 es mayor o igual a nota3 
     * <code>notaMedia = (nota1 + nota2) / 2</code>
     * Segundo caso: si nota1 es mayor o igual a nota2 y nota3 es mayor o igual a nota2 
     * <code>notaMedia = (nota1 + nota3) / 2</code> 
     * En el tercer caso: 
     * <code> notaMedia = (nota2 + nota3) / 2</code> 
     * Imprime por consola un mensaje: La nota media es + notaMedia 
     *
     * @param nota1 double que establece el valor de <code>nota1</code> 
     * @param nota2 double que establece el valor de <code>nota2</code> 
     * @param nota3 double que establece el valor de <code>nota3</code>
     *
     */
    public static void calculoNotaMedia(double nota1, double nota2, double nota3) {
        double notaMedia;
        if (nota1 >= nota3 && nota2 >= nota3) {
            notaMedia = (nota1 + nota2) / 2;
            System.out.println("La nota final es: " + notaMedia);
        } else if (nota1 >= nota2 && nota3 >= nota2) {
            notaMedia = (nota1 + nota3) / 2;
            System.out.println("La nota final es: " + notaMedia);
        } else {
            notaMedia = (nota2 + nota3) / 2;
            System.out.println("La nota final es: " + notaMedia);
        }
    }

}
