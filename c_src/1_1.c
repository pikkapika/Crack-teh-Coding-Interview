#include<stdio.h>

int main()
{
	char s[] = "strings";
	printf("input: %s\n", s);

	int i,j;
	for(i=0; i < sizeof(s) - 1; i++)
	{
		for(j=i+1; j < sizeof(s); j++)
		{
			if(s[i] == s[j])
			{
				printf("%c is duplicated\n", s[i]);
				return;
			}		
		}
	}
	printf("no duplication found\n");
}
