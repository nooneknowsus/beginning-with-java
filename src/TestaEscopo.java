public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 18;
        int quantidadePessoas = 3;

        //boolean acompanhado = quantidadePessoas >=2;
        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        }

        else {
            acompanhado = false;
        }
    }
}