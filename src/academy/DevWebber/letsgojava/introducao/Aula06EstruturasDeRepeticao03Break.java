package academy.DevWebber.letsgojava.introducao;

public class Aula06EstruturasDeRepeticao03Break {
    static void main(String[] args){
        double valorTotal = 30000;
        double parcela;

        for (parcela = 1; parcela <= 1000; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
               break;
            }
            System.out.println("quantidade de parcelas:  "+parcela+"; Valor da parcela: R$ "+valorParcela);
        }

        double valorT = 30000;
        double par;
        for (par = valorT; par >= 1; par--) {
            double valorPar= valorT / par;
            if (valorPar < 1000){
                continue;
            }
            System.out.println("--Quantidade de parcelas:  "+par+"; Valor da parcela: R$ "+valorPar);
        }

    }
}
