/*
 * my blog: http://www.micmiu.com
 * mydemo.x -- demonstrates and tests some jrpcgen features.
 * To compile, use
 *   java -jar jrpcgen.jar -p com.micmiu -nobackup MyRPCDemo.x
 */

program RPC_ONC_DEMO {
	version DEMO_FIRST_VERSION {
		string SayHello(string) = 1;/* 这是过程号 */
	} = 1;/* 这是程序号 */
} = 0x20000001;/* 这是版本号 */

/* End of file MyRPCDemo.x */