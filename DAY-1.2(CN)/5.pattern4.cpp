
/* 
Pattern : 
1
2 3
3 4 5
4 5 6 7
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
        int val = i;
        while (j <= i)
        {
            cout << val;
            j = j + 1;
            val = val + 1;
        }
        cout << endl;
        i = i + 1;
    }
}
