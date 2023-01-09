import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o tamanho da sua pirâmide?");
        int tamanho = s.nextInt();
        s.close();

        for (int i = 0; i <= tamanho; i++) {
            StringBuilder linha = new StringBuilder();
            for (int j = 0; j < i; j++) {
                linha.append(i);
            }
            System.out.println(linha);
        }
    }
}
