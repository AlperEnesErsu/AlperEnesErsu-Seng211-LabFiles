public class TestPlaylist {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist("My Favorite Songs");

        System.out.println("--- Adding Songs ---");
        myPlaylist.addSong("Bohemian Rhapsody");
        myPlaylist.addSong("Hotel California");
        myPlaylist.addSong("Stairway to Heaven");
        myPlaylist.addSong("Imagine");

        myPlaylist.printSongs();

        int count = myPlaylist.getSongCount();
        System.out.println("Total songs: " + count);

        System.out.println("\n--- Removing 'Hotel California' ---");
        myPlaylist.removeSong("Hotel California");

        myPlaylist.printSongs();
        System.out.println("Total songs after removal: " + myPlaylist.getSongCount());
    }
}