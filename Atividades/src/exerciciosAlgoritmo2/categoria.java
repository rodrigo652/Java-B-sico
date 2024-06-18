package exerciciosAlgoritmo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class categoria {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Empresa> empresas = new ArrayList<>();

		while (true) {
			System.out.println("Digite o código da empresa (0 para finalizar): ");
			int codigo = scanner.nextInt();
			if (codigo == 0) {
				break;
			}

			System.out.println("Digite o número de funcionários: ");
			int numeroFuncionarios = scanner.nextInt();

			System.out.println("Digite o porte da empresa (grande, media, pequena, micro): ");
			String porteStr = scanner.next().toUpperCase();

			Porte porte;
			try {
				porte = Porte.valueOf(porteStr);
			} catch (IllegalArgumentException e) {
				System.out.println("Porte inválido. Tente novamente.");
				continue;
			}

			empresas.add(new Empresa(codigo, numeroFuncionarios, porte));
		}

		Empresa maiorGrande = null;
		Empresa maiorMedia = null;
		Empresa maiorPequena = null;
		Empresa maiorMicro = null;

		for (Empresa empresa : empresas) {
			switch (empresa.porte) {
			case GRANDE:
				if (maiorGrande == null || empresa.numeroFuncionarios > maiorGrande.numeroFuncionarios) {
					maiorGrande = empresa;
				}
				break;
			case MEDIA:
				if (maiorMedia == null || empresa.numeroFuncionarios > maiorMedia.numeroFuncionarios) {
					maiorMedia = empresa;
				}
				break;
			case PEQUENA:
				if (maiorPequena == null || empresa.numeroFuncionarios > maiorPequena.numeroFuncionarios) {
					maiorPequena = empresa;
				}
				break;
			case MICRO:
				if (maiorMicro == null || empresa.numeroFuncionarios > maiorMicro.numeroFuncionarios) {
					maiorMicro = empresa;
				}
				break;
			}
		}

		System.out.println("Empresa com maior número de funcionários em cada categoria:");
		if (maiorGrande != null) {
			System.out.println("Grande: Código " + maiorGrande.codigo + " com " + maiorGrande.numeroFuncionarios
					+ " funcionários.");
		}
		if (maiorMedia != null) {
			System.out.println(
					"Média: Código " + maiorMedia.codigo + " com " + maiorMedia.numeroFuncionarios + " funcionários.");
		}
		if (maiorPequena != null) {
			System.out.println("Pequena: Código " + maiorPequena.codigo + " com " + maiorPequena.numeroFuncionarios
					+ " funcionários.");
		}
		if (maiorMicro != null) {
			System.out.println(
					"Micro: Código " + maiorMicro.codigo + " com " + maiorMicro.numeroFuncionarios + " funcionários.");
		}

		scanner.close();
	}
}
	

