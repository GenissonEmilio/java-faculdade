import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random ale =  new Random();
        final int num_Q =  6;
        int cont_carros_M =0;

        int cont_M = 0;
        int cont_T = 0;

        int cont_MS=0;
        int cont_TS=0;
        int maior=0;

        int[] vet = new int[num_Q];
        int[] vet2 = new int[num_Q];


        System.out.println("Manha :");
        for(int c = 0; c<num_Q;c++) {
            vet[c] = ale.nextInt(201);
            if(vet[c]>100) cont_carros_M++;
            System.out.print(vet[c] + " ");
        }


        System.out.println("\nTarde :");
        for(int i=0; i<num_Q;i++){
            vet2[i] = ale.nextInt(201);
            System.out.print(vet2[i] + " ");
            if(vet2[i]> maior) maior= vet2[i];
        }


        for(int u=0; u<num_Q;u++){

            if(vet[u] >= 100 && vet[u] < 140) cont_M++;
            if(vet2[u] >= 100 && vet2[u] < 140) cont_T++;

            if(vet[u] > 140) cont_MS ++;
            if( vet2[u] > 140) cont_TS ++;
        }

        int multa_total = (cont_M*100)+(cont_T*100)+(cont_MS*200)+(cont_TS*200);

        System.out.print("\nNumero de carro com velocidade acima de 100km pela manhã : "+cont_carros_M);
        System.out.print("\nMaior velocidade a tarde: "+(maior));
        System.out.print("\nTotal de multa dos dois turnos : "+multa_total);

        System.out.print("\nVelocidade acima de 100 total manha: "+cont_M);
        System.out.print("\nVelocidade acima de 100 total tarde: "+cont_T);

        System.out.print("\nVelocidade acima de 140 total manha : "+cont_MS);
        System.out.print("\nVelocidade acima de 140 total tarde : "+cont_TS);


    }
}