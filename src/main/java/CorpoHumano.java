package main.java;

public class CorpoHumano {
    public float massa; 
    private float volume;
    private float densidade;
    private double altura;

    public CorpoHumano(float massa, float volume, float densidade, double altura){
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public float getMassa(){
         return this.massa;
    }
    public float getVolume(){
         return this.volume;
    }
    public float getDensidade(){
         return this.densidade;
    }
    public double getAltura(){
         return this.altura;
    }

    public void setMassa(float m){
        this.massa = m;
    }
    private void setVolume(float v){
        this.volume = v;
    }
    public void setDensidade(float d){
        this.densidade = d;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    public double calcularIMC(){
        return this.massa / (this.altura * this.altura);
    }

}
