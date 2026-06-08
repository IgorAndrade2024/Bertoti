public class Cliente {
    protected String nome;
    protected String identificador;
    protected double saldo;

    public Cliente(String nome, String identificador, double saldo) {
        this.nome = nome;
        this.identificador = identificador;
        this.saldo = saldo;
    }
    public double emprestimo(double valor) {
        return valor;
    }
}

public class ClienteComum extends Cliente {
    public ClienteComum(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
    @Override
    public double emprestimo(double valor) {
        return valor * 1.10;
    }
}

public class Empresa extends Cliente {
    public Empresa(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
    @Override
    public double emprestimo(double valor) {
        return valor * 1.08;
    }
}

public class Aposentado extends Cliente {
    public Aposentado(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
    @Override
    public double emprestimo(double valor) {
        return valor * 1.05;
    }
}

public class Estudante extends Cliente {
    public Estudante(String nome, String identificador, double saldo) {
        super(nome, identificador, saldo);
    }
    @Override
    public double emprestimo(double valor) {
        return valor * 1.05;
    }
}