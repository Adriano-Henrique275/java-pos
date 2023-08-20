import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        /*  
        * Faça um programa que solicite  10 númeres float do usúario guarde em vetor.
        * Mostre o maior, menor, media e o vetor  
        */


        int tamanho = 10;
        float valores [] = new float[tamanho];

        for (int i = 0; i < tamanho; i++) {
            valores[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor" + i));
        }

        float maior = valores[0];
        float menor = valores[0];
        float media = valores[0];
        String reusltado = "" + valores[0] + "\n";

        for(int i = 0; i < tamanho; i++) {
            if(maior < valores[i]) {
                maior = valores[0];
            }

            if(menor < valores[i]) {
                menor = valores[0];
            }
            
            media += valores[i];
            reusltado += valores[i] + "\n";
        }

        media /= tamanho;

        reusltado = "Media: " + media + "\n Maior: " + maior + "\n Menor: " + menor + " \n Vetor completo: \n" + reusltado;
        JOptionPane.showMessageDialog(null, reusltado);

    }
}
