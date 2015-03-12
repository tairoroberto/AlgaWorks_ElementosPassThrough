package br.com.trmasolucoes.elementospassthrough;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Created by tairo on 12/03/15.
 */

@ManagedBean
@ViewScoped
public class ElementosPasstrhoughBean {

    private String nome;
    private String cor;

    public void exibir(){
        System.out.println("Nomw: " + nome +" Cor: " + cor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
