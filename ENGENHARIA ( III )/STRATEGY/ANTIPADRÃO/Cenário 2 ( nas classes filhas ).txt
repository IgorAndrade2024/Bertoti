public class Cliente {
    protected String nome;
    protected String identificador;
    protected double saldo;

    public Cliente(String nome, String identificador, double saldo) {
        this.nome = nome;
        this.identificador = identificador;
        this.saldo = saldo;
    }
}

public class ClienteComum extends Cliente {
    public ClienteComum(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
}

public class Empresa extends Cliente {
    public Empresa(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
    public void emprestimo(double valor) {
    }
}

public class Aposentado extends Cliente {
    public Aposentado(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
    public void emprestimo(double valor) {
    }
}

public class Estudante extends Cliente {
    public Estudante(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
}