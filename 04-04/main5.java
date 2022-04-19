import javax.swing.JOptionPane;
public class main5 {
    public static void main(String[] args) { 
        float ladoA, ladoB, ladoC;
    ladoA = Float.parseFloat(JOptionPane.showInputDialog("Lado A:"));
    ladoB = Float.parseFloat(JOptionPane.showInputDialog("Lado B:"));
    ladoC = Float.parseFloat(JOptionPane.showInputDialog("Lado C:"));


    if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) &&  (ladoB + ladoC > ladoA)){
        JOptionPane.showInputDialog(null, "É um triângulo", JOptionPane.INFORMATION_MESSAGE);
            if ((ladoA == ladoB) && (ladoA == ladoC) ){
                JOptionPane.showInputDialog(null, "é um triangulo equilátero", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
                    JOptionPane.showInputDialog(null, "é um triangulo isósceles", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showInputDialog(null, "é um triangulo escaleno", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    } else {
        JOptionPane.showInputDialog(null, "Não é um triângulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
}