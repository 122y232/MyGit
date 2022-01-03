package TV;

public class TestTV {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classTV tv1=new classTV();
		tv1.turnon();
		tv1.setchannel(30);
		tv1.setvolume(3);
		
		classTV tv2=new classTV();
		tv2.turnon();
		tv2.channelup();
		tv2.channelup();
		tv2.volumeup();
		System.out.println("tv1's channel is"+tv1.channel+"and volumelevel is"+tv1.volumelevel);
		System.out.println("tv2's channel is"+tv2.channel+"and volumelevel is"+tv2.volumelevel);
	}
}
