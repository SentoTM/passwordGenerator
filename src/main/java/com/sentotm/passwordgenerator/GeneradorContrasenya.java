/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sentotm.passwordgenerator;
import java.util.Random;
/**
 *
 * @author vicen
 */
public class GeneradorContrasenya {
    
    private String mezcla(String str) {
        
        Random random = new Random();
        
        // asignamos numero de veces que mezclamos, entre 20 y 49.
        final int veces = random.nextInt(30) + 20;
        
        String mezclado = str;
        
        for (int i = 0; i < veces; i++) {
            
            // randomly pull a character and dump it to the end of the string
            final int index = random.nextInt(str.length() - 1);
            mezclado = mezclado.substring(0, index) +
                        mezclado.substring(index+1, mezclado.length()) +
                        mezclado.charAt(index);
        }
        
        return mezclado;
    }
    
    public String generarnuevopass() {
        
        // Características contraseña
        // 1. Se compone de 15 caracteres
        // 2. Contiene 4 mayúsculas, 6 minúsculas
        // 3. Contiene 3 caracteres especiales: ! _ $ # * & ~ - %
        // 4. Contiene 2 números.
    
        final int NUM_UPPER = 4;
        final int NUM_LOWER = 6;
        final int NUM_SPECIAL = 3;
        final int NUM_NUMS = 2;
    
        final String UPPER_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String LOWER_POOL = "abcdefghijklmnopqrsdtuvwxyz";
        final String SPECIAL_POOL = "!_$#*&~-%";
        final String NUM_POOL = "0123456789";
                
        Random random = new Random();
        String password = "";
        
        // Incluimos letras mayúsculas
        
        for (int i = 0; i < NUM_UPPER; i++) {
            final int index = random.nextInt(UPPER_POOL.length());
            password += UPPER_POOL.charAt(index);
        }
        
        // Incluimos minusculas
        
        for (int i = 0; i < NUM_LOWER; i++) {
            final int index = random.nextInt(LOWER_POOL.length());
            password += LOWER_POOL.charAt(index);
        }

        // Incluimos caracteres especiales
        
        for (int i = 0; i < NUM_SPECIAL; i++) {
            final int index = random.nextInt(SPECIAL_POOL.length());
            password += SPECIAL_POOL.charAt(index);
        }
        
        // Incluimos números
        
        for (int i = 0; i < NUM_NUMS; i++) {
            final int index = random.nextInt(NUM_POOL.length());
            password += NUM_POOL.charAt(index);
        }
        
        // Mezclamos los caracteres
        password = mezcla(password);
        
        System.out.println(password);
        return password;
    }
}
