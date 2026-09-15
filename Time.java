public class Time{
	public static void main(String[] args){
		int hour=12;
		int minute=34;
		int second=14;
		System.out.println("Seconds since midnight: "+ (hour*3600+minute*60+second));
		System.out.println("Percent of day: "+ ((hour*3600.0+minute*60.0+second)/(24.0*3600)*100)+"%");
		
		int hour2=14;
		int minute2=9;
		int second2=34;
		System.out.println("Seconds since assignment started: "+ ((hour2-hour)*3600+(minute2-minute)*60+second2-second));
		
	}
}
