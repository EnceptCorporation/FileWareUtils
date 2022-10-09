package arabware.file.listeners;

import java.util.ArrayList;

public interface DeleteTask {
    void done();

    void progress(String file);

    void error(ArrayList<String> message);
}
