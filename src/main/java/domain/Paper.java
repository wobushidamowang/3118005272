package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Paper {
    private ArrayList<String> list;
    private Integer lines;

    public Paper(String pathname) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(pathname));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.list = new ArrayList<>();
        //读取每一行，忽略空格和空行
        String line;
        while ((line=reader.readLine())!=null){
            if(line.isEmpty()) continue;
            else line = line.replace(" ","");
            this.list.add(line);
        }
        this.lines = list.size();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }
}
