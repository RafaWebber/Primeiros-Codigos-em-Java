package revisao.constructs;

public class ClasseCarro {
    String cor;//Variável de instancia
    String placa;//Variável de instancia
    static String pais; //Variável de classe

    //construtor
    public ClasseCarro(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }
    public void paisOrigem(String pais){
        this.pais = pais;
        System.out.println("Pais de origem: " + pais);
    }

    public void detalhesCarro(){
        System.out.println("O carro tem a cor " + cor + ", com a placa: " + placa);
    }

    public void acelerar(){
        System.out.println("Carro em movimento");
    }
    public void frear(){
        System.out.println("Reduzindo velocidade");
    }
    public void abastecer(){
        System.out.println("Carro abastecido");
    }

}
