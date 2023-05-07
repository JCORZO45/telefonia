package controlador;

import modelo.PlanTelefonia;
import modelo.PlanTelefonia;

import vista.VentanaPrincipal;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
   
    private PlanTelefonia Plan;
    

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pPlan)
    {
        this.venPrin = pVenPrin;
        this.Plan=pPlan;
        
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nTelefonia\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
  
   



        if(comando.equals("costoplan"))

        {
            double numeroCelular = Double.parseDouble(venPrin.miPanelEntradaDatos.getnumeroCelular());
            String operador = venPrin.miPanelEntradaDatos.getOperador();
            double valorMinuto = Double.parseDouble(venPrin.miPanelEntradaDatos.getcostoMinuto());
            int cantMinutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getcantMinutos());
            PlanTelefonia plan = new PlanTelefonia(numeroCelular, operador, valorMinuto, cantMinutos, valorMinuto);
            plan.calcularCostoPlan();;
            

            venPrin.miPanelResultados.mostrarResultado("El numero de celular es: " + plan.getNumeroCelular() + "\nEl operador es: " + plan.getOperador() + "\nEl valor del minuto es: " + plan.getValorMinuto() + "\nLa cantidad de minutos es: " + plan.getCantMinutos() + "\nEl costo del plan es: " + plan.getCostoPlan() + "\n");
        }

        //Agregar vendedor
        if(comando.equals("reset"))
        {
            
            this.venPrin.miPanelEntradaDatos.borrar();;
            this.venPrin.miPanelResultados.borrar();;
    
        }
       


        //Salir
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(venPrin,"Has salido de la aplicacion");
            System.exit(0);
        }  
    }


}

