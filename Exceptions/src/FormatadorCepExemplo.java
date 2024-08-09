public class FormatadorCepExemplo {
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }

        // Exemplo de cep formatado
        return "05.158-040";
    }
}
