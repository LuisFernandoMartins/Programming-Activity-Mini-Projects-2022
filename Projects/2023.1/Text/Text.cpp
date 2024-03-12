// Text.cpp : Este arquivo contém a função 'main'. A execução do programa começa e termina ali.
//

#include <iostream>
#include <fstream>
#include "TextHeader.h"
#include "TextStart.h"

int main()
{

	
	TextStartAlow();
		
	


	std::ofstream Archive_;
	
	Archive_.open("MyGDD.txt");

	std::cout << "Projeto de TCC\n";


	std::cout << "Curso de Jogos Digitais\n";


	std::cout << "Plataforma\n";


	std::cout << "PC\n";


	std::cout << "Faixa Etária\n";

	std::cout << "Juvenil\n";


	std::cout << "Classificaçao\n";


	std::cout << "Não recomendado para menores de 14 anos\n";


	std::cout << "Contem : Violencia, Drogas licitas, Apologia a abusos\n";


	std::cout << "Genero\n";


	std::cout << "Luta, Ritmo, 2D\n";



	std::cout << "Publico - alvo\n";


	std::cout << "Apreciadores de Rock indie / Eletrônico\n";


	std::cout << "Apreciadores de jogos de luta em 2D;\n";


	std::cout << "Jogadores de estilos musicais diversos;\n";

	std::cout << "Características gerais\n";

	std::cout << "Jogos 2D\n";


	std::cout << "Combate no ritmo da musica.\n";


	std::cout << "Realização de combos em cenarios 2D\n";


	std::cout << "Características multiplayer\n";

	std::cout << "- N/A\n";


	std::cout << "Resumo da historia\n";


	std::cout << "Diferenciais de vendas\n";

	std::cout << "Os diferenciais de vendas vem do fato de o jogo Battle Beats apresentar uma proposta única no mercado, juntando o nicho de luta com rítmica 2D, apresentando correntes de batalhas 1 vs NPC ao som da música.\n";


	std::cout << "Battle Beats apresenta a junçao das mecanicas de combate de seu concorrente e transforma elas parcialmente em um jogo de batalha, podendo ser colocado em editor de fases, possuindo músicas originais e licenciadas baseado em Rock,\n";


	std::cout << "Produtos concorrentes\n";


	std::cout << "One Finger Death Punch\n";


	std::cout << "Hi-Fi Rush\n";


	std::cout << "Objetivos\n";


	std::cout << "Eliminar os inimigos que aparecerem na tela, com o Objetivo de marcar Combos / Pontos e passar de fase, tendo em vista que, cada vez mais inimigos e musicas irao sendo liberados.\n";

	Archive_.close();
	
	
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
