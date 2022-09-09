package bytebank;

public class TestaMetodo { 
    public static void main (String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);
        
        
        boolean retirou =  contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(retirou);
        
        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);
        
       if( contaMarcela.transfere(300, contaDoPaulo)) {
    	   System.out.println("Transferencia feita com sucesso!");
       }else {
    	   System.out.println("saldo insuciente!");
       }
        System.out.println(contaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
        
        contaDoPaulo.titular= "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);
    }
}