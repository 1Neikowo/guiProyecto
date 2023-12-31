package ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaMenuPrincipal extends VentanaBase {
    private JButton btAgregar;
    private JButton btEliminar;
    private JButton btBuscar;
    private JButton btMostrar;
    private JButton btModificar;
    private JButton btVolver;

    public VentanaMenuPrincipal() {
        super("Menú", 500, 520);
        generarElementosVentana();

    }
    private void generarElementosVentana() {
        generarEncabezado();
        generarBotonAgregar();
        generarBotonEliminar();
        generarBotonModificar();
        generarBotonBuscar();
        generarBotonMostrar();
        generarBotonVolver();
    }
    public void generarEncabezado() {
        String encabezado = "¿Qué deseas realizar?";
        super.generarJLabelEncabezado(encabezado,100,20,300,50);
    }
    public void generarBotonAgregar() {
        btAgregar = generarBotonPrincipal("Agregar Plantas", 175, 90, 150, 35);
        this.add(btAgregar);
        btAgregar.addActionListener(this);
    }
    public void generarBotonEliminar() {
        btEliminar = generarBotonPrincipal("Eliminar Plantas", 175, 155, 150, 35);
        this.add(btEliminar);
        btEliminar.addActionListener(this);
    }
    public void generarBotonModificar() {
        btModificar = generarBotonPrincipal("Modificar Cantidad", 175, 220, 150, 35);
        this.add(btModificar);
        btModificar.addActionListener(this);
    }
    public void generarBotonBuscar() {
        btBuscar = generarBotonPrincipal("Buscar Plantas", 175, 285, 150, 35);

        this.add(btBuscar);
        btBuscar.addActionListener(this);
    }
    public void generarBotonMostrar() {
        btMostrar = generarBotonPrincipal("Mostrar Inventario", 175, 350, 150, 35);
        this.add(btMostrar);
        btMostrar.addActionListener(this);
    }
    public void generarBotonVolver() {
        btVolver = generarBotonPrincipal("Volver", 200, 425, 100, 30);
        this.add(btVolver);
        btVolver.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == btAgregar){
            new VentanaAgregar();
            this.dispose();
        }
        if(event.getSource() == btEliminar){
            new VentanaEliminar();
            this.dispose();
        }
        if(event.getSource() == btModificar){
            new VentanaModificar();
            this.dispose();
        }
        if(event.getSource() == btBuscar){
            new VentanaBuscar();
            this.dispose();
        }
        if(event.getSource() == btMostrar){
          //  new ventanaMostrar();
            this.dispose();
        }
        if(event.getSource() == btVolver){
            new VentanaLogin();
            this.dispose();
        }
    }

}
