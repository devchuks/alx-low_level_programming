#include "main.h"

/**
 * find_root - find square root of n, starting from the smallest possible, 0
 * @number: n
 * @sqroot: test this root
 * Return: natural square root, or -1 if not natural root
 */

int find_root(int number, int sqroot)
{
	if (sqroot * sqroot > number)
		return (-1);

	if (sqroot * sqroot == number)
		return (sqroot);

	return (find_root(number, sqroot + 1));
}

/**
 * _sqrt_recursion - find natural square root of n
 * @n: n
 * @number: n
 * Return: natural square root, or -1 if not natural root
 */

int _sqrt_recursion(int n)
{
	int number = n;

	if (n < 0)
		return (-1);

	return (find_root(n, 0));
}
