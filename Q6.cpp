#include <iostream>
using namespace std;
int main(){
int anoatual,nascimento,voto;
cout<<"Digite em que ano estamos:";
cin>>anoatual;
cout<<"Digite o ano em que nasceu:";
cin>>nascimento;
voto=(anoatual-nascimento);
if(voto>=16){
    cout<<"Você já pode votar"<<endl;
}else{
    cout<<"Você não pode votar ainda, ";
    cout<<"faltam "<<16-(anoatual-nascimento)<<" anos para que você possa votar"<<endl;
}

    return 0;
}