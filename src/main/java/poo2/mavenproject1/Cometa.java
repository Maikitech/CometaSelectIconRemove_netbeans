/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.mavenproject1;

/**
 * @author maiki.scalvi
 */
public class Cometa {

 private int ano;
 private String nome;
 private boolean foiRegistrado;

 public Cometa(int ano, String nome, boolean foiRegistrado) {
 this.ano = ano;
 this.nome = nome;
 this.foiRegistrado = foiRegistrado;
 }

 public int getAno() {
 return ano;
 }

 public void setAno(int ano) {
 this.ano = ano;
 }

 public String getNome() {
 return nome;
 }

 public void setNome(String nome) {
 this.nome = nome;
 }

 
 public boolean isFoiRegistrado() {
 return foiRegistrado;
 }

 public void setFoiRegistrado(boolean foiRegistrado) {
 this.foiRegistrado = foiRegistrado;
 }
}
