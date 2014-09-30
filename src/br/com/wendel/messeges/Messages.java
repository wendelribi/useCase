package br.com.wendel.messeges;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class Messages {
	
	
    static public void main(String[] args) {

    	String language;
        String country;
        if (args.length != 2) {
            language = new String("en");
            country = new String("US");
        } else {
            language = new String(args[0]);
            country = new String(args[1]);
        }
        
        ResourceBundle messages;
        Locale currentLocale;
        currentLocale = new Locale(language, country);

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(ResourceBundle.getBundle("Messages"));
        System.out.println(messages.getString("saudacoes"));
    }
}
