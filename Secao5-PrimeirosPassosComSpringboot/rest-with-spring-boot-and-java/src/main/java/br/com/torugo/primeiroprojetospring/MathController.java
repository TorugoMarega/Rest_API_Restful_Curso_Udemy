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
        return false;
    }
}
