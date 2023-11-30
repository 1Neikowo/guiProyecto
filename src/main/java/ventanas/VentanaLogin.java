package ventanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VentanaLogin extends VentanaBase {
    private JTextField passwordField;
    private JButton btIngresar;
    public VentanaLogin() {
        super("Login", 500, 520);
        generarElementosVentana();
    }
    public void generarElementosVentana() {
        generarTitulo();
        generarPasswordField();
        generarBotonIngresar();
    }
    public void generarTitulo() {
        String textoTitulo = "Bienvenido a AIV";
        String textoSubtitulo = "Ingresa tus datos para comenzar";
        super.generarJLabelEncabezado(textoTitulo, 100,40,300,50);
        super.generarJLabel(textoSubtitulo, 100,80,300,50);
    }
    public void generarPasswordField(){
        String textoNombre = "Password:";
        super.generarJLabel(textoNombre, 100, 180, 150, 20);
        passwordField = super.generarJPasswordField(100, 210, 250, 20);
        this.add(passwordField);
    }
    public void generarBotonIngresar(){
        btIngresar = generarBotonPrincipal("Ingresar", 250, 240, 100, 30);
        this.add(btIngresar);
        btIngresar.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == btIngresar){
            new VentanaMenuPrincipal();
            this.dispose();
        }
    }
}
