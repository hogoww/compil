package com.example.trogliano.ville_futee;


import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.CharBuffer;

public class ConnectSocket extends AsyncTask<Id , Void, String> {
    String id;
    String mdp;

    ConnectSocket()
    {
        this.id=id;
        this.mdp=mdp;
    }

    @Override
    protected String doInBackground(Id... params) {
        Socket socket;
        BufferedReader in;
        PrintWriter out;

        try {
            System.out.println("valeur: "+params[0].log+ " "+params[0].mdp);

            socket = new Socket("10.0.2.2", 8080);

            out = new PrintWriter(socket.getOutputStream());
            out.println(new String("log").trim()); //On envoie ça au serveur pour qu'il sache ce qu'on veut
            out.flush();
            out = new PrintWriter(socket.getOutputStream());
            out.println(params[0].log + " "+ params[0].mdp);
            out.flush();

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //retour de ce que l'on attend avec en séparateur //s
            CharBuffer buffer= CharBuffer.allocate(1); // "1" -> OK, "0" -> mauvais pseudo ou mdp


            int message_length = in.read(buffer); //read(CharBuffer) est bloquant:pratique
            buffer.position(0);
            String result="";

            char c= buffer.get();
            result+=c;

            socket.close();

            return result;

        } catch (UnknownHostException e) {

            System.err.println("Erreur Host");
            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
    }
}