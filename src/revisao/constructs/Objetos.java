package revisao.constructs;

public class Objetos {
    static void main() {

        //construtor
        ClasseCarro classeCarro1 =  new ClasseCarro("Azul", "RF6TY89");
        classeCarro1.detalhesCarro();
        //classeCarro1.paisOrigem("Alemanha");
        classeCarro1.acelerar();

        ClasseCarro classeCarro2 =  new ClasseCarro("Verde", "Y3GTY89");
        classeCarro2.detalhesCarro();
        classeCarro2.paisOrigem("Brasil");
        classeCarro2.acelerar();
        classeCarro2.frear();
    }
}
