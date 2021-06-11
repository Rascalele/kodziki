package symulatorDzungli.rodzajeZwierząt.aleja1;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Małpa implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Małpa";


    public Małpa() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Uhu gu!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Zwykła małpa";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}
