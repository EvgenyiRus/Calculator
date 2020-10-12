package IO;

import java.io.IOException;

public interface IData {
    String[] readData() throws IOException;

    void printResult(Object outputData);
}
