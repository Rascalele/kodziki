package symulatorDzungli.rodzajeZwierząt.aleja2;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Tygrys implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Tygry";


    public Tygrys() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Miauuuuu!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Miły tygrys";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}
