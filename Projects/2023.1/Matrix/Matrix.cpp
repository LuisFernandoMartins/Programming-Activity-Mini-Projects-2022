// Matrix.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include <iostream>
using namespace std;

int main()
{
    cout << "-----------------------------------" << endl;
    cout << "   Luis Fernando da Costa Matins   " << endl;
    cout << "-----------------------------------" << endl;
    cout << "             Matrizes              " << endl;
    cout << "-----------------------------------" << endl;

    int Linha = 0;
    int Coluna = 0;
    int mult;

    int [Linha][Coluna];
    
    cout << "Quantas linhas Você deseja? ";
    cin >> Linha;
  

    cout << ("Quantas colunas Você deseja? ");
    cin >> Coluna;
   

    cout << ("Por Qual Número Você deseja Multiplicar a Sua Matriz? ");
    cin >> mult;


     

    




    int Soma = 0;
    int Soma3 = 0;
    //------------------------------------------CRIAÇÃO DA MATRIZ----------------------------------------------------------------

    for (int l = 0; l < Linha; l++)
    {
        for (int c = 0; c < Coluna; c++)
        {
            Matriz[l][c] = new SecureRandom().nextInt(9 + 9) - 9;
        }
    }

    for (int l = 0; l < Linha; l++)
    {
        for (int c = 0; c < Coluna; c++)
        {
            cout >> printf("[ %d ]", Matriz[l][c]);
        }
        System.out.printf("%n");
    }

    for (int l = 0; l < Linha; l++)
    {

        for (int c = 0; c < Coluna; c++)
        {
            Soma = Soma + Matriz[l][c];


        }
        System.out.println();
        System.out.printf("A soma da Linha [%d] é : %d ", l + 1, Soma);

        Soma = 0;
    }

    for (int c = 0; c < Coluna; c++)
    {
        for (int l = 0; l < Linha; l++)
        {
            Soma3 = Soma3 + Matriz[l][c];
        }

        System.out.println();
        System.out.printf("A soma da Coluna [%d] é : %d ", c + 1, Soma3);



        Soma3 = 0;
    }
    System.out.println();

    //-------------------------------------------MATRIZ TRANSPOSTA---------------------------------------------------------------

    for (int c = 0; c < Coluna; c++)
    {
        for (int l = 0; l < Linha; l++)
        {

            System.out.printf("[ %d ]", Matriz[l][c]);
        }
        System.out.printf("%n");

    }
    System.out.println();

    //-------------------------------------------MATRIZ OPOSTA-------------------------------------------------------------------

    for (int l = 0; l < Linha; l++)
    {
        for (int c = 0; c < Coluna; c++)
        {

            System.out.printf("[ %d ]", -1 * (Matriz[l][c]));
        }
        System.out.printf("%n");
    }

    System.out.println();
    //-------------------------------------------MATRIZ MULTIPLICADA POR VALOR---------------------------------------------------

    for (int l = 0; l < Linha; l++)
    {
        for (int c = 0; c < Coluna; c++)
        {

            System.out.printf("[ %d ]", mult * (Matriz[l][c]));
        }
        System.out.printf("%n");
    }
    System.out.println();
    //-------------------------------------------MATRIZ SOMA--------------------------------------------------------------------- 

    for (int l = 0; l < Linha; l++)
    {
        for (int c = 0; c < Coluna; c++)
        {

            System.out.printf("[ %d ]", (Matriz[l][c]) + (Matriz[l][c]));
        }
        System.out.printf("%n");
    }
    System.out.println();

    //-------------------------------------------MATRIZ SUBTRAÇÃO----------------------------------------------------------------

    for (int l = 0; l < Linha; l++)
    {
        for (int c = 0; c < Coluna; c++)
        {

            System.out.printf("[ %d ]", (Matriz[l][c]) - (Matriz[l][c]));
        }
        System.out.printf("%n");
    }
    System.out.println();

    return 0;
}

// Executar programa: Ctrl + F5 ou Menu Depurar > Iniciar Sem Depuração
// Depurar programa: F5 ou menu Depurar > Iniciar Depuração

// Dicas para Começar: 
//   1. Use a janela do Gerenciador de Soluções para adicionar/gerenciar arquivos
//   2. Use a janela do Team Explorer para conectar-se ao controle do código-fonte
//   3. Use a janela de Saída para ver mensagens de saída do build e outras mensagens
//   4. Use a janela Lista de Erros para exibir erros
//   5. Ir Para o Projeto > Adicionar Novo Item para criar novos arquivos de código, ou Projeto > Adicionar Item Existente para adicionar arquivos de código existentes ao projeto
//   6. No futuro, para abrir este projeto novamente, vá para Arquivo > Abrir > Projeto e selecione o arquivo. sln
