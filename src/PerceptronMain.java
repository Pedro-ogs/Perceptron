public class PerceptronMain {
    private static double [][][] base = new double[][][]{
            {{0,0},{0}},
            {{0,1},{1}},
            {{1,0},{1}},
            {{1,1},{0}},
    };

    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron(2,1,0.3);
        for (int e = 0; e < 1000; e++){
            double erroEpoca = 0;
            for (int a = 0; a < base.length; a++){
                double[] x = base[a][0];
                double[] y = base[a][1];
                double[] o = perceptron.treinar(x,y);

                double erroAmostra = 0;//valor do somatorio
                for (int i = 0; i< y.length; i++){
                    erroAmostra += Math.abs(y[i] - o[i]);
                }

                erroEpoca += erroAmostra;
            }

            System.out.println("A epoca: " + e + " - erro: " + erroEpoca);
        }
    }

}
