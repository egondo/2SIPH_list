import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioMensagem rm = new RepositorioMensagem();
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1 - visualiza msg");
            System.out.println("2 - nova msg");
            System.out.print("Escolha: ");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                    List<Mensagem> msgs = rm.getMensagens();
                    for(Mensagem m : msgs) {
                        System.out.println(m);
                    }
                    break;
                case 2:
                    Mensagem m = criaMensagem(tec);
                    rm.addMensagem(m);
                    break;
            }
        }

    }

    private static Mensagem criaMensagem(Scanner tec) {
        System.out.print("Assunto: ");

        String assunto = tec.next() + tec.nextLine();

        System.out.print("Conteúdo: ");
        String conteudo = tec.nextLine();
        System.out.print("destinatário: ");
        String destinatario = tec.nextLine();
        Mensagem msg = new Mensagem();
        msg.setAssunto(assunto);
        msg.setConteudo(conteudo);
        msg.setDestinatario(destinatario);
        msg.setRemetente("profeduardo@fiap.com.br");
        return msg;
    }
}



