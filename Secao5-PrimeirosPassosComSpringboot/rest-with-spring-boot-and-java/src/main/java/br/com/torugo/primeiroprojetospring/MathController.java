package br.com.torugo.primeiroprojetospring;


import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
            if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
                throw new Exception();
            }
            return Double.parseDouble(numberOne)+Double.parseDouble(numberTwo);
    }

    private boolean isNumeric(String strNumber){
        if(strNumber==null) return false;
        String number = strNumber.replaceAll(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String strNumber){
        if(strNumber==null) return  0D;
        String number = strNumber.replaceAll(",",".");
        if(isNumeric(number)) return Double.parseDouble(strNumber);
        return 0D;
    }
}
