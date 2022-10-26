package atividadeumjop;

import javax.swing.JOptionPane;

public class AtividadeUmJOP {

    public static void main(String[] args) {

        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float media;

        do {

            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));
            nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3:"));

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {

                JOptionPane.showMessageDialog(null, "Alguma Nota Esta Errada Digite Novamente");

            }

        } while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10);

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {

            JOptionPane.showMessageDialog(null, "Aprovado");

        } else if (media < 3) {

            JOptionPane.showMessageDialog(null, "Reprovado Sem Direito a Final");

        } else if (media >= 3 && media < 7) {

            JOptionPane.showMessageDialog(null, "Reprovado Com Direito a Final");

        }

    }

}
