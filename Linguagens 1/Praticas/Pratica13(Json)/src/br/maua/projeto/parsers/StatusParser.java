package br.maua.projeto.parsers;

import br.maua.enumeracoes.Status;

public class StatusParser {
    public static Status toStatus(String status){
        if(status.equals("Platinado")) return Status.PLATINADO;
        if(status.equals("Não Iniciado")) return Status.NAO_INICIADO;
        if(status.equals("Terminado")) return Status.TERMINADO;
        if(status.equals("Jogando")) return Status.JOGANDO;
        else return Status.ABANDONADO;
    }
}
