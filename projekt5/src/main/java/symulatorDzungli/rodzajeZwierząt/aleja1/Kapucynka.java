package symulatorDzungli.rodzajeZwierząt.aleja1;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Kapucynka implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Kapucynka";


    public Kapucynka() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("igu gugu!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Mała małpka kapucynka";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}
