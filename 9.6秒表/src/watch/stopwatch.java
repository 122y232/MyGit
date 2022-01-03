package watch;

public class stopwatch {
	private long starttime,endtime;
	public void stopwatch() {
		starttime=System.currentTimeMillis();
	}
	public void stop() {
		this.endtime=System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return this.endtime-this.starttime;
	}
}
