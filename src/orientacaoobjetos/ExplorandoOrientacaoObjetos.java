package orientacaoobjetos;

//regras para classes
public class ExplorandoOrientacaoObjetos {
    public static void main(String[] args) {
       Conta conta1 = new Conta();
       conta1.depositar(4.5);
       conta1.sacar(5.0);
        System.out.println(conta1.saldo);
        System.out.println(conta1.limite);
        conta1.sacar(10.0);
    }
}
