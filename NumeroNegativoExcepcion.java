public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion(){
        super("No existe raiz cuadrada de ese numero");
    }
    public NumeroNegativoExcepcion(String mensaje){
        super(mensaje);
    }
}

