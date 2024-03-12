#pragma once

#include <iostream>
#include <windows.h>

void Credits()
{
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);

	SetConsoleTextAttribute(h, 4);
	std::cout << "Luis Fernando Martins\n";


}