package symulatorDzungli.obserwator;

import symulatorDzungli.rodzajeZwierząt.Dźwięki;

public interface DźwiękObserwowany {
    public void zarejestrujObserwatora(Obserwator obserwator);
    public void powiadomObserwatorów();

}
