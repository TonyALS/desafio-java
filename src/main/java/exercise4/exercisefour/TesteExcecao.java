package exercise4.exercisefour;

class MinhaExcecao extends Exception {

    public static String excecao() {
        try {
            return "No error";
        } catch (Exception e) {
            e.printStackTrace();
            return "Exceção";
        }
    }
}

public class TesteExcecao {

    //  teste() está "arremessando" o erro para que a classe que o invocar trate-o:
    public static void teste() throws Exception {
        throw new MinhaExcecao();
    }

    public static void main(String[] args) {
        MinhaExcecao me = new MinhaExcecao();
        try {
            System.out.println("try ");
            teste();
        } catch (MinhaExcecao e) {
            System.out.println("catch ");
            me = e;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally ");
            try {
                throw new MinhaExcecao();
            } catch (MinhaExcecao minhaExcecao) {
                minhaExcecao.printStackTrace();
            }
        }
        System.out.println("fim");
    }
}
