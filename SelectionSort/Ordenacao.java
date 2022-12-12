package SelectionSort;

public class Ordenacao {
    private int vet[] = {9,8,5,6,3,4,7,0,2,1};

    public void selectionSort(){
        int it;
        int posMenorInicial;
        int posMenor;
        int aux;


        mostraVet();
        for (it = 0; it < vet.length - 1; it++) {
            posMenorInicial = it;
            posMenor = it + 1;
            for (int i = posMenor+1; i < vet.length; i++) {
                if (vet[i] < vet[posMenor]) {
                    posMenor = i;
                }
            }
            System.out.println("Menor elemento encontrado na iteração está na posição " + posMenor);
            if (vet[posMenor] < vet[posMenorInicial]) {
                aux = vet[posMenorInicial];
                vet[posMenorInicial] = vet[posMenor];
                vet[posMenor] = aux;
            }
            System.out.println("---------> Final da " + it + "º interação <---------");
            mostraVet();
        }
    }

    public void mostraVet(){
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+ " ");
        }
        System.out.println("");
    }
}
