import java.util.Scanner;

public class CaracterEn {

    public static void main(String[] args) {

        Scanner scannerOpc = new Scanner(System.in);

        String opc = "";

        System.out.printf("Elige el programa que quieras realizar \n 1. 1er programa \n 2. 2do programa \n Opcion: ");

        opc = scannerOpc.nextLine();

        switch(opc){

            case "1":  if(opc.equals("1")){

                System.out.println("Introduce un texto: ");

                Scanner sc = new Scanner(System.in);

                String lectTeclado = sc.nextLine();

                try{
                    char caracter = CaracterEn.caracterEn(lectTeclado,7);

                    System.out.println("El caracter en la posicion 7 de la cadena es: " + caracter);
                }catch(Exception e){
                    System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
                }
            }

            case "2": if(opc.equals("2")){

                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingresa un numero: ");
                int numero = scanner.nextInt();

                try{
                    if(numero<0){
                        throw new NumeroNegativoExcepcion();
                    }else{
                        double raiz = Math.sqrt(numero);
                        System.out.println("La raiz cuadrada del numero es igual a " + raiz);
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static char caracterEn(String cadena, int entero) throws Exception{

        if(entero >= 0 && entero < cadena.length()){
            return cadena.charAt(entero);
        }else{
            throw new Exception("No hay nada en esa posicion");
        }

    }

}