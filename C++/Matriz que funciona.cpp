#include <iostream>
using namespace std;

int main() {
	int w;
	cin >> w;
	int  A[w][w], B[w][w], l, c, C[w][w], k;
	
	for (l=0; l<w; l++)
	for (c=0; c<w; c++)
	    cin >> A[l][c];
	for (l=0; l<w; l++){
	for (c=0; c<w; c++)
	    cout << A[l][c] << " ";
	    cout << endl;
	}
	for (l=0; l<w; l++)
	for (c=0; c<w; c++)
	    cin >> B[l][c];
	    cout << endl;
	for (l=0; l<w; l++){
	for (c=0; c<w; c++)
	    cout << B[l][c] << " ";
	    cout << endl;
	}
	cout << endl;
	for (l=0; l<w; l++){
	 for (c=0; c<w; c++){
	 C[l][c]=0;
	 for (k=0; k<w; k++)
	    C[l][c] = C[l][c] + A[l][k] * B[k][c];
	 }
	}
    for (l=0; l<w; l++){
    for (c=0; c<w; c++)
	    cout << C[l][c] << " ";
	    cout << endl;
    }
    
    
	return 0;
}
