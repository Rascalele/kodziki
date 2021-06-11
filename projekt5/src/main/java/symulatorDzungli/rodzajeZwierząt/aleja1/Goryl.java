package symulatorDzungli.rodzajeZwierząt.aleja1;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Goryl implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Goryl";

    public Goryl() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Uhuhuhu! Uhuhu!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Wściekły goryl";
    }
    public String pobierzNazwa() { return nazwa; }

}
