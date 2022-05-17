#include <iostream>
int **global = NULL;

void f(int *add){
    static int a = *add;
    int *b = new int ;
    *(char *)add = *(char *)"mark";
    a = 5;
    int y = a;
}

int main() {
    int bonus = 1000;
    int *alias2bonus = &bonus;
    *alias2bonus = 2000;
    global = & alias2bonus;
    **global = 3000;
    f(alias2bonus);
    std::cout << &bonus << ", " << bonus << std::endl;
    return 0;
}
