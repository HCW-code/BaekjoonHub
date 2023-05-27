#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    string s = "abcdefghijklmnopqrstuvwxyz";

    string input;
    cin >> input;
    for(int i = 0; i < s.length(); i++)
        cout << (int)input.find(s[i]) << " ";
    
}