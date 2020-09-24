import domain.Paper;
import utils.Similarity;

import java.io.FileWriter;
import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException {

        Paper paper1 = new Paper(args[0]);
        Paper paper2 = new Paper(args[1]);

        //较短那篇文章比较较长的那篇文章
        FileWriter writer = new FileWriter(args[2]);
        writer.write(Similarity.getSimilarity(paper1, paper2).toString());
        writer.close();
    }
}
