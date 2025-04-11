
/*
 * Test different brands of plugs.
 */
public final class TestPlugs{

    public static void main (String args[]){
        testGermanToUKAdapter();
        testUKToGermanAdapter();
    }


    /*
     *	Test Method for testing GermanToUK Adapter.
     */
    public static void testGermanToUKAdapter(){
        /* create a germany plug connector (brand: zest) */
        GermanPlugConnector plug = new ZestPlug();
        /* create a UK socket */
        UKElectricalSocket socket = new UKElectricalSocket();
        /* create an adapter */
        UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
        /* use this adapter in a UK socket */
        socket.plugIn(ukAdapter);
    }

    /*
     *	Test Method for testing GermanToUK Adapter.
     */
    public static void testUKToGermanAdapter(){

        UKPlugConnector plug2 = new Furutech();

        GermanElectricalSocket socket2 = new GermanElectricalSocket();

        GermanPlugConnector gerAdapter = new UKToGermanPlugConnectorAdapter(plug2);

        socket2.plugIn(gerAdapter);
    }
}
