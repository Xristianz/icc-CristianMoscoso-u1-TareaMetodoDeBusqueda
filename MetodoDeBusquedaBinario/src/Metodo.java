public class Metodo {
    public void Borbuja(Persona[] arreglo){
        int n=arreglo.length;
        boolean intercambio;
        for (int i=0; i<(n-1); i++){
            intercambio=false;    
            for (int j=0; j<n-i-1;j++){
                if (arreglo[j].getEdad()>arreglo[j+1].getEdad()){
                    Persona temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                    intercambio = true;
                }
            }

        }

    }
    public int buscarPorEdad(Persona[] personas, int edadBuscada) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int edadCentro = personas[centro].getEdad();
            mostrarSubarreglo(personas, bajo, alto);            
            System.out.print("bajo=" + bajo + "    ");
            System.out.print("alto=" + alto + "    ");
            System.out.print("centro=" + centro + "    ");
            System.out.print("valorCentro=" + edadCentro + "    ");

            if (edadCentro == edadBuscada) {
                System.out.println("-> ENCONTRADO");
                
                while (centro > 0 && personas[centro - 1].getEdad() == edadBuscada) {
                    centro--;
                }
                return centro;
            } else if (edadCentro < edadBuscada) {
                System.out.println("-> DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("-> IZQUIERDA");
                alto = centro - 1;
            }
        }
        return -1; 
    }
    private void mostrarSubarreglo(Persona[] personas, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            System.out.print(personas[i].getEdad());
            if (i < fin) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }
}
    

