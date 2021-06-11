package symulatorDzungli.dekorowanieZwierząt;

import symulatorDzungli.obserwator.Obserwator;
import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public class KotyLicznik implements Dźwięki{
    Dźwięki koty;
    String nazwa;
    static int liczbaKotów;


    public KotyLicznik(Dźwięki koty) {
        this.koty = koty;
    }

    public void dzwieki() {
        koty.dzwieki();
        liczbaKotów++;
    }

    public static int pobierzLiczbaKotów() {
        return liczbaKotów;
    }
    public void zarejestrujObserwatora(Obserwator obserwator) {
        koty.zarejestrujObserwatora(obserwator);
    }
    public void powiadomObserwatorów() {
        koty.powiadomObserwatorów();
    }
    public static int zresetujLiczbe() {return liczbaKotów=0;}


}
