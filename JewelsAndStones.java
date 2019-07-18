package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aAb", "caсAcA"));
    }

    public static String numJewelsInStones(String jewels, String stones) {
        char[] arrJewels = jewels.toCharArray();
        char[] arrStones = stones.toCharArray();
        int countJewels = 0;
        for (int i = 0; i < arrJewels.length; i++){
            for(int j = 0; j < arrStones.length; j++) {
                if(arrJewels[i] == arrStones[j]){ 
                    countJewels++;
                }
            }
        }
        return Integer.toString(countJewels);
    }
}
