
import java.util.Map;
import java.util.HashMap;

public class DistribuidoraFaturamento {
    public static void main(String[] args) {
        Map<String, Double> faturamentoDoEstado = new HashMap<>();

        faturamentoDoEstado.put("MG", 29229.88);
        faturamentoDoEstado.put("RJ", 36678.66);
        faturamentoDoEstado.put("SP", 67836.43);
        faturamentoDoEstado.put("ES", 27165.48);
        faturamentoDoEstado.put("Outros", 19849.53);

        double totalMensal = 0;
        for (double faturamento : faturamentoDoEstado.values()) {
            totalMensal += faturamento;
        }


        System.out.println("Porcentagem de representação de cada estado da distribuidora:");
        for  (String Estado : faturamentoDoEstado.keySet()) {
            double faturamento = faturamentoDoEstado.get(Estado);
            double porcentagem = (faturamento / totalMensal) * 100;

            System.out.println(Estado + ": " + String.format("%.2f", porcentagem) + "%");
        }
    }
}

