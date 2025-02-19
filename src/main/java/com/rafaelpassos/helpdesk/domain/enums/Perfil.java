package com.rafaelpassos.helpdesk.domain.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Perfil {

    ADMIN(0,"ROLE_ADMIN"), CLIENTE(1,"ROLE_CLIENTE"), TECNICO(2,"ROLE_TECNICO");


    private Integer codigo;

    private String descricao;

    Perfil(Integer codigo,String descricao) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toenum(Integer cod){
        if(cod==null){
            return null;
        }

        for (Perfil x : Perfil.values()) {
            if(cod.equals(x.getCodigo())){
            return x;

            }
        }
throw new IllegalArgumentException("Perfil Inválido");


        }


}
