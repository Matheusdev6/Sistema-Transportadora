package Transportadora;

public class Caminhao extends Veiculo{
        private int eixo;
        public Caminhao(String placa, double consumo, int combustivel, int eixo) {
            super(placa, consumo, combustivel);
            this.eixo = eixo;
        }
        public int getEixo() {
            return eixo;
        }
        public double custo_caminhao(double pedagio, double distancia, int q_ped,int eixo) {
            return (distancia/getConsumo())*6.12 + eixo*pedagio*q_ped;
        }
        @Override
        public void setCombustivel(){
            double diesel = 6.12;
            System.out.println("Qual valor de diesel deseja colocar no seu caminhão?");
            int valor = sc.nextInt();
            String clear = sc.nextLine();
            combustivel = valor/combustivel;
    }
    }

