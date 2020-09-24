import domain.Paper;
import org.junit.Test;
import utils.Similarity;

import java.io.IOException;

public class MainTest {
    @Test
    public void test1() throws IOException {
        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig.txt");
        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_add.txt");
        System.out.println(Similarity.getSimilarity(p1, p2));
    }
    @Test
    public void test2() throws IOException {
        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig.txt");
        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_del.txt");
        System.out.println(Similarity.getSimilarity(p1, p2));
    }
    @Test
    public void test3() throws IOException {
        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig.txt");
        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_dis_1.txt");
        System.out.println(Similarity.getSimilarity(p1, p2));
    }
    @Test
    public void test4() throws IOException {
        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig.txt");
        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_dis_10.txt");
        System.out.println(Similarity.getSimilarity(p1, p2));
    }
    @Test
    public void test5() throws IOException {
        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig.txt");
        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_dis_15.txt");
        System.out.println(Similarity.getSimilarity(p1, p2));
    }
//    @Test
//    public void test6() throws IOException {
//        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\jjjjjjjjjjj.txt");
//        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_dis_15.txt");
//        System.out.println(Similarity.getSimilarity(p1, p2));
//    }
    @Test
    public void test7() throws IOException {
        Paper p1 = new Paper("D:\\developer\\compare\\src\\test\\txt\\1.txt");
        Paper p2 = new Paper("D:\\developer\\compare\\src\\test\\txt\\orig_0.8_dis_15.txt");
        System.out.println(Similarity.getSimilarity(p1, p2));
    }
}
