import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new VacaMae());
        animais.add(new GalinhaMae());
        animais.add(new OvelhaMae());
        animais.add(new PorcaMae());

        animais.add(new Bezerro());
        animais.add(new Pintinho());
        animais.add(new Cordeiro());
        animais.add(new Leitoa());

        System.out.println("===== ANIMAIS DA FAZENDA =====");

        for (Animal animal : animais){
            System.out.println("\n--- Animal ---");

            animal.emitirSom();
            animal.coletarProduto();
        }
    }
}
