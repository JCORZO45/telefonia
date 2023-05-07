package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import controlador.Controlador;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbOperadores;
    private JLabel lbnumCel;
    private JLabel lbImagen;

    private JTextField tfnumCel;
    private JLabel lbcanMinutos;
    private ImageIcon iImagen;
    private JTextField tfcosMinutos;
    private JLabel lbcosMinutos;
    private JTextField tfcanMinutos;
    private JComboBox cbOperadores;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.black);

        //Crear y agregar etiqueta empleados
        lbOperadores = new JLabel("Operador: ");
        lbOperadores.setBounds(10,120,100,20);
        lbOperadores.setFont(new Font("Arial", Font.BOLD, 14));
        lbOperadores.setForeground(Color.white);
        this.add(lbOperadores);
        // Creacion y adicion de etiqueta label lbRadio
        lbnumCel = new JLabel("Numero celular :");
        lbnumCel.setFont(new Font("Arial", Font.BOLD, 12));
        lbnumCel.setForeground(Color.white);
        lbnumCel.setBounds(10, 20,100,20);
        this.add(lbnumCel);
  
        // Creacion y adicion de caja de texto tfRadio
        tfnumCel = new JTextField();
        tfnumCel.setBounds(120, 20, 100, 25);
        this.add(tfnumCel);

        lbcanMinutos = new JLabel("Minutos:");
        lbcanMinutos.setBounds(10, 50,100,20);
        lbcanMinutos.setFont(new Font("Arial", Font.BOLD, 14));
        lbcanMinutos.setForeground(Color.white);
        this.add(lbcanMinutos);
  
        // Creacion y adicion de caja de texto tfRadio
        tfcanMinutos = new JTextField();
        tfcanMinutos.setBounds(120, 50, 100, 25);
        this.add(tfcanMinutos);
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/telefonia.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(500,40,200,150);
        add(lbImagen);

        lbcosMinutos = new JLabel("Costo Minuto:");
        lbcosMinutos.setBounds(10, 80,100,20);
        lbcosMinutos.setFont(new Font("Arial", Font.BOLD, 14));
        lbcosMinutos.setForeground(Color.white);
        this.add(lbcosMinutos);
  
        // Creacion y adicion de caja de texto tfRadio
        tfcosMinutos = new JTextField();
        tfcosMinutos.setBounds(120, 80, 100, 25);
        this.add(tfcosMinutos);
        //Crear y agregar combo lista Empleados
        cbOperadores = new JComboBox();
        cbOperadores.setBounds(100,120,260,20);
        this.add(cbOperadores);

        cbOperadores.addItem("Claro");
        cbOperadores.addItem("Movistar");
        cbOperadores.addItem("Wom");
        cbOperadores.addItem("Tigo");

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getOperador()
    {
        return (String) cbOperadores.getSelectedItem();
    }

    public void setOperador(String emp)
    {
        cbOperadores.addItem(emp);
    }
    public String getnumeroCelular ()
    {
        return tfnumCel.getText();
    }

    public String getcantMinutos()
    {
        return tfcanMinutos.getText();
    }

    public String getcostoMinuto ()
    {
        return tfcosMinutos.getText();
    }

    public void borrar() {
    }

    public void agregarOyentesBotones(Controlador controlador) {
    }
}
