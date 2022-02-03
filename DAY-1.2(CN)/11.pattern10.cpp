
/* 
Pattern : 

****

1
23
345
4567

*/

#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter number of rows" << endl;
    cin >> n;

    int i = 1;

    while (i <= n)
    {
        int j = 1;
        int p = i;
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
