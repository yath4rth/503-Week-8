public class Album extends Media{
	private String[] tracks;
	public String[] getTracks()
	{
		return tracks;
	}
	public Album(String title,String[] tracks) {
		super(title);
		this.tracks =  tracks;
	}
	public String toString() {
		return super.toString()+"\ntracks = "+String.join(" ",tracks);
		
	}
}