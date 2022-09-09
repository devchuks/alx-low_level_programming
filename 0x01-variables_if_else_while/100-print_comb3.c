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
		for (j = 10; j < 20; i++)
		{
			if ((j % 10) > (i % 10))
			{
				putchar((i % 10) + '0');
				putchar((j % 10) + '0');
				if (i > 20 || j > 19)
				{
					puts(',');
					puts(' ');
				}
			}
		}
	}
	puts('\n');
	return (0);
}
