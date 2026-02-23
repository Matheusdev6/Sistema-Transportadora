package Transportadora;
import java.util.Scanner;
public class Veiculo {
    private String placa;
    private double consumo;
    public double combustivel;
    Scanner sc = new Scanner(System.in);
    public Veiculo(String placa, double consumo, int combustivel){
        this.placa = placa;
        this.consumo = consumo;
        this.combustivel = combustivel;
    }
    public void setCombustivel(){
        double gasolina = 6.31;
        System.out.println("Qual valor de gasolina deseja colocar no seu veiculo?");
        int valor = sc.nextInt();
        String clear = sc.nextLine();
        combustivel = valor/combustivel;
    }
    public double getCombustivel()
    {
        return combustivel;
    }
    public String getPlaca(){
        return placa;
    }
    public double getConsumo() {
        return consumo;
    }
    public double custo(double consumo, double pedagio, double distancia, int q_ped){
        return (distancia/getConsumo())*6.31 + q_ped*pedagio;
    }
    public void entrega(String veiculo, String saida, String chegada){
        System.out.printf("Entrega de %s a %s com o modal %s",saida,chegada,veiculo);
    }
}



