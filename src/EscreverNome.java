public class EscreverNome {
    public static void main(String[] args) {

        System.out.println("Olá, meu nome é\n");

        char[][] arrM = letraM();
        escrever(arrM);

        char[][] arrU = letraU();
        escrever(arrU);

        char[][] arrR = letraR();
        escrever(arrR);

        char[][] arrI = letraI();
        escrever(arrI);

        char[][] arrL = letraL();
        escrever(arrL);

        char[][] arrO = letraO();
        escrever(arrO);

    }

    public static char[][] letraM() {
        char[][] arr = {
                {'M', ' ', ' ', ' ', 'M'},
                {'M', 'M', ' ', 'M', 'M'},
                {'M', ' ', 'M', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
                {'M', ' ', ' ', ' ', 'M'},
                {' ', ' ', ' ', ' ', ' '},

        };
        return arr;
    }

    public static char[][] letraU() {
        char[][] arr = {
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', ' ', ' ', ' ', 'U'},
                {'U', 'U', 'U', 'U', 'U'},
                {' ', ' ', ' ', ' ', ' '},

        };
        return arr;
    }

    public static char[][] letraR() {
        char[][] arr = {
                {'R', 'R', 'R', 'R', 'R'},
                {'R', ' ', ' ', ' ', 'R'},
                {'R', 'R', 'R', 'R', 'R'},
                {'R', ' ', ' ', 'R', ' '},
                {'R', ' ', ' ', ' ', 'R'},
                {' ', ' ', ' ', ' ', ' '},

        };
        return arr;
    }

    public static char[][] letraI() {
        char[][] arr = {
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},

        };
        return arr;
    }

    public static char[][] letraL() {
        char[][] arr = {
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', ' ', ' ', ' ', ' '},
                {'L', 'L', 'L', 'L', 'L'},
                {' ', ' ', ' ', ' ', ' '},

        };
        return arr;
    }

    public static char[][] letraO() {
        char[][] arr = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {' ', ' ', ' ', ' ', ' '},

        };
        return arr;
    }


    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
