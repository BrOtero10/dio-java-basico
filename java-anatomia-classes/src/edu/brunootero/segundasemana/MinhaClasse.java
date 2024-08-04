package edu.brunootero.segundasemana;
public class MinhaClasse {
    
    public static void main (String [] args) {

        String primeiroNome = "Bruno";
        String segundoNome = "Otero";

        String nomeCompleto = formarNomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String formarNomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}