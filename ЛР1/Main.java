public class Main{
    public static void main(String[] args){
        long[] s = new long[14];
        int k = 0;
        for (int i = 6; i<=19; i++){
            s[k] = i;
            k++;
        }
        float[] x = new float[15];
        for (int i=0; i<15; i++){
            x[i] = (float)(Math.random() * (11 + 6)) - 6;
        }
        double[][] s1 = new double[14][15];
        for (int i = 0; i<14; i++){
            switch ((int)s[i]) {
                case 17:
                    for (int j = 0; j<15; j++){
                        s1[i][j] = (float)(Math.asin((float)2/3 * 0.2 * (float)(x[0]+2.5)/17));
                    }
                    break;
                case 9, 11, 12, 14, 15, 16, 18:
                    for (int j = 0; j<15; j++){
                        s1[i][j] = (float)(Math.pow(Math.asin((float)(x[j]+2.5)/17), (float)1/3) * ((float)1/2 - Math.pow(Math.tan(x[j]), (float)1/3)));
                    }
                    break;
                case 6, 7, 8, 10, 13, 19:
                    for (int j = 0; j<15; j++){
                        s1[i][j] = (float)(Math.log(Math.pow(Math.sin(Math.pow(Math.E, (float)x[j]/9)), 2)));
                    }
                    break;
            }
        }
        for (int i =0; i<14; i++){
            for (int j=0; j<15; j++) {
                System.out.print((float)Math.round(s1[i][j]*10000)/10000 + ", ");
            }
            System.out.println();
        }
    }
}