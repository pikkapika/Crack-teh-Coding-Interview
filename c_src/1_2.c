#include<stdio.h>

void reverse(char *str)
{
	char *end = str;
	char tmp;
	if(str)
	{
		while(*end) {
			++end;
		}
		--end;
		while(str<end) {
			tmp = *str;
			*str++ = *end;
			*end-- = tmp;
		}
	}
}

int main()
{
	char s[] = "test";
	printf("input = %s\n", s);
	reverse(s);
	printf("output = %s\n", s);
}
