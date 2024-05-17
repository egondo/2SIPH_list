import java.time.LocalDateTime;

public class Mensagem {

    private String assunto;
    private String conteudo;
    private String remetente;
    private String destinatario;
    private LocalDateTime data;

    public Mensagem() {
        this.data = LocalDateTime.now();
        this.remetente = "Eduardo Gondo";
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "assunto='" + assunto + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", remetente='" + remetente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", data=" + data +
                '}';
    }
}
