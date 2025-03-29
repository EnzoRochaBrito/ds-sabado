package Atividade;

public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String nome, String email, float salario, String cnh) {
        super(nome, email, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "cnh='" + cnh + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }
}
