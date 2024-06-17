#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    //Using the formula A = P(1+i)^n + 5000 and declaring it's variables.
    double theBalance;                                                 //Final amount, A
    double principalAmount;                                            //Initial amount, P
    double interestRate;                                               //Annual interest rate, i
    int numberMonths;                                                  //Number of times the interest is compounded per year, n

    cout << "Enter the initial amount (negative number to exit): R";
    cin >> principalAmount;
    cout << endl;

    while(principalAmount > 0)
    {
        cout << "Enter the price of the house: R";
        cin >> theBalance;
        cout << endl;
        cout << "Enter the rate: ";
        cin >> interestRate;
        cout << endl;
        interestRate /= 100;

        //Make number of months (n) subject of the formula:
        //A = P(1+i)^n + 5000
        //n = log10((A-5000) / P) / log10(1+i)
        numberMonths = log10((theBalance - 5000) / principalAmount) / log10(1 + interestRate);

        cout << "\nPrice of the house: R" << theBalance << endl;
        cout << "Initial deposit: R" << principalAmount << endl;
        cout << "Interest rate: " << interestRate << endl;
        cout << "Number of years it is going to take: " << numberMonths << " year(s)" << endl;

        cout << "\nThe initial amount (negative number to exit): R";
        cin >> principalAmount;
        cout << endl;
    }

    return 0;
}
