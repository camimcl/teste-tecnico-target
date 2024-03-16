import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//QUESTAO 3 
public class Faturamento {
    public static void main(String[] args) throws IOException {
        
            String dadosFaturamento = new String(Files.readAllBytes(Paths.get("src/dados.json")));
            JSONArray jsonArray = new JSONArray(dadosFaturamento);
            System.out.println(jsonArray);
            double menorFaturamento = 0;
            double maiorFaturamento =0;

            double totalDoFaturamento = 0;
            int qntdDiasComFaturamento = 0;

            // para iteração de todos os elementos do jsonArray
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                // System.out.println(jsonObject);
                // System.out.println(jsonArray.length());
                double valorFaturamento = jsonObject.getDouble("valor");
                int dia = jsonObject.getInt("dia");

                // caso haja faturamento
                if (valorFaturamento > 0) {
                    totalDoFaturamento += valorFaturamento;
                    qntdDiasComFaturamento++;
                }

                // comparaçoes para atualizar menor e o maior valor de faturamento
                if (valorFaturamento < menorFaturamento) {
                    menorFaturamento = valorFaturamento;
                }
                if (valorFaturamento > maiorFaturamento) {
                    maiorFaturamento = valorFaturamento;
                }
                
            }

            double mediaMensal = totalDoFaturamento / qntdDiasComFaturamento;
            int qntdDiasFaturamentoAcimaDaMedia = 0;

            // para verificar dias com faturamento superior à média
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                double valorFaturamento = jsonObject.getDouble("valor");
                if (valorFaturamento > mediaMensal) {
                    qntdDiasFaturamentoAcimaDaMedia++;
                }
            }

          //resultados XD
            System.out.println("O Menor faturamento foi de: R$" + menorFaturamento);
            System.out.println("O Maior faturamento foi de : R$" + maiorFaturamento);
            System.out.println("Obtivera faturamento acima da média em: " + qntdDiasFaturamentoAcimaDaMedia+" dias");
       
    }
}