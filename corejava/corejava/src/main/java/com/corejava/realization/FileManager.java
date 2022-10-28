package com.corejava.realization;

public interface FileManager {
    public void init(String fileLoc);
    public void readFile(int start, int end, boolean flag);
}
