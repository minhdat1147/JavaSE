package fa.training.entities;

public class Video extends Multimedia{
    public Video(){
        super();
    }
    public void createVideo(){
        super.createMutimedia();
    }
    @Override
    public String toString() {
        return "Video{"+super.toString()+"}";
    }
}
