package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cmd{

    String cmdCalc = "";

    public Cmd(String _cmd){
        this.cmdCalc = _cmd;

    }
    /**
     * Разбиваем строку калькулятора на числа и операции над ними
     * @return Массив значений
     */
    List<String> readCmd() throws Exception {



        // Разбиваем строку калькулятора на числа и операции над ними
        List<String> dataCalc = new ArrayList<String>();

        // Убираем пробелы
        cmdCalc = cmdCalc.replaceAll("\\s+","");

        // Проверяем на сложение
        String[] resPlus = cmdCalc.split("\\+");
        if (resPlus.length == 2)
        {
            dataCalc.add("+");
            dataCalc.add(resPlus[0]);
            dataCalc.add(resPlus[1]);
        }

        // Проверяем на вычетание
        String[] resMinus = cmdCalc.split("-");
        if (resMinus.length == 2)
        {
            dataCalc.add("-");
            dataCalc.add(resMinus[0]);
            dataCalc.add(resMinus[1]);
        }

        // Проверяем на умножение
        String[] resMultiplication = cmdCalc.split("\\*");
        if (resMultiplication.length == 2)
        {
            dataCalc.add("*");
            dataCalc.add(resMultiplication[0]);
            dataCalc.add(resMultiplication[1]);
        }

        // Проверяем на деление
        String[] resDivision = cmdCalc.split("/");
        if (resDivision.length == 2)
        {
            dataCalc.add("/");
            dataCalc.add(resDivision[0]);
            dataCalc.add(resDivision[1]);
        }

        // Проверяем на правильность ввода строки
        if (dataCalc.size() != 3){
            throw new Exception("Количество допустимых операндов превышает допустимое значение (пример, 1 + 2):");
        }

        // Возвращаем массив значений
        return dataCalc;
    }
}
