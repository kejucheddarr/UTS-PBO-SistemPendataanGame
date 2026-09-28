/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class GameFisik extends Game {
    protected String kondisi;
    protected String jenisMedia;
    
    public GameFisik(int idGame, String namaGame, String console, String genre, int tahunRilis, String kondisi, String jenisMedia) {
        super(idGame, namaGame, console, genre, tahunRilis);
        this.kondisi = kondisi;
        this.jenisMedia = jenisMedia;
    }
    
    public GameFisik(String namaGame, String console, String genre, int tahunRilis, String kondisi, String jenisMedia) {
        super(namaGame, console, genre, tahunRilis);
        this.kondisi = kondisi;
        this.jenisMedia = jenisMedia;
    }
    
    //getter
    public String getKondisi() {
        return kondisi;
    }
    public String getJenisMedia() {
        return jenisMedia;
    }
    
    //setter
    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    public void setJenisMedia(String jenisMedia) {
        this.jenisMedia = jenisMedia;
    }
    
    //method
    @Override
    public void tampilkanInfo() {
        System.out.println("----------------------------");
        System.out.println("Game Fisik");
        super.tampilkanInfo();
        System.out.println("Kondisi       : " + kondisi);
        System.out.println("Jenis Media   : " + jenisMedia);
    }
}
