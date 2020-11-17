package com.example.inventory.iu.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {
    /**
     * Metodo estatico que comprueba si la contraseña es valida
     * >= 8 caracteres
     * 1 mayúscula
     * 1 número
     * @param password
     * @return
     */
    public static boolean isPasswordValid(String password){
        //Pattern pattern = Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9].{7,}$");
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
