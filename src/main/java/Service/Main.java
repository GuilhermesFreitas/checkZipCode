package Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import dto.Address;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiService apiService = new ApiService();


        System.out.println("\n---Sistema de Consulta de CEP📍 ---");
        System.out.println("Digite um CEP válido com 8 dígitos (ex: 01001000 ou 01001-000).");
        System.out.println("Digite 'sair' para encerrar o programa.");

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nDigite o CEP: ");
            String cep = scanner.nextLine().trim().replaceAll("-", "");

            if (cep.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (!isValidCep(cep)) {
                System.out.println("⚠️ CEP inválido! Digite um CEP válido com 8 números.");
            } else {
                try {
                    Address address = apiService.getAddress(cep);

                    if (address == null || address.getCep() == null) {
                        System.out.println("❌ CEP não encontrado. Verifique se digitou corretamente ou tente outro CEP.");
                    } else {
                        System.out.println("\n📍 Endereço encontrado:\n" + formatAddress(address));
                    }
                } catch (JsonProcessingException e) {
                    System.out.println("❌ Erro ao processar os dados do CEP. A API pode estar instável. Tente novamente mais tarde.");
                } catch (IOException e) {
                    System.out.println("❌ Erro de conexão. Verifique sua internet e tente novamente.");
                } catch (InterruptedException e) {
                    System.out.println("❌ Erro inesperado ao buscar o CEP. Tente novamente.");
                    Thread.currentThread().interrupt();
                }
            }
            continuar = askRetry(scanner);
        }
        scanner.close();
    }

    private static boolean isValidCep(String cep) {
        return cep.matches("\\d{8}");
    }

    private static String formatAddress(Address address) {
        return String.format(
                "CEP: %s\nLogradouro: %s\nBairro: %s\nCidade: %s - %s\nDDD: %s\nIBGE: %s",
                address.getCep(),
                address.getLogradouro(),
                address.getBairro(),
                address.getLocalidade(),
                address.getUf(),
                address.getDdd(),
                address.getIbge()
        );
    }

    private static boolean askRetry(Scanner scanner) {
        System.out.print("Deseja tentar novamente? (sim/não): ");
        String resposta = scanner.nextLine().trim().toLowerCase();
        return resposta.equals("sim");
    }
}
