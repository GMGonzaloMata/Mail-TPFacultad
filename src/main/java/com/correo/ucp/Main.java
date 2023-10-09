package com.correo.ucp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MailManager mailManager = new MailManager();
        MailBox buzon = new MailBox("Alex@gmail.com");
        mailManager.listMailbox.add(buzon);
        Contact contacto1 = new Contact("Alex", "Alex@gmail.com");
        Contact contacto2 = new Contact("UCP","ucp@gmail.com");
        Contact contacto3 = new Contact("Pedro", "Pedro@gmail.com");
        List<Contact> para = new ArrayList<>();
        List<Contact> para1 = new ArrayList<>();
        para.add(contacto3);
        para1.add(contacto1);
        Mail correo = new Mail("Saludo", "Hola Pedro", contacto1 , para);
        Mail correo1 = new Mail("Universidad", "cuota", contacto2 , para1);
        mailManager.enviarCorreo(correo);
        mailManager.enviarCorreo(correo1);
        FiltroAsunto filtroAsunto = new FiltroAsunto();
        filtroAsunto.filtrarMailsAsunto(buzon, "U");
        for (Mail correoFiltrado : filtroAsunto.listaMailsAsunto) {
        System.out.println("Asunto: " + correoFiltrado.getAsunto());
        System.out.println("Contenido: " + correoFiltrado.getContenido());
        System.out.println("Remitente: " + correoFiltrado.getRemitente().getMail());
}
}
}