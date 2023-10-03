public class Main {
    public static void main(String[] args) {
        int[][] orjinalMatris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int satirSayisi = orjinalMatris.length;
        int sutunSayisi = orjinalMatris[0].length;

        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = orjinalMatris[i][j];
            }
        }

        System.out.println("Orjinal Matris:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(orjinalMatris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoz Matris:");
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}