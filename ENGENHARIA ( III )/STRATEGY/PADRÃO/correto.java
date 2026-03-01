public interface EmprestimoStrategy {
    double calcularValorFinal(double valor);
}
public class EmprestimoComum implements EmprestimoStrategy {
    public double calcularValorFinal(double valor) {
        return valor * 1.10;
    }
}
public class EmprestimoEmpresa implements EmprestimoStrategy {
    public double calcularValorFinal(double valor) {
        return valor * 1.08;
    }
}
public class EmprestimoEstudante implements EmprestimoStrategy {
    public double calcularValorFinal(double valor) {
        return valor * 1.05;
    }
}
public class Cliente {
    protected String nome;
    protected String identificador;
    protected double saldo;

    private EmprestimoStrategy estrategia;

    public Cliente(String nome, String identificador, double saldo, EmprestimoStrategy estrategia) {
        this.nome = nome;
        this.identificador = identificador;
        this.saldo = saldo;
        this.estrategia = estrategia;
    }

    public void realizarEmprestimo(double valor) {
        double valorFinal = estrategia.calcularValorFinal(valor);
        System.out.println("Valor final a pagar: " + valorFinal);
    }
}
public class Main {
    public static void main(String[] args) {

        Cliente comum = new Cliente("Igor", "123", 1000, new EmprestimoComum());
        Cliente empresa = new Cliente("XPTO", "999", 50000, new EmprestimoEmpresa());

        comum.realizarEmprestimo(1000);
        empresa.realizarEmprestimo(1000);
    }
}