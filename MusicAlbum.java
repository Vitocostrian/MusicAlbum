//MusicAlbum.java
/*
A class for any Music Album, which has the attributes title, artist name, the number o f tracks in th ealbum and,
the track names and the number of minutes the track plays

*/
package com.gmail.vmableka;
/**
	@author : Vuyolwethu Mabhuleka
	@version : 1.0
*/
public class MusicAlbum
{
	private String trackTitle;
	private String artistName;
	private int  numberOfTracks;
	private String trackNames;
	private Double duration;
	
	//Constructor
	/**
		@param title a <code> String </code> for the track title
		@param artName a <code> String </code> for the name of artist
		@param numOfTracks a <code> int </code> for the number of tracks
		@param trNames a <code> String </code> for the name of tracks
		@param dur a <code> Double </code> for the duration of track
	*/
		public MusicAlbum(String title, String artName, int numOfTracks, String trNames, double dur){
		trackTitle = title;
		artistName = artName;
		numberOfTracks = numOfTracks;
		trackNames = trNames;
		duration = dur; 
	}

	//Setters
	/**
		@param tt a <code> String </code> to set title of track
	*/
	public void setTrackTitle(String tt){
		trackTitle = tt;
	}
	/**
		@param artN a <code> String </code> to set the name of artist
	*/
	public void setArtistName(String artN){
		artistName = artN;
	}
	/**
		@param num a <code> int </code> to set the number of track
	*/
	public void setNumOfTracks(int num){
		numberOfTracks = num;
	}
	/**
		@param trName a <code> String </code> to set the names of track
	*/
	public void setTrackNames(String trName){
		trackNames = trName;
	}
	/**
		@param dura a <code> Double </code> to set duration of the track
	*/
	public void setTrackDuration(double dura){
		duration = dura;
	}
	
	//Getters
	/**
		@return the title of the album
	*/
	public String getTrackTitle(){
		return trackTitle;
	}
	/**
		@return a <code> String </code> with the name of the artist
	*/
	public String getArtistName(){
		return artistName;
	}
	/**
		@return an <code> Int </code> with the number of tracks 
	*/
	public int getNumOfTracks(){
		return numberOfTracks;
	}
	/**
		@return a <code> String </code> with the name of the track
	*/
	public String getTrackNames(){
		return trackNames;
	}
	/**
		@return a <code> Double </code> with the duration of the track
	*/
	public double getTrackDuration(){
		return duration;
	}
	/**
		@return a <code> String </code> with all the album properties
	*/
	@Override // annotation
	public String toString(){
		return "\nTitle Of the Album: "+getTrackTitle()+"\nName Of Artist:"+getArtistName()+"\nNumber Of Tracks: "+getNumOfTracks()+"\nTrack Name: "+getTrackNames()+"\nTrack Duration: "+getTrackDuration();
	}
}//END
