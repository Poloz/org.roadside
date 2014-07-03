// worktime.cpp.  Alex Baranov
// Time schedule analys.

#include <fstream>
#include <string>
#include <iostream>
#include <vector>
using namespace std;

int main(){

	ifstream datain;
	char list [][][];
	string a;
	datain.open("data.csv");
	if (datain.is_open())
	{
		while(datain.good())
		{
			getline(datain,a);
			cout << a << endl;
			parse
		}
		datain.close();
	}
	else cout << "Sorry, cant read the file";
	return 0;
}
