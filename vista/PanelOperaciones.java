package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btBorrar;
    private JButton btCostoPlan;
    private JButton btSalir;


    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.black);

        //Crear y agregar boton AgregarVendedor
        btCostoPlan = new JButton("Costo Plan");
        btCostoPlan.setBounds(30,50,170,20);
        btCostoPlan.setActionCommand("costoplan");
        this.add(btCostoPlan);

        //Crear y agregar boton VenderCarro
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(260,50,170,20); 
        btBorrar.setActionCommand("reset");
        this.add(btBorrar);

      

     

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(500,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);



       



        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btBorrar.addActionListener(pAL);
        btCostoPlan.addActionListener(pAL);
        btSalir.addActionListener(pAL);
     
    }


}
