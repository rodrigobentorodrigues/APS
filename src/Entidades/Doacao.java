
package Entidades;

import java.util.Objects;

public class Doacao {
    
    private String cpf;
    private String nome;
    private String tipoSanguineo;
    private String data;
    private String hora;
    private String id;

    public Doacao(String cpf, String nome, String tipoSanguineo, String data, String hora) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.data = data;
        this.hora = hora;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.cpf);
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.tipoSanguineo);
        hash = 23 * hash + Objects.hashCode(this.data);
        hash = 23 * hash + Objects.hashCode(this.hora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
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
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doacao{" + "cpf=" + cpf + ", nome=" + nome + ", tipoSanguineo=" + tipoSanguineo + ", data=" + data + ", hora=" + hora + '}';
    }
    
}
