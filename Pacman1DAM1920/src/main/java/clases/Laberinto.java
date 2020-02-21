/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import constantes.Constantes;

/**
 * Clase que representa al laberinto del Pacman
 *
 * @author Alvaro Lopez
 * @author Alvaro Nuñez
 */
public final class Laberinto {

    private Elemento[][] mapa; // INICIALIZAMOS LA VARIABLE MAPA, EN LA CUAL APARECERAN LOS ELEMENTOS
    private Fantasma[] fantasma; // INICIALIZACION DEL NUMERO DE FANTASMAS INCLUIDOS EN EL JUEGO
    private Pacman pacman; // INICIALIZAMOS EL PERSONAJE PRINCIPAL DEL JUEGO
    private Bolita[] bolitas; // INICIALIZAMOS DE LOS PUNTOS DEL JUEGO
    private Fruta fruta; // INICIALIZAMOS LOS PUNTOS EXTRA DEL JUEGO

    // AQUI EMPEZAMOS A INICIALIZAR LOS GETTERS AND SETTERS
    public Elemento[][] getMapa() {
        return mapa;
    }

    public void setMapa(Elemento[][] mapa) {
        this.mapa = mapa;
    }

    public Fantasma[] getFantasma() {
        return fantasma;
    }

    public void setFantasma(Fantasma[] fantasma) {
        this.fantasma = fantasma;
    }

    public Pacman getPacman() {
        return pacman;
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }

    public Bolita[] getBolita() {
        return bolitas;
    }

