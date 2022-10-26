package chapter03;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
		
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack("3번 Track");
		song.setComposer("이민수 작곡");

		song.show();
		
		Song song2 = new Song("Love Dive", "IVE", "Love Dive", "Jamie Parker외 3명", 2022, "1번 track");
		song2.show();

		Song song3 = new Song("사건의 지평선", "윤하");
		song3.show();
		
	}

}
