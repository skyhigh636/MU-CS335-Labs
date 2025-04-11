/**
 * @author Emmanuel Ajoku,  23344271,
 * @date 19/02/2025
 */
public class UKToGermanPlugConnectorAdapter implements GermanPlugConnector {
    private UKPlugConnector plug2;

    public UKToGermanPlugConnectorAdapter(UKPlugConnector plug) {
        this.plug2 = plug;
    }

    @Override
    public void giveElectricity() {
        plug2.provideElectricity();
    }

}
