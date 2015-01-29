package server;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.gemantic.analyse.thrift.index.IndexNewsOperatorServices;
import com.gemantic.analyse.thrift.index.NewsModel;

public class ThriftClientTest {

	/**
	 * @param args
	 * @throws TException 
	 */
	public static void main(String[] args) throws TException {
		// TODO Auto-generated method stub
		TTransport transport = new TSocket("10.0.0.41", 9813);
		long start=System.currentTimeMillis();
//		TTransport transport = new TSocket("218.11.178.110",9090);
        TProtocol protocol = new TBinaryProtocol(transport);
        IndexNewsOperatorServices.Client client=new IndexNewsOperatorServices.Client(protocol);
        transport.open();
        client.deleteArtificiallyNews(123456);
        NewsModel newsModel=new NewsModel();
        newsModel.setId(789456);
        newsModel.setTitle("this from java client");
        newsModel.setContent("this is ok");
        newsModel.setAuthor("ddc");
        newsModel.setMedia_from("ok ok");
        client.indexNews(newsModel);
        transport.close();
        System.out.println((System.currentTimeMillis()-start));
        System.out.println("client sucess!");
	}

}
