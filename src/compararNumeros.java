public class compararNumeros {
    public int numero1;
    public int numero2;

    public compararNumeros(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public void comparar() {
        if (numero1 > numero2) {
            System.out.println("El primer número es mayor");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número es mayor");
        } else if (numero1 == numero2) {
            System.out.println("Los dos números son iguales");
        }


    }
}
