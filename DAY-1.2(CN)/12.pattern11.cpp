
/* 
Pattern : 

****

1
2 3
4 5 6
7 8 9 10

*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter number of rows" << endl;
    cin >> n;

    int i = 1;
    int p = i;

    while (i <= n)
    {
        int j = 1;
        while (j <= i)
        {
            cout << p;
            j++;
            p++;
        }
        cout << endl;
        i++;
    }
}
