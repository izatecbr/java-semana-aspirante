package orientacaoobjetos;

public class Conta {
    //scopo
    //variaveis ou atribudos - real requisito no seu sistema
    Double saldo = 0.0;
    Double limite = 10.0;
    void depositar( Double valorDeposito) {
         //algoritimo
         saldo = saldo + valorDeposito;
    }
    //pode usar o conceito de aglutinação de valores
    void sacar( Double valorSolicitado) {
        if(valorSolicitado > (saldo + limite) )
            System.out.println("Valor solicitado maior que o saldo");
        else
            saldo = saldo - valorSolicitado;
    }
}
