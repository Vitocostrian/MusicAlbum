//MusicAlbum.java

package com.gmail.vmableka;
public class MusicAlbum
{
	private String trackTitle;
	private String artistName;
	private int  numberOfTracks;
	private String trackNames;
	private Double duration;
	
	//Constructor 
	public MusicAlbum(String title, String artName, int numOfTracks, String trNames, double dur){
		trackTitle = title;
		artistName = artName;
		numberOfTracks = numOfTracks;
		trackNames = trNames;
		duration = dur; 
	}

	//Setters
	public void setTrackTitle(String tt){
		trackTitle = tt;
	}
	public void setArtistName(String artN){
		artistName = artN;
	}
	public void setNumOfTracks(int num){
		numberOfTracks = num;
	}
	public void setTrackNames(String trName){
		trackNames = trName;
	}
	public void setTrackDuration(double dura){
		duration = dura;
	}
	
	//Getters
	public String getTrackTitle(){
		return trackTitle;
	}
	public String getArtistName(){
		return artistName;
	}
	public int getNumOfTracks(){
		return numberOfTracks;
	}
	public String getTrackNames(){
		return trackNames;
	}
	public double getTrackDuration(){
		return duration;
	}

	@Override 
	public String toString(){
		return "\nTitle Of the Album: "+getTrackTitle()+"\nName Of Artist:"+getArtistName()+"\nNumber Of Tracks: "+getNumOfTracks()+"\nTrack Name: "+getTrackNames()+"\nTrack Duration: "+getTrackDuration();
	}
}
