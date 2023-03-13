package co.edu.unbosque.prueba;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{

	@Override
	public void run() {

		ServerSocket server = null;
		try {
			server = new ServerSocket(4444);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in");
		Socket cliente;

		try {
			while((cliente = server.accept())!=null) {
				System.out.println("Server");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


