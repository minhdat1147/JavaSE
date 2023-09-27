package fa.training.entities;

import java.util.Scanner;

public class Song extends Multimedia {
    private String singer;
    public Song(){
        super();
    }

    public Song(String singer) {
        super();
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
    public void createSong(){
        super.createMutimedia();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter singer");
        setSinger(scanner.nextLine());
    }
    @Override
    public String toString() {
        return super.toString()+"Song{" +
                "singer='" + singer + '\'' +
                '}';
    }
}
