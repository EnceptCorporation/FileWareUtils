package arabware.file.listeners;

import java.util.ArrayList;

public interface CopyTask {
     void done();

     void progress(String file);

     void error(ArrayList<String> e);
}
