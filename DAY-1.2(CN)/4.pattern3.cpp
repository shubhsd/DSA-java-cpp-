
/* 
Pattern 2: 
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
    cout << "Enter number of rows to be printed\n";
    cin >> n;
    int i = 1;
    int val = 1;
    while (i <= n)
    {
        int k = 1;
        while (k <= (n - i))
        {
            cout << "-\t";
            k = k + 1;
        }
        int j = 1;
        while (j <= i)
        {
            cout << val<<"\t";
            j = j + 1;
            val = val + 1;
        }
        cout << endl;
        i = i + 1;
    }
}