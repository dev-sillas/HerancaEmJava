package FuncionarioDoBanco;

public class TestarFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(200.00);

        System.out.println(nico.getNome());
        nico.setTipo(0);
        System.out.println(nico.getBonificacao());

        //nico.salario = 300.0;

}
	
}
