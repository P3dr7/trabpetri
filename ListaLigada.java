/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabquinta;

/**
 *
 * @author pedro
 */
public class ListaLigada<T> {
    private No<T> primeiro;
    private int tamanho;

    public ListaLigada() {
        primeiro = null;
        tamanho = 0;

    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionaInicio(T conteudo) {
       if(tamanho==0){
        No<T> novoNo = new No<T>(null, conteudo, null);
        primeiro = novoNo;
        tamanho++;

       }else {
           No<T> atual = primeiro;
       }
    }
    public void adicionaFinal(T conteudo) {
        No<T> novoNo = new No<T>(null, conteudo, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    private No<T> ant() {
        No<T> antes = primeiro;
        while (antes.getProximo() != null) {
            antes = antes.getProximo();
        }
        return antes;
    }

    public void cresc() {
        if (tamanho != 0) {
        int cont = 0;
        int aux =0;
        No<T> atual = primeiro;
        cont = 0;
        while (atual.getProximo() != null) {
          System.out.println("O conteúdo do nó na posição " + cont + " é igual a: " + atual.getConteudo());
          atual = atual.getProximo();
          cont++;
        }
        System.out.println("O conteúdo do nó na posição " + cont + " é igual a: " + atual.getConteudo());
      } else {
        System.out.println("Não existe nenhum elemento na lista.");
      }
    }

    public void decres() {
         if (tamanho != 0) {       
        int cont= 0;
        No<T> atual = primeiro;
        while (atual.getProximo() != null) {
          atual = atual.getProximo();
          cont++;
        }
        while (atual.getAnterior() != null) {
          System.out.println("O conteúdo do nó na posição " + cont + " é igual a: " + atual.getConteudo());
          atual = atual.getAnterior();
          cont--;
        }
             System.out.println("O conteúdo do nó na posição "+ cont + " é igual a: "+ atual.getConteudo());
      }else {
             System.out.println("Não Existe nenhum elemento na lista");
         }
    }

    public void Final(T conteudo) {
        No<T> novoNo = new No<T>(null, conteudo, null);
        if (tamanho == 0) {
            primeiro = novoNo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    public void Inicio(T conteudo) {
        No<T> novoNo = new No<T>(null, conteudo, null);
        primeiro = novoNo;
        tamanho++;
    }

    public void mostrarNos() {
        if (tamanho != 0) {
            No<T> atual = primeiro;
            int contador = 0;
            while (atual.getProximo() != null) {
                System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
                atual = atual.getProximo();
                contador++;
            }
            System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
        } else {
            System.out.println("Não existe ");
        }
    }

}