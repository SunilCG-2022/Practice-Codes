#include<stdio.h>
#include<iostream>

using namespace std;

int main(){
	
	int n;
	cout<<"Enter a size: ";
	cin>>n;
	int A[n];
	A[0]=2;
	
	for(int x:A){
		cout<<x<<endl;
	}
}
