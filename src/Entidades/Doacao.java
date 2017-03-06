
package Entidades;

import java.util.Objects;

public class Doacao {
    
    private String cpf;
    private String nome;
    private String tipoSanguineo;
    private String data;

    public Doacao(String cpf, String nome, String tipoSanguineo, String data) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.data = data;
    }
    
    public Doacao(){};

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.tipoSanguineo);
        hash = 97 * hash + Objects.hashCode(this.data);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doacao other = (Doacao) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoSanguineo, other.tipoSanguineo)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doacao{" + "cpf=" + cpf + ", nome=" + nome + ", tipoSanguineo=" + tipoSanguineo + ", data=" + data + '}';
    }
    
    
    
}
