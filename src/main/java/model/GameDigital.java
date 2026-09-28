/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class GameDigital extends Game {
    protected String ukuranFile;
    protected String platformStore;
    
    public GameDigital(int idGame, String namaGame, String console, String genre, int tahunRilis, String ukuranFile, String platformStore) {
        super(idGame, namaGame, console, genre, tahunRilis);
        this.ukuranFile = ukuranFile;
        this.platformStore = platformStore;
    }
    
    public GameDigital(String namaGame, String console, String genre, int tahunRilis, String ukuranFile, String platformStore) {
        super(namaGame, console, genre, tahunRilis);
        this.ukuranFile = ukuranFile;
        this.platformStore = platformStore;
    }
    
    //getter
    public String getUkuranFile() {
        return ukuranFile;
    }
    public String getPlatformStore() {
        return platformStore;
    }
    
    //setter
    public void setUkuranFile(String ukuranFile) {
        this.ukuranFile = ukuranFile;
    }
    public void setPlatformStore(String platformStore) {
        this.platformStore = platformStore;
    }
    
    //methodddddd
    @Override
    public void tampilkanInfo() {
        System.out.println("----------------------------");
        System.out.println("Game Digital");
        super.tampilkanInfo();
        System.out.println("Ukuran File   : " + ukuranFile);
        System.out.println("Platform Store: " + platformStore);
    }
}
