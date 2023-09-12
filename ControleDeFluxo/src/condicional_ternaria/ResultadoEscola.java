package condicional_ternaria;

// Cenário 1
public class ResultadoEscola {
    public static void main(String[] args) {
        int nota = 3 ;
        String resultado = nota >= 7 ? "Aprovado": nota < 7 && nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
