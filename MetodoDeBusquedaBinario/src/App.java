import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a ordenar! ");
        Metodo metodos = new Metodo();
        Scanner scanner=new Scanner(System.in);
        int nElementos;
        System.out.println("Cuatas personas desea Ingresar? ");
        nElementos=scanner.nextInt();
        scanner.nextLine();
        
        Persona[] personas=new Persona[nElementos];
        for (int i=0;i<nElementos;i++){
            System.out.println((i+1) + ". ingrese El nombre y la edad");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            personas[i] = new Persona(nombre, edad);
        }
        metodos.Borbuja(personas);

        System.out.print("\nValor la personada de la edad: ");
        int edadBuscada = scanner.nextInt();

        int indice = metodos.buscarPorEdad(personas, edadBuscada);

        if (indice != -1) {
            System.out.println("\nLa persona con la edad " + edadBuscada + " es " + 
                              personas[indice].getNombre());
        } else {
            System.out.println("\nNo se encontró ninguna persona con edad " + edadBuscada);
        }

        scanner.close();
    }
}
