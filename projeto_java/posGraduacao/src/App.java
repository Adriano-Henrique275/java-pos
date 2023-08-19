import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*  
        * Faça um programa que solicite  10 númeres float do usúario guarde em vetor.
        * Mostre o maior, menor, media e o vetor  
        */

        float numeros[] = new float[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
        }

        String result = "";

        for (float aux : numeros ) {
            System.out.println("teste" + aux);
            result += aux + "\n";
        }
        
        JOptionPane.showMessageDialog(null, result);
    }
}
