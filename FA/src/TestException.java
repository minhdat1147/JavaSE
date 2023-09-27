import java.io.FileNotFoundException;

public class TestException {
    public void readBook(String file) throws FileNotFoundException{
        boolean found = findFile(file);
        if(!found) throw new FileNotFoundException("Missing file");
        else{

        }
    }
    public boolean findFile(String file){
        return true;
    }

}
