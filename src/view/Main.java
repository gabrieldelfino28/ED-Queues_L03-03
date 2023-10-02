package view;

import controller.EscalonadorController;
import model.Processo;

import model.Queue;
import java.util.Random;

public class Main {
    static String[] names = {"notepad.exe", "write.exe", "chrome.exe", "acrobat.exe", "firefox.exe", "word.exe"};
    static Random random = new Random();
    public static void main(String[] args) {
        // write your code here
        Processo[] processo = new Processo[6];

        inserting(processo);
        Queue<Processo> fila = new Queue<>();
        for (Processo aux : processo) {
            fila.insert(aux);
        }
        EscalonadorController ec = new EscalonadorController();
        try{
            ec.QueueController(fila);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void inserting(Processo[] processos) {
        for(int i = 0; i < names.length; i++){
            processos[i] = new Processo();
            processos[i].nome = names[i];
            processos[i].QtdRetornos = (random.nextInt(5,10));
        }
    }
}
