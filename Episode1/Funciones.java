public class Funciones{

    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        //pi * r^2

        circleArea(y);

        //Area de una esfera
        //4*pi*r^2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi*r^3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + convertToDolar(200, "MXN"));
    }

    public static double circleArea (double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea (double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolumen (double r){
        return (4/3) * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency  Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDolar (double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }

        return quantity;
    }
}
