package symulatorDzungli.dekorowanieZwierząt;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class ZwierzetaLicznik implements Dźwięki {
    Dźwięki zwierze;
    String nazwa;
    static int liczbaZwierzat;


    public ZwierzetaLicznik(Dźwięki zwierze) {
        this.zwierze = zwierze;
    }

    public void dzwieki() {
        zwierze.dzwieki();
        liczbaZwierzat++;
    }

    public static int pobierzLiczbaZwierząt() {
        return liczbaZwierzat;
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        zwierze.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        zwierze.powiadomObserwatorów();
    }
    public static int zresetujLiczbe() {return liczbaZwierzat=0;}


}
