package symulatorDzungli.rodzajeZwierząt.aleja3;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.obserwator.Obserwowany;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class Papuga implements Dźwięki {
    Obserwowany obserwowany;
    String nazwa = "Papuga";

    public Papuga() {
        obserwowany = new Obserwowany(this);
    }
    public void dzwieki() {
        System.out.println("Wii Witaj!");
        powiadomObserwatorów();
    }

    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwowany.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        obserwowany.powiadomObserwatorów();
    }
    public String toString() {
        return "mówiąca Papuga";
    }

}