    public void setBolita(Bolita[] bolita) {
        this.bolitas = bolitas;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    // ACABAMOS DE GENERAR GETTERS AND SETTERS
    // EJECUTAMOS LAS FUNCIONES
    /*
    * @return devuelve el mapa con todos los elementos incluidos
     */
    public void inicializarMapa() {
        this.mapa = new Elemento[20][20];
        this.bolitas = new Bolita[155];

        this.bolitas[0] = new Bolita(1, 1, true); //Rafa
        this.bolitas[1] = new Bolita(1, 2, false); //Rafa
        this.bolitas[2] = new Bolita(2, 1, false); //Rafa
        this.bolitas[3] = new Bolita(3, 1, false); //Rafa
        this.bolitas[4] = new Bolita(8, 12, false); //Rafa
        this.bolitas[5] = new Bolita(9, 11, false); //Rafa
        this.bolitas[6] = new Bolita(9, 12, false); //Rafa
        this.bolitas[7] = new Bolita(10, 12, false); //Rafa
        this.bolitas[8] = new Bolita(11, 12, false); //Rafa

        this.bolitas[9] = new Bolita(3, 1, false);//kevin
        this.bolitas[10] = new Bolita(1, 3, false);//kevin
        this.bolitas[11] = new Bolita(1, 4, false);//kevin
        this.bolitas[12] = new Bolita(8, 14, false);//kevin
        this.bolitas[13] = new Bolita(9, 14, false);//kevin
        this.bolitas[14] = new Bolita(9, 15, false);//kevin
        this.bolitas[15] = new Bolita(9, 16, false);//kevin
        this.bolitas[16] = new Bolita(10, 14, false);//kevin
        this.bolitas[17] = new Bolita(11, 14, false);//kevin

        this.bolitas[18] = new Bolita(1, 6, false);// Antonio
        this.bolitas[19] = new Bolita(1, 7, false);// Antonio
        this.bolitas[20] = new Bolita(1, 8, false);// Antonio
        this.bolitas[21] = new Bolita(8, 18, false);//Antonio
        this.bolitas[22] = new Bolita(9, 18, false);//Antonio
        this.bolitas[23] = new Bolita(10, 18, false);//Antonio
        this.bolitas[24] = new Bolita(11, 18, false);//Antonio

        this.bolitas[25] = new Bolita(1, 5, false);

        this.bolitas[27] = new Bolita(1, 6, false); //cristi
        this.bolitas[28] = new Bolita(1, 7, false); //cristi
        this.bolitas[29] = new Bolita(1, 8, false); //cristi

        this.bolitas[30] = new Bolita(1, 9, false); //maria
        this.bolitas[31] = new Bolita(1, 10, false);//maria
        this.bolitas[32] = new Bolita(1, 11, false);//maria

        this.bolitas[33] = new Bolita(1, 12, false);
        this.bolitas[34] = new Bolita(1, 13, false);
        this.bolitas[35] = new Bolita(1, 14, false);
        this.bolitas[36] = new Bolita(1, 15, false);
        this.bolitas[37] = new Bolita(1, 16, false);
        this.bolitas[39] = new Bolita(1, 17, false);
        this.bolitas[41] = new Bolita(1, 18, true);//Francisco
        this.bolitas[42] = new Bolita(2, 18, false);//Francisco
        this.bolitas[43] = new Bolita(3, 18, false);//Francisco
        this.bolitas[44] = new Bolita(12, 9, false);//Francisco
        this.bolitas[45] = new Bolita(12, 10, false);//Francisco
        this.bolitas[46] = new Bolita(12, 11, false);//Francisco
        this.bolitas[47] = new Bolita(13, 9, false);//Francisco

        this.bolitas[48] = new Bolita(4, 1, false); //ivan
        this.bolitas[49] = new Bolita(5, 1, false); // ivan
        this.bolitas[50] = new Bolita(6, 1, false); // ivan
        this.bolitas[51] = new Bolita(7, 1, false); // ivan
        this.bolitas[52] = new Bolita(12, 12, false); //ivan
        this.bolitas[53] = new Bolita(12, 14, false); // ivan
        this.bolitas[54] = new Bolita(13, 12, false); // ivan
        this.bolitas[55] = new Bolita(13, 14, false); // ivan
        this.bolitas[56] = new Bolita(14, 12, false); //ivan
        this.bolitas[57] = new Bolita(14, 14, false); // ivan
        this.bolitas[58] = new Bolita(15, 12, false); // ivan
        this.bolitas[59] = new Bolita(15, 13, false); // ivan
        this.bolitas[60] = new Bolita(15, 14, false); // ivan

        this.bolitas[61] = new Bolita(4, 9, false); //Álvaro Torres
        this.bolitas[62] = new Bolita(4, 10, false);
        this.bolitas[63] = new Bolita(4, 11, false);//Álvaro Torres

        this.bolitas[64] = new Bolita(4, 6, false);//Alvaro lopez
        this.bolitas[65] = new Bolita(4, 7, false);//Alvaro lopez
        this.bolitas[66] = new Bolita(4, 8, false);//Alvaro lopez
        this.bolitas[67] = new Bolita(5, 7, false);//Alvaro lopez
        this.bolitas[68] = new Bolita(6, 7, false);//Alvaro lopez
        this.bolitas[69] = new Bolita(7, 7, false);//Alvaro lopez
        this.bolitas[70] = new Bolita(4, 12, false); //Javi R
        this.bolitas[71] = new Bolita(4, 13, false); //Javi R
        this.bolitas[72] = new Bolita(4, 14, false); //Javi R
        this.bolitas[73] = new Bolita(7, 12, false); //Javi R
        this.bolitas[74] = new Bolita(7, 13, false); //Javi R
        this.bolitas[75] = new Bolita(7, 14, false); //Javi R
        this.bolitas[76] = new Bolita(16, 4, false); //Javi R
        this.bolitas[77] = new Bolita(16, 5, false); //Javi R
        this.bolitas[78] = new Bolita(18, 3, false); //Javi R
        this.bolitas[79] = new Bolita(18, 4, false); //Javi R
        this.bolitas[80] = new Bolita(18, 5, false); //Javi R
        this.bolitas[81] = new Bolita(6, 15, false);//Norberto Vergas
        this.bolitas[82] = new Bolita(6, 16, false);//Norberto Vergas
        this.bolitas[83] = new Bolita(6, 17, false);//Norberto Vergas
        this.bolitas[84] = new Bolita(9, 15, false);//Norberto Vergas
        this.bolitas[85] = new Bolita(9, 16, false);//Norberto Vergas
        this.bolitas[86] = new Bolita(9, 17, false);//Norberto Vergas
        this.bolitas[87] = new Bolita(16, 1, false);//Alvaro lopez
        this.bolitas[88] = new Bolita(17, 1, false);//Alvaro lopez
        this.bolitas[89] = new Bolita(18, 1, true);//Alvaro lopez
        this.bolitas[90] = new Bolita(18, 2, false);//Alvaro lopez
        this.bolitas[91] = new Bolita(19, 9, false);//Norberto
        this.bolitas[92] = new Bolita(19, 10, false);//Norberto
        this.bolitas[93] = new Bolita(19, 11, false);//Norberto
        this.bolitas[94] = new Bolita(15, 3, false); //maria
        this.bolitas[95] = new Bolita(15, 4, false); //maria
        this.bolitas[100] = new Bolita(12, 4, false); //maria
        this.bolitas[101] = new Bolita(13, 4, false); //maria
        this.bolitas[102] = new Bolita(14, 4, false); //maria
        this.bolitas[103] = new Bolita(14, 5, false); //maria
        this.bolitas[104] = new Bolita(12, 5, false); //maria
        this.bolitas[105] = new Bolita(4, 4, false); //Javi
        this.bolitas[106] = new Bolita(4, 5, false);//Javi
        this.bolitas[107] = new Bolita(5, 4, false);//Javi
        this.bolitas[108] = new Bolita(6, 4, false);//Javi
        this.bolitas[109] = new Bolita(7, 4, false);//Javi
        this.bolitas[110] = new Bolita(12, 18, false);//Javi
        this.bolitas[111] = new Bolita(13, 18, false);//Javi
        this.bolitas[112] = new Bolita(14, 18, false);//Javi
        this.bolitas[113] = new Bolita(15, 18, false);//Javi

        this.bolitas[115] = new Bolita(12, 1, false); //cristi
        this.bolitas[116] = new Bolita(13, 1, false); //cristi
        this.bolitas[117] = new Bolita(14, 1, false); //cristi
        this.bolitas[118] = new Bolita(15, 1, false); //cristi
        this.bolitas[119] = new Bolita(15, 2, false); //cristi

        this.bolitas[120] = new Bolita(8, 1, false);// Alvaro Nuñez
        this.bolitas[125] = new Bolita(9, 1, false);// Alvaro Nuñez
        this.bolitas[126] = new Bolita(10, 1, false);// Alvaro Nuñez
        this.bolitas[127] = new Bolita(11, 1, false);// Alvaro Nuñez
        this.bolitas[128] = new Bolita(16, 12, false);// Alvaro Nuñez
        this.bolitas[129] = new Bolita(17, 12, true);// Alvaro Nuñez
        this.bolitas[130] = new Bolita(18, 12, false);// Alvaro Nuñez
        this.bolitas[131] = new Bolita(18, 13, false);// Alvaro Nuñez
        this.bolitas[132] = new Bolita(18, 14, false);// Alvaro Nuñez

        this.bolitas[133] = new Bolita(8, 4, false);//Edu Menea
        this.bolitas[134] = new Bolita(9, 4, false);//Edu Menea
        this.bolitas[135] = new Bolita(10, 4, false);//Edu Povea
        this.bolitas[136] = new Bolita(11, 4, false);//Edu Povea
        this.bolitas[137] = new Bolita(11, 5, true);//Edu Povea
        this.bolitas[138] = new Bolita(18, 15, false);//Edu Povea
        this.bolitas[139] = new Bolita(18, 16, false);//Edu Povea
        this.bolitas[140] = new Bolita(18, 17, false);//Edu Povea

        this.bolitas[141] = new Bolita(12, 6, false);//jaime
        this.bolitas[142] = new Bolita(12, 7, false);//jaime
        this.bolitas[143] = new Bolita(12, 8, false);//jaime
        this.bolitas[144] = new Bolita(14, 6, false);//jaime
        this.bolitas[145] = new Bolita(14, 7, false);//jaime
        this.bolitas[146] = new Bolita(15, 7, false);//jaime

        this.bolitas[147] = new Bolita(4, 18, false);//Slavador Cintado
        this.bolitas[148] = new Bolita(5, 18, false);//Salvador Cintado
        this.bolitas[149] = new Bolita(6, 18, false);//Salvador Cintado
        this.bolitas[150] = new Bolita(7, 18, false);//Salvador Cintado
        this.bolitas[151] = new Bolita(18, 9, false);//Salvador Cintado
        this.bolitas[26] = new Bolita(18, 10, false);//Salvador Cintado
        this.bolitas[38] = new Bolita(18, 11, false);//Salvador Cintado

        this.bolitas[40] = new Bolita(8, 7, false);//Adri
        this.bolitas[96] = new Bolita(9, 7, false);//Adri
        this.bolitas[97] = new Bolita(9, 8, false);//Adri
        this.bolitas[98] = new Bolita(10, 6, false);//Adri
        this.bolitas[99] = new Bolita(10, 7, false);//Adri
        this.bolitas[114] = new Bolita(11, 7, false);//Adri
        this.bolitas[121] = new Bolita(16, 18, false);//Adri
        this.bolitas[122] = new Bolita(17, 18, false);//Adri
        this.bolitas[123] = new Bolita(18, 18, true);//Adri

        this.bolitas[124] = new Bolita(14, 9, false);//Francisco
        this.bolitas[152] = new Bolita(15, 9, false);//Francisco
        this.bolitas[153] = new Bolita(15, 10, false);//Francisco
        this.bolitas[154] = new Bolita(15, 11, false);//Francisco

        //Tenemos las bolitas creadas, las metemos en mapa
        for (int i = 0; i < bolitas.length; i++) {
            //Según la posición de cada bolita, meto en el mapa
            //la bolita del array en esa posición
            this.mapa[bolitas[i].getPosX()][bolitas[i].getPosY()]
                    =bolitas[i];
        }
        
        this.fantasma=new Fantasma[4];
        //Los fantasmas, usando este constructor, ya se ponen en una posición fija
        this.fantasma[0]=new Fantasma('r');
        this.fantasma[1]=new Fantasma('b');
        this.fantasma[2]=new Fantasma('y');
        this.fantasma[3]=new Fantasma('p');
        
        //Tenemos los fantasmas creados, los metemos en el mapa
        for (int i = 0; i < fantasma.length; i++) {
            this.mapa[fantasma[i].getPosX()][fantasma[i].getPosY()]=
                    fantasma[i];
        }
        
        this.pacman=new Pacman();
        this.mapa[pacman.getPosX()][pacman.getPosY()]=pacman;
        
        //Ignoramos fruta por ahora
        
        
        
        
    }

    /*
    * @return devuelve el final del juego
     */
    public boolean finJuego() {

        if (this.pacman.getNumeroVidas() == 0
                || this.bolitas.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Laberinto() {
            this.inicializarMapa();
    }

    @Override
    public String toString() {
        String ret="";
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if(mapa[i][j]==null){
                    ret+=Constantes.verdePared+"# "+Constantes.reset;
                }else{
                    ret+=mapa[i][j].getSimbolo()+" ";
                }
                
            }
            ret+="\n";
        }
        return ret;
    }
    
    

}
