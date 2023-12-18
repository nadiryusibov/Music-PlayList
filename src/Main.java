import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Music Playlist
        Scanner scanner = new Scanner(System.in);
        MusicService musicService = new MusicService();
        System.out.println("-----------------------");
        System.out.println("Music Playlist");
        System.out.println("-----------------------");
        try {
            while (true){
                System.out.println("1 Add Music");
                System.out.println("2 Display Music");
                System.out.println("3 Delete Music");
                System.out.println("4 Exit the Program");
                int choice = scanner.nextInt();
                if (choice == 1){
                    System.out.println("Enter the music id");
                    int musicId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the music name");
                    String musicName = scanner.nextLine();
                    System.out.println("Enter the music singer");
                    String musicSinger = scanner.nextLine();
                    musicService.addMusic(musicId,musicName,musicSinger);
                } else if (choice == 2) {
                    musicService.displayMusic();
                } else if (choice == 3) {
                    System.out.println("Enter the music id");
                    int musicId = scanner.nextInt();
                    musicService.deleteMusic(musicId);
                } else if (choice == 4) {
                    System.exit(0);
                    scanner.close();
                }else {
                    System.out.println("You chose wrong");
                }
            }
        }catch (Exception e){
            System.out.println("You can not write in letters ");
        }

    }
}