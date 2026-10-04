import java.util.Stack;

public class InverterPalavrasPilha {
    public static void main(String[] args) {
        String frase1 = "UM CIENTISTA DA COMPUTAÇAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado1 = inverterLetrasDasPalavras(frase1);

        String frase2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        String resultado2 = inverterLetrasDasPalavras(frase2);
        
        System.out.println("Original 1: "+frase1);
        System.out.println("Invertido: "+resultado1);

        System.out.println("Original 2: "+frase2);
        System.out.println("Resultdado 2: "+resultado2);
    }

    public static String inverterLetrasDasPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();

            for (int i = 0; i < palavra.length(); i++) {
                pilha.push(palavra.charAt(i));
            }

            while (!pilha.isEmpty()) {
                fraseInvertida.append(pilha.pop());
            }

            fraseInvertida.append(" ");
        }

        return fraseInvertida.toString().trim();
    }
}
