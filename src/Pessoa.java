public abstract class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nSexo: " + this.getSexo();
    }
}
