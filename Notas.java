package notaMedia;

import java.util.Scanner;

/**
 *
 * @author mtisc
 */
public class Notas {
    static Scanner sc = new Scanner(System.in);
    
    protected double nota1;
    protected double nota2;
    protected double nota3;
    
    

    
    public double getNota1() {

        return nota1;
    }

   
    public void setNota1(double nota1) {
    }

    
    public double getNota2() {

        return nota2;
    }

   
    public void setNota2(double nota2) {
    }

    
    public double getNota3() {

        return nota3;
    }

   
    public void setNota3(double nota3) {
    }

   
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
