package com.example.calculatemarkapp;

public class Mathematic {
    public float CalculateNeededFinalNoteToPass(float gecmeNotu, float vizeNotu, float vizeOrani){
        float vizeEtkisi = (vizeNotu*vizeOrani)/100;
        float gecmeEksiVizeEtkisi = gecmeNotu - vizeEtkisi;
        return (gecmeEksiVizeEtkisi*100)/(100-vizeOrani);

    }
}
