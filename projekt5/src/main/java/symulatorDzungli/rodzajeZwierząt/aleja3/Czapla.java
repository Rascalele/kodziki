package symulatorDzungli.rodzajeZwierząt.aleja3;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Czapla implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Czapla";


    public Czapla() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("kaaaa kaaa");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "chyba czapla";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}

