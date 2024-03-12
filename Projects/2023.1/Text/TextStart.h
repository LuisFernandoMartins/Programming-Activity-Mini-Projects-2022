
#pragma once

#include <iostream>
#include "TextHeader.h"


void TextStartAlow()
{
	int op = 0;
	std::cout << "1 - Jogar\n";
	std::cout << "2 - Salvar\n";
	std::cout << "3 - Recarregar";
	std::cout << "4 - Sair\n";
	std::cin >> op;
		switch (op) 
		{
			case 1: std::cout << "Você está jogando Battle Beats\n";
				break;
			case 2: std::cout << "Jogo Salvo\n";
				break;
			case 3: std::cout << "Sistema de recarga FALHOU\n";
				break;
			case 4:
				break;
		}
}