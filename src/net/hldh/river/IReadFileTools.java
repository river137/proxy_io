package net.hldh.river;

import java.io.IOException;

/**
 * Created by liuhj on 2015/12/1.
 */
public interface IReadFileTools {
    public String readByBufferReader(String file);
    public void readByDataInputStream(String file) throws Exception;
    public String readByBufferedInputStreamNoArray(String file);
    public void readByBufferedInputStream(String file) throws Exception;
    public void readByChannel(String file) throws Exception;
    public void readByChannelMap(String file) throws Exception;
    public void copyFileByChannel(String file, String file2) throws Exception;
    public void copyFile(String source, String dest) throws Exception;
    public void storingAndRecoveringData(String file) throws Exception;
    public void doCopyFile(String src, String dest) throws IOException;
}
