package chap06_inheritance_01;

abstract class MessageSender{
	String title;
	String senderName;
	
	MessageSender(String title,String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	void sendMessage(String recipient) {
		System.out.println("------------------------");
		System.out.println("제목 : "+ title);
	}
}

class EmailSender extends MessageSender{
	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName,String senderAddr,String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		super.sendMessage(recipient);
		System.out.println("보내는 사람:"+senderName+" "+senderAddr);
		System.out.println("받는 사람:" +recipient);
		System.out.println("내용:"+emailBody);
		
	}
}

class SMSSender extends MessageSender{
	
	String returnPhoneNo;
	String message;
	
	SMSSender(String title, String senderName,String returnPhoneNo,String message) {
		super(title, senderName);
		this.returnPhoneNo =returnPhoneNo;
		this.message =message;
	
	}
}

public class InheritanceExample_02 {

	public static void main(String[] args) {
		EmailSender obj = new EmailSender("생일을 축하합니다","고객센터","admin@dukeeshop.co.kr","10%쿠폰 발행 되었다");
		obj.sendMessage("이지히잉");
	}

}
