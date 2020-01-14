package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server = null;
	  
	  public TCPEchoServer(int port) {
	    //������ ��Ʈ��ȣ�� ���� ������ �����Ѵ�.
	    try {
	      server = new ServerSocket(port);
	    }catch(IOException ioe) {
	      ioe.printStackTrace();
	    }
	  }
	  
	  public void process() {
	    //������ �ݺ��ϸ� Ŭ���̾�Ʈ�κ����� ��û�� ó���Ѵ�.
	    while(true) {
	      try {
	        //���������� accept�޼��带 �̿��� Ŭ���̾�Ʈ��
	        //���� ��û�� ���� ������ ����Ѵ�.
	        //Ŭ���̾�Ʈ�� ������ �߻��ϸ� Ŭ���̾�Ʈ�� ����� ����
	        //������ ��ȯ�Ѵ�.
	        Socket con = server.accept();
	        
	        //������ ���� �����͸� �а� �������� ��Ʈ�� ��ü�� �����Ѵ�.
	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        bis = new BufferedInputStream(con.getInputStream());
	        bos = new BufferedOutputStream(con.getOutputStream());
	        
	        String str = "";
	        //Ŭ���̾�Ʈ�� ���� ������ �����͸� �����ϱ����� byte�迭
	        byte buf[] = new byte[256];
	        //������ �������� ���̸� �����ϱ����� int�� ����
	        int len = 0;
	        
	        //�Է� ��Ʈ������ �о���� �������� ���̰� -1�� �ƴ� ���� �ݺ��Ѵ�.
	        while((len=bis.read(buf,0,buf.length))!=-1) {
	          //�о���� �����͸� ȭ�鿡 ����ϰ� ��� ��Ʈ�� ��ü�� ����
	          //Ŭ���̾�Ʈ�� �����Ѵ�.
	          str = str + new String(buf,0,len);
	          bos.write(buf, 0,len);
	          bos.flush();
	          
	          //�Ͼ���� �����Ϳ� �޽����� ���� �˸��� ����(\n)�� �ִٸ�
	          //���̻� �����͸� ���� �ʴ´�.
	          if(str.indexOf("\n")!=-1);
	            break;
	        }
	        System.out.print("������ �޽��� : "+str);
	        
	        //��Ʈ�� ��ü�� ������ �ݴ´�.
	        bos.close();
	        bis.close();
	        con.close();
	      }catch(IOException ioe) {
	        ioe.printStackTrace();
	      }
	    }
	  }

	  public static void main(String args[]) {
	    //���� ������ ����� ��Ʈ��ȣ�� �Ķ���ͷ� �޾Ҵ��� �˻��Ѵ�.
	    if(args.length!=1) {
	      System.out.println("�Ķ���� : <��Ʈ��ȣ>");
	      System.exit(0);
	    }
	    
	    //�Ķ���ͷ� ���� ��Ʈ��ȣ�� int������ ��ȯ�Ѵ�.
	    int port = Integer.parseInt(args[0]);
	    
	    TCPEchoServer server = new TCPEchoServer(port);
	    server.process();
	  }
	}