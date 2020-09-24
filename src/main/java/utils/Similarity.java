package utils;


import domain.Paper;
import org.apache.commons.text.similarity.LevenshteinDetailedDistance;
import org.apache.commons.text.similarity.LevenshteinResults;

public class Similarity {
    private static LevenshteinDetailedDistance LD = LevenshteinDetailedDistance.getDefaultInstance();

    /**
     * 得出两个字符串的相似度
     * @param left
     * @param right
     * @return
     */
    public static Double getSimilarity(String left,String right){
        Integer max = left.length()>right.length()?left.length():right.length();
        LevenshteinResults apply = LD.apply(left, right);
        Integer distance = apply.getDistance();
        return 1-distance*1.0/max;
    }

    /**
     * 得出两篇文章的相似度
     * @param less
     * @param more
     * @return
     */
    public static Double getSimilarity(Paper less, Paper more){
        Double[] ds = new Double[less.getLines()];
        for (int i = 0; i < less.getLines(); i++) {

            double similarity;
            double maxSim = 0.0;

            for (int k = 0; k < 50; k++){
                similarity = getSimilarity(less.getList().get(i),more.getList().get(i+k));
                if (similarity>maxSim) maxSim = similarity;
                if(similarity>0.5){
                    ds[i] = similarity;
                    break;
                } else if(k==49||(i+k)==more.getLines()-1) {
                    ds[i] = maxSim;
                    break;
                }
            }

        }

        double sum = 0.0;
        for (Double d : ds) {
            sum+=d;
        }

        return sum/less.getLines();
    }
}
