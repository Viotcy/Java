package ch03hw;

public class TimeCaculation {

	public static void main(String[] args) {
		int totalsec = 256559; // 共有256559秒
		int days = 256559 / 86400; // 計算有幾天
		int hours = (256559 % 86400) / 1440;// 計算有幾小時
		int mins = ((256559 % 86400) % 1440) / 60;// 計算有幾分
		int secs = (((256559 % 86400) % 1440) % 60);// 計算有幾秒

		System.out.println("256559秒=" + days + "天" + hours + "小時" + mins + "分" + secs + "秒");

	}

}
