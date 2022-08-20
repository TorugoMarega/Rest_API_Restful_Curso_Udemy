package br.com.torugo.primeiroprojetospring;


import br.com.torugo.primeiroprojetospring.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
            if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
                throw new UnsupportedMathOperationException("Please set a numeric value");
            }
            return Double.parseDouble(numberOne)+Double.parseDouble(numberTwo);
    }
    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Double.parseDouble(numberOne)-Double.parseDouble(numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Double.parseDouble(numberOne)*Double.parseDouble(numberTwo);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Double.parseDouble(numberOne)/Double.parseDouble(numberTwo);
    }

    @RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return (Double.parseDouble(numberOne)+Double.parseDouble(numberTwo))/2;
    }

    @RequestMapping(value = "/squareroot/{numberOne}", method = RequestMethod.GET)
    public Double squareroot(@PathVariable(value = "numberOne") String numberOne) throws Exception{
        if(!isNumeric(numberOne)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Math.sqrt(Double.parseDouble(numberOne));
    }

    @RequestMapping(value = "/power/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double squareroot(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception{
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Math.pow(Double.parseDouble(numberOne), Double.parseDouble(numberTwo));
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
