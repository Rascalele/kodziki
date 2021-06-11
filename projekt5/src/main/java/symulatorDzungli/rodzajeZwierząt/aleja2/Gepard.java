package symulatorDzungli.rodzajeZwierząt.aleja2;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Gepard implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Gepard";


    public Gepard() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Mrau Mrau!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Gepard";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}

