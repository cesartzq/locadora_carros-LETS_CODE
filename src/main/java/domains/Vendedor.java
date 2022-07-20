package domains;

public class Vendedor {

    public Vendedor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vendedor)) return false;

        Vendedor vendedor = (Vendedor) o;

        if (nome != null ? !nome.equals(vendedor.nome) : vendedor.nome != null) return false;
        return email != null ? email.equals(vendedor.email) : vendedor.email == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
