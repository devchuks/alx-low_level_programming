#include <stdio.h>
/**
 * main - entry
 * Return: 0
 */
int main(void)
{
	int i;
	int j;

	for (i = 10; i < 20; i++)
	{
		for (j = 10; j < 20; j++)
		{
			if ((j % 10) > (i % 10))
			{
				putchar((i % 10) + '0');
				putchar((j % 10) + '0');
				if (i != 19 || j != 18)
				{
					putchar(',');
					putchar(' ');
				}
			}
		}
	}
	putchar('\n');
	return (0);
}
