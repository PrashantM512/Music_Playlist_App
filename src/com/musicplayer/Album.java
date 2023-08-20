package com.musicplayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album  {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String title,String artist ) {
		this.name=title;
		this.artist=artist;
		this.songs=new ArrayList<Song>();
	}
	
	public Song findSong(String title) {
		
		for(Song checkedsong: songs) {
			if(checkedsong.getTitle().equals(checkedsong)) {
				return checkedsong;
			}
		}
		return null;
		
	}
	public boolean addSong(String title,double duration) {
		if(findSong(title)==null) {
			songs.add(new Song(title,duration));
			System.out.println("The song with title "+title+" is added !!!");
			return true;
		}else {
			System.out.println("The song with title "+title+" is Already exists !!!");
			return false;
		}
	}
	public boolean addToPlaylist(int trackNumber,LinkedList<Song> PlayList) {
		int index=trackNumber-1;
		if(index>0 && index<=this.songs.size() ) {
			PlayList.add(this.songs.get(index));
			return true;
		}
		System.out.println("does not have song with tracknumber "+trackNumber);
		return false;
	}
	public boolean addToPlaylist(String title,LinkedList<Song> PlayList) {
		for(Song checkedSong:this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				PlayList.add(checkedSong);
				return true;
			}
		}
		System.out.println("There is no such song with title "+title);
		return false;
	}

}
