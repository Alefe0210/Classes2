package classes;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 5000);
        Empregado empregado2 = new Empregado("Maria", "Souza", 7000);

        System.out.printf("O salário anual de %s %s é R$%.2f%n", empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        System.out.printf("O salário anual de %s %s é R$%.2f%n", empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());

        empregado1.darAumento(10);
        empregado2.darAumento(10);

        System.out.printf("O salário anual de %s %s após o aumento de 10%% é R$%.2f%n", empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        System.out.printf("O salário anual de %s %s após o aumento de 10%% é R$%.2f%n", empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());
    }
}