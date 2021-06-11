package symulatorDzungli.rodzajeZwierząt.aleja1;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Żyrafa implements Dźwięki {
    Obserwowany obserwowany;
    public String nazwa = "Żyrafa";

    public Żyrafa() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Mlask liści");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Żyrafa";
    }
    public String pobierzNazwa() {
        return nazwa;
    }
}

