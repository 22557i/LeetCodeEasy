package exam0407.q1;

public class SteamBoiler extends Boiler{
    private double temp;
    public SteamBoiler(){
        super();
    }

    @Override
    public String toString() {
        return "SteamBoiler{" +
                "temp=" + temp +
                "} " + super.toString();
    }
}
