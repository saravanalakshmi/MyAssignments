package week1.day1;

public class Mobile {
public void sendSMS() {
System.out.println("send me some sms");
}
protected void allowVoiceCall() {
System.out.println("allow voice call");
}
private void takeVideo() {
System.out.println("takevideo");
}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.allowVoiceCall();
		mob.sendSMS();
		mob.takeVideo();
		
	}

}
