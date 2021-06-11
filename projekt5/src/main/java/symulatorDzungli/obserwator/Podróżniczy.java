package symulatorDzungli.obserwator;

public class Podróżniczy implements Obserwator {
    public void aktualizuj(DźwiękObserwowany zwierze) {
        System.out.println("Podróżniczy: To jest " + zwierze + "!");
    }
}
