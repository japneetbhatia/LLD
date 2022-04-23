#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
class Show1{

public:
    vector<string> show1 = {"A1", "A2", "A3", "A4", "A5", "A6", "A9"};//strings h
    void prints1(){
        cout<<"show1: "<<endl;
        for(int i=0;i<show1.size();i++){
            cout<<show1[i]<<" ";
        }
        cout<<endl;

    }
};
class Show2{
public:
    vector<string> show2 = {"A1", "A2", "A4", "A5", "A6", "B1", "B3","B4", "B5", "B6", "B7"};
    void prints2(){
        cout<<"show2: "<<endl;
        for(int i=0;i<show2.size();i++){
            cout<<show2[i]<<" ";
        }
        cout<<endl;
    }
};

class theator:public Show1 , public Show2{
    int show_no,no;
    string s;
    vector<string> seat_no;
public:
    Show1 s1;
    Show2 s2;
    void get(){
        cout<<"Enter show no:";
        cin>>show_no;
        cout<<"no. of seats required";
        cin>>no;
        for(int i=0;i<no;i++){
            cin>>s;
            seat_no.push_back(s);
        }
    }
    void calculate(){
        bool flag1 = 0;
        bool flag2 = 0;
        if(show_no == 1){
            for(int i=0;i<no;i++){
                auto it = find(s1.show1.begin(),s1.show1.end(),seat_no[i]);
                int idx = it-s1.show1.begin();
                if(it!=s1.show1.end()){
                    flag1 = 1;
                    s1.show1.erase(it);
                }
            }
        }
      if(show_no == 2){
            for(int i=0;i<no;i++){
                auto it = find(s2.show2.begin(),s2.show2.end(),seat_no[i]);
                int idx = it-s2.show2.begin();
                if(it!=s1.show1.end()){
                    flag2 = 1;
                    s2.show2.erase(it);
                }
            }
        }
        if(flag1){
            cout<<"successfully booked"<<endl;
            cout<<"remaining seats"<<endl;
            s1.prints1();
            cout<<"booked seats";
            cout<<endl;
            for(int i=0;i<no;i++){
                cout<<seat_no[i]<<" ";
            }
        }
        if(flag2){
            cout<<"successfully booked"<<endl;
            cout<<"remaining seats"<<endl;
            s2.prints2();
            cout<<"booked seats";
            cout<<endl;
            for(int i=0;i<no;i++){
                cout<<seat_no[i]<<" ";
            }
        }
    }
};

int main(){
    Show1 sh1;
    sh1.prints1();
    Show2 sh2;
    sh2.prints2();
    theator t;
    t.get();
    t.calculate();
return 0;
}
