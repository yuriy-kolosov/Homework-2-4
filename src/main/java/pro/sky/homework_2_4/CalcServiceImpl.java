package pro.sky.homework_2_4;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String hello() {
        return "<b>Домашнее задание 2-4 </b>(калькулятор)";
    }

    public String prompt() {
        return "Добро пожаловать в калькулятор. Введите тип операции (plus|minus|multiply|divide) и два операнда";
    }

    public String add(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " + " + num2 + " = " + (Integer.decode(num1) + Integer.decode(num2));
        }
        return res;
    }

    public String minus(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " - " + num2 + " = " + (Integer.decode(num1) - Integer.decode(num2));
        }
        return res;
    }

    public String multiply(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " * " + num2 + " = " + (Integer.decode(num1) * Integer.decode(num2));
        }
        return res;
    }

    public String divide(String num1, String num2) {
        String res = "Ошибка: нет операнда";
        if (!num1.isEmpty() && !num2.isEmpty()) {
            res = num1 + " / " + num2 + " = " + ((double) Integer.decode(num1) / (double) Integer.decode(num2));
        }
        return res;
    }

}