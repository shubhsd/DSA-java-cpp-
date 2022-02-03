
/*
Pattern :
E
DE
CDE
BCDE
ABCDE
 */


// Approach 1

// #include <iostream>
// using namespace std;

// int main()
// {
//     int n;
//     cout << "Enter number of rows" << endl;
//     cin >> n;

//     int i = n;

//     while (i >=1)
//     {
//         int j = i;
//         // char startChar = 'A' + n;
//         while (j <= n)
//         {
//             char ch = 'A' + j - 1;
//             cout << ch;
//             j++;
//         }
//         cout << endl;
//         i--;
//     }
// }

// Approach 2

#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int i = 1;
    while (i <= n)
    {
        int j = 1;
        char startChar = 'A' + (n-i);
        while (j <= i)
        {
            char ch = startChar + j - 1;
            cout << ch;
            j++;
        }
        cout << endl;
        i++;
    }
}

