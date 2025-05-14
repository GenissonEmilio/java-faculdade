import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodigoVisitante {
    private String codigo;
    private boolean usado;

    public CodigoVisitante(String codigo) {
        if (this.isValido(codigo)) {
            this.setCodigo(codigo);
        }
    }

    //Atualiza o estado do codigo para usado
    public void usar() {
        this.setUsado(true);
    }

    //Verifica a validade do codigo usando regex
    public boolean isValido(String codigo) {
        String padrão = "^VIS-[A-Z]{3}([0-9]{4})-([0-9])$";
        Pattern pattern = Pattern.compile(padrão);
        Matcher matcher = pattern.matcher(codigo);

        //Verifica se o codigo/digito verificador se estão seguindo o padrão
        if (matcher.matches()) {
            //Pega os 4 digitos e o digito verificador
            String numeros = matcher.group(1);
            String digitoVerificador = matcher.group(2);

            //Soma dos 4 digitos
            int soma = 0;
            for (char caractere : numeros.toCharArray()) {
                soma += Character.getNumericValue(caractere);
            }

            //Pega o valor esperado que segue as regras e o valor real no codigo
            int valorEsperado = soma % 10;
            int valorReal = Integer.parseInt(digitoVerificador);

            if (valorEsperado == valorReal) {
                return true;
            } else {
                System.out.println("Código invalido! Digito verificador deveria ser: " + valorEsperado);
                return false;
            }

        } else {
            System.out.println("Formato inválido");
            return false;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}
