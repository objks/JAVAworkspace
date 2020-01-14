package net1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {
	private ServerSocket server = null;
	  
	  public TCPEchoServer(int port) {
	    //수신한 포트번호로 서버 소켓을 생성한다.
	    try {
	      server = new ServerSocket(port);
	    }catch(IOException ioe) {
	      ioe.printStackTrace();
	    }
	  }
	  
	  public void process() {
	    //루프를 반복하며 클라이언트로부터의 요청을 처리한다.
	    while(true) {
	      try {
	        //서버소켓을 accept메서드를 이용해 클라이언트의
	        //접속 요청이 있을 때까지 대기한다.
	        //클라이언트의 연결이 발생하면 클라이언트와 통신을 위한
	        //소켓을 반환한다.
	        Socket con = server.accept();
	        
	        //소켓을 통해 데이터를 읽고 쓰기위한 스트림 객체를 생성한다.
	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        bis = new BufferedInputStream(con.getInputStream());
	        bos = new BufferedOutputStream(con.getOutputStream());
	        
	        String str = "";
	        //클라이언트로 부터 수신한 데이터를 저장하기위한 byte배열
	        byte buf[] = new byte[256];
	        //수신한 데이터의 길이를 저장하기위한 int형 변수
	        int len = 0;
	        
	        //입력 스트림에서 읽어들인 데이터의 길이가 -1이 아닌 동안 반복한다.
	        while((len=bis.read(buf,0,buf.length))!=-1) {
	          //읽어들인 데이터를 화면에 출력하고 출력 스트림 객체를 통해
	          //클라이언트로 전송한다.
	          str = str + new String(buf,0,len);
	          bos.write(buf, 0,len);
	          bos.flush();
	          
	          //일어들인 데이터에 메시지의 끝을 알리는 문자(\n)가 있다면
	          //더이상 데이터를 읽지 않는다.
	          if(str.indexOf("\n")!=-1);
	            break;
	        }
	        System.out.print("수신한 메시지 : "+str);
	        
	        //스트림 객체와 소켓을 닫는다.
	        bos.close();
	        bis.close();
	        con.close();
	      }catch(IOException ioe) {
	        ioe.printStackTrace();
	      }
	    }
	  }

	  public static void main(String args[]) {
	    //서버 소켓이 사용할 포트번호를 파라메터로 받았는지 검사한다.
	    if(args.length!=1) {
	      System.out.println("파라메터 : <포트번호>");
	      System.exit(0);
	    }
	    
	    //파라메터로 받은 포트번호를 int형으로 변환한다.
	    int port = Integer.parseInt(args[0]);
	    
	    TCPEchoServer server = new TCPEchoServer(port);
	    server.process();
	  }
	}