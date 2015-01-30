

import java.net.InetAddress;

import org.acplt.oncrpc.OncRpcProtocols;

/**
 *  blog: http://www.micmiu.com
 * @author Michael
 *
 */
public class MyRPCDemoClientTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyRPCDemoClient client = null;
        try {
            client = new MyRPCDemoClient(InetAddress.getByName("127.0.0.1"),
                    OncRpcProtocols.ONCRPC_TCP);
        } catch (Exception e) {
            System.out
                    .println("MyRPCDemoClient: error when creating RPC client:");
            e.printStackTrace(System.out);
        }
        client.getClient().setTimeout(300 * 1000);

        System.out.println("start to test: ");
        try {
            String msg = client.SayHello_1("Michael");
            System.out.println("SayHello msg: " + msg);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return;
        }

    }

}