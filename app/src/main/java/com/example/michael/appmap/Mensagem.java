package com.example.michael.appmap;

/**
 * Created by Michael on 28/05/2016.
 */
public class Mensagem {
	
	 public void exibirMensagemDeConfirmacao(){
        final AlertDialog.Builder alertaConfimacaoBuilder = new AlertDialog.Builder(this);

        alertaConfimacaoBuilder.setTitle("Sucesso");
        alertaConfimacaoBuilder.setMessage("Ocorrência incluída com sucesso.");

        alertaConfimacaoBuilder.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertaConfirmacao = alertaConfimacaoBuilder.create();
        alertaConfirmacao.show();
    }

    public void exibirMensagemDeRejeicao(){
        final AlertDialog.Builder alertaRejeicaoBuilder = new AlertDialog.Builder(this);

        alertaRejeicaoBuilder.setTitle("Falha");
        alertaRejeicaoBuilder.setMessage("Titulo inválido.");

        alertaRejeicaoBuilder.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertaRejeicao = alertaRejeicaoBuilder.create();
        alertaRejeicao.show();
    }
   
	}

