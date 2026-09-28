/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import java.util.ArrayList;
import model.Game;
import model.GameFisik;
import model.GameDigital;

/**
 *
 * @author HP
 */
public class PendataanGame {

    public static void main(String[] args) {
        ArrayList<Game> koleksiGame = new ArrayList<>();
        
        koleksiGame.add(new GameFisik(1, "Pokemon HeartGold", "Nintendo DS", "RPG", 2009, "Baik", "Cartridge"));
        koleksiGame.add(new GameFisik(2, "The World Ends With You", "Nintendo DS", "RPG", 2007, "Baik", "Cartridge"));
        koleksiGame.add(new GameFisik(3, "Minecraft PS3 Edition", "Playstation 3", "Sandbox", 2013, "Baik", "Disk"));
        koleksiGame.add(new GameDigital(4, "Terraria", "Android", "RPG", 2011, "750 MB", "Google Playstore"));
        koleksiGame.add(new GameDigital(5, "Project Eden's Garden", "PC", "Horror RPG", 2022, "15 GB", "Itch.io"));
        koleksiGame.add(new GameDigital(6, "Undertale", "PC", "RPG", 2015, "1 GB", "Steam" ));
        
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;
        while(berjalan) {
            System.out.println("\n=========================");
            System.out.println("[" + " SISTEM PENDATAAN GAME " + "]");
            System.out.println("=========================");
            System.out.println("1. Tampilkan Koleksi Game");
            System.out.println("2. Tambahkan Game Baru");
            System.out.println("3. Ubah Data Game");
            System.out.println("4. Hapus Game");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu (1-5): ");
            
            //opsi
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                switch(pilihan) {
                    case 1 ->{
                        System.out.println("\n=== Daftar Koleksi Game ===");
                        for(Game a : koleksiGame) {
                            a.tampilkanInfo();
                        }
                    }
                    case 2->{
                        System.out.println("\n === Tambahkan Game Baru ===");
                        System.out.println("Game Fisik atau Game Digital?");
                        System.out.println("1. Game Fisik");
                        System.out.println("2. Game Digital");
                        System.out.println("Pilih: ");
                        
                        int jenisGame = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(jenisGame == 1) {
                            System.out.print("Nama Game     : ");
                            String namaGame = scanner.nextLine();
                            System.out.print("Console       : ");
                            String console = scanner.nextLine();
                            System.out.print("Genre         : ");
                            String genre = scanner.nextLine();
                            System.out.print("Tahun Rilis   : ");
                            int tahunRilis = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Kondisi       : ");
                            String kondisi = scanner.nextLine();
                            System.out.print("Jenis Media   : ");
                            String jenisMedia = scanner.nextLine();
                            
                            GameFisik game = new GameFisik(namaGame, console, genre, tahunRilis, kondisi, jenisMedia);
                            game.setIdGame(Game.hitungId++);
                            koleksiGame.add(game);
                            
                            System.out.println(">> Game fisik berhasil ditambahkan!");
                        } else if(jenisGame == 2) {
                            System.out.print("Nama Game     : ");
                            String namaGame = scanner.nextLine();
                            System.out.print("Console       : ");
                            String console = scanner.nextLine();
                            System.out.print("Genre         : ");
                            String genre = scanner.nextLine();
                            System.out.print("Tahun Rilis   : ");
                            int tahunRilis = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ukuran File   : ");
                            String ukuranFile = scanner.nextLine();
                            System.out.print("Platform Store: ");
                            String platformStore = scanner.nextLine();
                            
                            GameDigital game = new GameDigital(namaGame, console, genre, tahunRilis, ukuranFile, platformStore);
                            game.setIdGame(Game.hitungId++);
                            koleksiGame.add(game);
                            
                            System.out.println(">> Game digital berhasil ditambahkan!");
                        } else {
                            System.out.println(">> Pilihan tidak tersedia.");
                        }
                    }
                    case 3->{
                        System.out.println("\n=== Ubah Data Game ===");
                        System.out.println("Masukkan Nama Game yang ingin diubah: ");
                        String namaCari = scanner.nextLine();
                        
                        Game gameDitemukan = null;
                        for(Game game : koleksiGame) {
                            if(game.getNamaGame().equalsIgnoreCase(namaCari)) {
                                gameDitemukan = game;
                                break;
                            }
                        }
                        if(gameDitemukan == null) {
                            System.out.println(">> Game dengan nama tersebut tidak ditemukan.");
                            
                        } else {
                            System.out.println("\nData game ditemukan!");
                            gameDitemukan.tampilkanInfo();
                            
                            System.out.println("\n=== Masukkan Data Baru ===");
                            System.out.print("Nama Game     : ");
                            String namaGame = scanner.nextLine();
                            System.out.print("Console       : ");
                            String console = scanner.nextLine();
                            System.out.print("Genre         : ");
                            String genre = scanner.nextLine();
                            System.out.print("Tahun Rilis   : ");
                            int tahunRilis = scanner.nextInt();
                            scanner.nextLine();
                            
                            gameDitemukan.setNamaGame(namaGame);
                            gameDitemukan.setConsole(console);
                            gameDitemukan.setGenre(genre);
                            gameDitemukan.setTahunRilis(tahunRilis);
                            
                            if (gameDitemukan instanceof GameFisik) {
                                GameFisik gameFisik = (GameFisik) gameDitemukan;
                                
                                System.out.print("Kondisi       : ");
                                String kondisi = scanner.nextLine();
                                System.out.print("Jenis Media   : ");
                                String jenisMedia = scanner.nextLine();
                                
                                gameFisik.setKondisi(kondisi);
                                gameFisik.setJenisMedia(jenisMedia);
                            } else if (gameDitemukan instanceof GameDigital) {
                                GameDigital gameDigital = (GameDigital) gameDitemukan;
                                
                                System.out.print("Ukuran File   : ");
                                String ukuranFile = scanner.nextLine();
                                System.out.print("Platform Store: ");
                                String platformStore = scanner.nextLine();
                            }
                            System.out.println(">> Data game berhasil diubah!");
                        }
                    }
                    case 4->{
                        System.out.println("\n=== Hapus Game ===");
                        
                        System.out.println("Masukkan Nama Game yang ingin dihapus: ");
                        String namaCari = scanner.nextLine();
                        
                        Game gameDitemukan = null;
                        
                        for(Game game : koleksiGame) {
                            if(game.getNamaGame().equalsIgnoreCase(namaCari)) {
                                gameDitemukan = game;
                                break;
                            }
                        }
                        if(gameDitemukan == null) {
                            System.out.println(">> Game dengan nama tersebut tidak ditemukan.");
                        } else {
                            System.out.println("\nData game ditemukan: ");
                            gameDitemukan.tampilkanInfo();
                            System.out.println("\nYakin ingin menghapus game ini? (yes/no): ");
                            String konfirmasi = scanner.nextLine();
                            
                            if(konfirmasi.equalsIgnoreCase("yes")) {
                                koleksiGame.remove(gameDitemukan);
                                System.out.println(">> Game berhasil dihapus!");
                            } else if (konfirmasi.equalsIgnoreCase("no")) {
                                System.out.println(">> Penghapusan game dibatalkan.");
                            } else {
                                System.out.println(">> Input tidak valid. Penghapusan dibatalkan.");
                            }
                        }
                    }
                    case 5 ->{
                        berjalan = false;
                        System.out.println(">> Program Selesai.");
                    }
                    default ->{
                        System.out.println(">> Pilihan tidak tersedia.");
                    }
                }
            } catch(java.util.InputMismatchException e) {
                System.out.println(">> Input harus berupa angka!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
