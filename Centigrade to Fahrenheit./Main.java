#include <stdio.h>

int main()
{
    float celsius, fahrenheit;

    /* Input temperature in celsius */
  //  printf("Enter temperature in Celsius: ");
    scanf("%f", &celsius);

    /* celsius to fahrenheit conversion formula */
    fahrenheit = (celsius * 9 / 5) + 32;

    printf("%.2f",fahrenheit);

    return 0;
}