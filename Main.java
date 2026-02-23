package Transportadora;
import java.util.HashMap;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro("DFU9Y76", 12.7, 70);
        Moto moto = new Moto("REM6H43", 29, 13);
        Caminhao caminhao = new Caminhao("GTW7K09", 2, 450, 4);
        System.out.println(">>>>>Sistema de calcular frete<<<<<");
        System.out.println("Digite o ponto de saída.");
        String saida = sc.nextLine();
        System.out.println("Digite o ponto de chegada.");
        String chegada = sc.nextLine();
        System.out.println("Digite a distância da entrega");
        double distancia = sc.nextDouble();
        System.out.println("Digite a quantidade de pedágios no percurso.");
        int q_ped = sc.nextInt();
        String clear = sc.nextLine();
        System.out.println("Calculando frete");
        try {
            for (int c = 0; c<3;c++){
                System.out.println(".");
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Ocorreu um erro.");
        }
        HashMap<String, Double> veic = new HashMap<>();
        veic.put("moto",moto.custo(29,6.4,distancia,q_ped));
        veic.put("carro", carro.custo(12.7,12.8,distancia,q_ped));
        veic.put("caminhão",caminhao.custo_caminhao(12.8,distancia,q_ped,caminhao.getEixo()));
        double[] valores = new double[3];
        int i = 0;
        for (Double value : veic.values()){
            valores[i] = value;
            i++;
        }
        Arrays.sort(valores);
        for (Map.Entry<String, Double> entry : veic.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (valores[0] == value){
                System.out.printf("O modal escolhido foi %s com o valor de %.2f para o frete de %s a %s.",key,value,saida,chegada);
            }
        }
    }
}