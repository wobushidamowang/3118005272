import domain.Paper;
import utils.Similarity;

import java.io.FileWriter;
import java.io.IOException;


public class Test {
    public static void main(String[] args) throws IOException {

        Paper paper1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig.txt");
        Paper paper2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_add.txt");
        Paper less;
        Paper more;
        if(paper1.getLines()<paper2.getLines()){
            less = paper1;
            more = paper2;
        } else {
            less = paper2;
            more = paper1;
        }

        //较短那篇文章比较较长的那篇文章
        FileWriter writer = new FileWriter("D:\\developer\\compare\\src\\test\\txt\\result.txt");
        writer.write(Similarity.getSimilarity(less, more).toString());
        writer.close();
    }
}
