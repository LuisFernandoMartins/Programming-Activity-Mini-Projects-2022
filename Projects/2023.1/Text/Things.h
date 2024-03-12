#pragma once

#include <iostream>
#include "TextHeader.h"
#include "Menu.h"
#include "Credits.h"

void ThingsAwakening()
{

	int op = 0;
	std::cout << "1 - Ir para Menu\n";
	std::cout << "2 - Mostrar GDD\n";
	std::cout << "3 - Mostrar Creditos\n";
	std::cout << "4 - Sair\n";
	std::cin >> op;

	switch (op) 
	{
	case 1: Menu();
		break;
	case 2: BattleBeatsGit();
		break;
	case 3: Credits();
		break;
	}

}

