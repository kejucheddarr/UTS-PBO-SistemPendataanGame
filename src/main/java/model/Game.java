/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Game {
    public static int hitungId = 7;
    protected int idGame;
    protected String namaGame;
    protected String console;
    protected String genre;
    protected int tahunRilis;
    
    //konstruktor
    public Game(int idGame, String namaGame, String console, String genre, int tahunRilis) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.console = console;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }
    
    public Game(String namaGame, String console, String genre, int tahunRilis) {
        this.namaGame = namaGame;
        this.console = console;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
    }
    
    //getter
    public int getIdGame() {
        return idGame;
    }
    public String getNamaGame() {
        return namaGame;
    }
    public String getConsole() {
        return console;
    }
    public String getGenre() {
        return genre;
    }
    public int getTahunRilis() {
        return tahunRilis;
    }
    
    //setter
    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }
    public void setNamaGame(String namaGame) {
        this.namaGame = namaGame;
    }
    public void setConsole(String console) {
        this.console = console;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
    
    //method perilaku rilis
    public void tampilkanInfo() {
        System.out.println("ID Game       : " + idGame);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Console       : " + console);
        System.out.println("Genre         : "+ genre);
        System.out.println("Tahun Rilis   : " + tahunRilis);
    }
}
