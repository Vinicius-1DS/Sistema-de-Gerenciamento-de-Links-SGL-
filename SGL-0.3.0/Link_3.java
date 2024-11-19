public class Link_3 {
    private String url;
    private String descricao;
    private String assunto;

    public Link_3(String url, String descricao, String assunto) {
        this.url = url;
        this.descricao = descricao;
        this.assunto = assunto;
    }

    public String getUrl() {
        return url;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAssunto() {
        return assunto;
    }

    @Override
    public String toString() {
        return "Assunto: " + assunto + "\nDescrição: " + descricao + "\nURL: " + url;
    }
}
