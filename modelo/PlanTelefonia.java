package modelo;

public class PlanTelefonia 
{
    //----------------------
    // Atributos
    //----------------------
    private double numeroCelular;
    private String operador;
    private double valorMinuto;
    private int cantMinutos;
    private double costoPlan;


    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PlanTelefonia()
    {
        numeroCelular = 0;
        operador = "";
        valorMinuto = 0;
        cantMinutos = 0;
        costoPlan = 0;
    }

    public PlanTelefonia(double pNumeroCelular, String pOperador, double pValorMinuto, int pCantMinutos, double pCostoPlan)
    {
        numeroCelular = pNumeroCelular;
        operador = pOperador;
        valorMinuto = pValorMinuto;
        cantMinutos = pCantMinutos;
        costoPlan = pCostoPlan;
    }
    
    //Metodos de acceso
    public void setNumeroCelular(int pNumeroCelular)
    {
        numeroCelular = pNumeroCelular;
    }

    public void setOperador(String pOperador)
    {
        operador = pOperador;
    }

    public void setValorMinuto(double pValorMinuto)
    {
        valorMinuto = pValorMinuto;
    }

    public void setCantMinutos(int pCantMinutos)
    {
        cantMinutos = pCantMinutos;
    }

    public void setCostoPlan(double pCostoPlan)
    {
        costoPlan = pCostoPlan;
    }

    public double getNumeroCelular()
    {
        return numeroCelular;
    }

    public String getOperador()
    {
        return operador;
    }

    public double getValorMinuto()
    {
        return valorMinuto;
    }

    public int getCantMinutos()
    {
        return cantMinutos;
    }

    public double getCostoPlan()
    {
        return costoPlan;
    }

    
    public void calcularCostoPlan()
    {
        if (getOperador() == "Wom")
        {
            costoPlan = (valorMinuto * cantMinutos)/2 ;
        }
        else
        {
            costoPlan = valorMinuto * cantMinutos;
        }

        
    }
    
}
