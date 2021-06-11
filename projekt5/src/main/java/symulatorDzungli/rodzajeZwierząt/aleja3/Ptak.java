package symulatorDzungli.rodzajeZwierząt.aleja3;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Ptak implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Ptak";


    public Ptak() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Kraaa! Kraaa!");
        powiadomObserwatorów();
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "Odgłos jakiegoś ptaka";
    }
    public String pobierzNazwa() {
        return nazwa;
    }

}