package symulatorDzungli.rodzajeZwierząt.aleja1;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Słoń implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Słoń";



    public Słoń() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Pisk tąbą!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Słooooń";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}

