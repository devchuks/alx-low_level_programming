#include "main.h"

/**
 * print_line - prints a literal underscore
 * @n: the number of times
 */

void print_line(int n)
{
	int i = n;

	for (i = n; i > 0; i--)
		_putchar('_');
	_putchar('\n');
}
