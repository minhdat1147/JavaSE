package fa.training.management;

import fa.training.entities.Multimedia;
import fa.training.entities.Song;
import fa.training.entities.Video;

import java.util.ArrayList;

public class MultimediaManagement {
    private ArrayList<Multimedia> listOfMultimedia;

    public MultimediaManagement() {
        this.listOfMultimedia = new ArrayList<Multimedia>();
    }

    public MultimediaManagement(ArrayList<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;

    }

    public ArrayList<Multimedia> getListOfMultimedia() {
        return listOfMultimedia;
    }

    public void setListOfMultimedia(ArrayList<Multimedia> listOfMultimedia) {
        this.listOfMultimedia = listOfMultimedia;
    }

    public void display(){
        if(this.listOfMultimedia.size()<1){
            return;
        }
        System.out.println("--------LIST OF MULTIMEDIA-----------");
        for (Multimedia multimedia: this.listOfMultimedia
             ) {
            System.out.println(multimedia);
        }
    }
    public void addSong(){
        Multimedia songMultimedia = new Song();
        ((Song) songMultimedia).createSong();
        listOfMultimedia.add(songMultimedia);
    }
    public void addVideo(){
        Multimedia video = new Video();
        ((Video)video).createVideo();
        listOfMultimedia.add(video);
    }
}
