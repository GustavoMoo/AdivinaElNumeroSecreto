/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gusta
 */
public class Juego {
      NumeroSecreto NumeroSecreto;
    int limiteinferior;
    int limiteSuperior;
    int numeroDeIntentos;
    int intentosRealizados;
    
   private static final int LIM_INF_PREDET = 1;
   private static final int LIM_SUP_PREDET = 100;
   public void setRangoDelNumeroSecreto(int limiteInferior, int limiteSuperior) {
   this.limiteinferior = limiteInferior;
   this.limiteSuperior = limiteSuperior;
   NumeroSecreto.setRango(this.limiteinferior, this.limiteSuperior);
 }
   public Juego(int limiteInferior, int limiteSuperior, int intentos) {
    this.limiteinferior = limiteInferior;
    this.limiteSuperior = limiteSuperior;
    this.numeroDeIntentos = intentos;
    this.NumeroSecreto = new NumeroSecreto(this.limiteinferior, this.limiteSuperior);
    this.intentosRealizados = 0;
  
 }
public void setNumeroDeIntentos(int intentos) {
    this.numeroDeIntentos = intentos;
 }
 public boolean esElNumeroSecreto(int numero) {
    this.intentosRealizados++;
    return NumeroSecreto.esIgual(numero);
 }
 public boolean puedeIntentarDeNuevo() {
    boolean hayMasOportunidades = this.intentosRestantes() > 0;
    return hayMasOportunidades;
 }
 public int intentosRestantes() {
   int numeroDeIntentosRestantes = this.numeroDeIntentos - this.intentosRealizados;
   return (numeroDeIntentosRestantes);
 }
  public String getTextoDeAyuda(int numero) {
 String texto = null;
    if (this.NumeroSecreto.esMayor(numero) == true) {
 texto = "mayor";
 }
   else if (this.NumeroSecreto.esMenor(numero) == true) {
 texto = "menor";
 }
   return texto;
 }
  public int getNumeroSecreto() {
return this.NumeroSecreto.getNumeroSecreto();

  }
  
}
