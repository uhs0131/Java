package cheat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
	    UdpReceiverThread urt = new UdpReceiverThread();
	    urt.start();
	    
	    UdpSenderThread ust = new UdpSenderThread();
	    ust.start();
	}
	
	
	public static class UdpSenderThread extends Thread {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			// super.run();
			Scanner scan = new Scanner(System.in);
			
			try {
				DatagramSocket socket = new DatagramSocket();
				
				while(true) {
					String msg = "Inho"+scan.nextLine();
					//System.out.println(msg);
					
					byte[] buf = msg.getBytes();
					DatagramPacket packet = new DatagramPacket(buf, buf.length
							, InetAddress.getByName("192.168.56.1"), 3000);
					//DatagramPacket packet = new DatagramPacket(buf, buf.length
					//		, InetAddress.getByName(""), 3000);
					socket.send(packet);
				}
				
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class UdpReceiverThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				DatagramSocket socket = new DatagramSocket(3000);
				
				while(true) {
					byte[] buf = new byte[512];
					DatagramPacket packet = new DatagramPacket(buf, buf.length);
					
					socket.receive(packet);
					
					System.out.println(packet.getAddress() + new String(buf).trim());
					
				}
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


