

import java.io.IOException;

import org.acplt.oncrpc.OncRpcException;

/**
 * blog: http://www.micmiu.com
 * @author Michael
 */
public class MyRPCDemoServer extends MyRPCDemoServerStub {

    public MyRPCDemoServer() throws OncRpcException, IOException {
        super();
    }

    @Override
    public String SayHello_1(String arg1) {
        return "Hi," + arg1 + "  Welcome to Myblog: www.micmiu.com";
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Starting MyRPCDemoServer...");
        try {
            MyRPCDemoServer server = new MyRPCDemoServer();
            server.run();
        } catch (Exception e) {
            System.out.println("MyRPCDemoServer error:");
            e.printStackTrace(System.out);
        }
        System.out.println("MyRPCDemoServer stopped.");
    }
}