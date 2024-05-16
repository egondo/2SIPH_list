import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMensagem {

    private List<Mensagem> mensagens;

    public RepositorioMensagem() {
        this.mensagens = new ArrayList<>();
        carregamentoMensagens(mensagens);
    }

    private void carregamentoMensagens(List<Mensagem> dados) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:/dados.csv"));
            String linha = br.readLine(); //cabecalho
            linha = br.readLine();
            while (linha != null) {
                String[] campos = linha.split(";");

                Mensagem m = new Mensagem();
                m.setAssunto(campos[0]);
                m.setConteudo(campos[1]);
                m.setDestinatario(campos[2]);
                m.setRemetente(campos[3]);
                dados.add(m);

                linha = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}









