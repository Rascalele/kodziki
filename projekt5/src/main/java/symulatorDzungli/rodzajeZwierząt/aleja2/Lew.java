package symulatorDzungli.rodzajeZwierząt.aleja2;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Lew implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Lew";


    public Lew() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Grrrrrrau!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Ryk lwa";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}

