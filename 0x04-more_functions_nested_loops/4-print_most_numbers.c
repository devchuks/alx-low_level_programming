#include "main.h"
/**
 * main - entry point
 *
 * Return: alway returns 0
 *
 */
int main(void)
{
	int i;

	for (i = '0'; i < '10'; i++)
	{
		if (i == '2' || i == '4')
		{
			_putchar('');
		}
		else
		{
			_putchar(i);
		}
	}

	putchar('\n');
	return (0);
}
