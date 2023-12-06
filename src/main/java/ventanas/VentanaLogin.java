package ventanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class VentanaLogin extends VentanaBase {
    private JTextField passwordField;
    private JButton btVolver;
    private JButton btIngresar;
    public VentanaLogin() {
        super("Login", 500, 520);
        generarElementosVentana();
    }
    public void generarElementosVentana() {
        generarTitulo();
        generarPasswordField();
        generarBotonVolver();
        generarBotonIngresar();
    }
    public void generarTitulo() {
        String textoTitulo = "Bienvenido a AIV";
        String textoSubtitulo = "Ingresa tus datos para comenzar";
        super.generarJLabelEncabezado(textoTitulo, 125,40,300,50);
        super.generarJLabel(textoSubtitulo, 125,80,300,50);
    }
    public void generarPasswordField(){
        String textoNombre = "Password:";
        super.generarJLabel(textoNombre, 125, 180, 150, 20);
        passwordField = super.generarJPasswordField(125, 210, 250, 20);
        this.add(passwordField);
    }
    public void generarBotonIngresar(){
        btIngresar = generarBotonPrincipal("Ingresar", 275, 240, 100, 30);
        this.add(btIngresar);
        btIngresar.addActionListener(this);
    }
    public void generarBotonVolver() {
        btVolver = generarBotonPrincipal("Salir", 200, 425, 100, 30);
        this.add(btVolver);
        btVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == btIngresar){
            if (passwordField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una contraseña", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            }else{
                new VentanaMenuPrincipal();
                this.dispose();
            }
        }
        if (event.getSource() == btVolver){
            JOptionPane.showMessageDialog(this, "Hasta Luego! 😉");
            this.dispose();
        }
    }
}
