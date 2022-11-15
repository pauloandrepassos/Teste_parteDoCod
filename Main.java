import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AreaDeConhecimento> areasDeConhecimento= new ArrayList<>();

        AreaDeConhecimento area1 = new AreaDeConhecimento("Romance", 1);
        AreaDeConhecimento area2 = new AreaDeConhecimento("Ficção Cientifica", 2);

        areasDeConhecimento.add(area1);
        areasDeConhecimento.add(area2);
        String message = "";
        for (AreaDeConhecimento area : areasDeConhecimento) {
            message += " " + area.getCodArea() + " - "+ area.getTitulo() + "\n";
        }
        String codigoArea = JOptionPane.showInputDialog(message + "Código da área de conheccimento: ");
    }
}