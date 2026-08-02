package revisao.gettersAndSetters;

public class ClassCar {
    String cor;
    String placa;

    public void acelerar(){
        System.out.println("O carro está em movimento");
    }
    public void frear(){
        System.out.println("O carro está reduzindo a velocidade");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
