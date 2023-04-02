package trabalho.crispim;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

    
import java.math.BigDecimal;

public class IcmsES implements CalculoPorRegiao{

    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {  
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.12"));
    }
    
}
