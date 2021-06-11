package symulatorDzungli.rodzajeZwierząt.aleja2;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Pantera implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Pantera";



    public Pantera() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Właaaarrrr!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Czarna pantera";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}

