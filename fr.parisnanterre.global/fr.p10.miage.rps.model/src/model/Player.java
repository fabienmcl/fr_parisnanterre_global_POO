package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String nom;
    int score;
    int nbMove;
    int actualMove;

    List<RPSEnum> listMove;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNbMouv() {
        return nbMove;
    }

    public void setNbMouv(int nbMove) {
        this.nbMove = nbMove;
    }

    public Player(String nom) {
        this.nom = nom;
        this.score = 0;
        nbMove = 10;
        actualMove = 0;
        this.listMove = new ArrayList<RPSEnum>();
        generateListMove(nbMove);
    }
    public void generateListMove(int nbMouv){
        for(int i=0;i<nbMouv;i++){
            listMove.add(RPSEnum.getRandomMouv());
        }
    }
    public RPSEnum getNextMove(){
        return listMove.get(actualMove);
    }
}
