package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks= new ArrayList<>();
//các hàm khởi tạo
	public CompactDisc() {
		super();
	}

	public CompactDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
	}

	public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public CompactDisc(String title, String director, int length) {
		super(title, director, length);
	}

	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}

	public CompactDisc(String title) {
		super(title);
	}


	//getter
	public String getArtist() {
		return artist;
	}
	//check Track 
	public boolean equals(Track track) {
		for (Track i : tracks) {
			if ((i.getTitle()).equals(track.getTitle())&&(i.getLength())==(track.getLength())) {
				return true;
			}
		}
		return false;
	}
	//add
		public void addTrack(Track track) {
			if (!equals(track)) {
				tracks.add(track);
				System.out.println("add track successfully");
				return;
			}
			System.out.println("track already exist");
		}
	//remove
		public void removeTrack(Track track) {
			if (equals(track)) {
				tracks.remove(track);
				System.out.println("remove track successfully");
				return;
			}
			System.out.println("track not exist");
		}
 @Override
public int getLength() {
	 int sumLength=0;
	 for(Track i : tracks) {
		 sumLength+=i.getLength();
	 }
	 return sumLength;
 }
 //play()
 @Override
public void play() {
	    System.out.println("CD artist: " + this.getArtist());
	    for (Track track : tracks) {
	        track.play();
	    }
	}

}