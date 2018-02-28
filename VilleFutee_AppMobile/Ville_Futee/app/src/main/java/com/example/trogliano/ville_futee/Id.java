package com.example.trogliano.ville_futee;


public class Id {
    String log;
    String mdp;

    void setLog(String log){
        this.log=log;
    }
    void setMdp(String mdp){
        this.mdp=mdp;
    }
    String getLog(){
        return log;
    }
    String getMdp(){
        return mdp;
    }

    Id(String log, String mdp){
        this.log=log;
        this.mdp=mdp;
    }
}
