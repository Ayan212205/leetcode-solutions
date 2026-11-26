class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        boolean alice=true;
        while(n>=i){
            n-=i;
            i--;
            if(alice==true){
                alice=false;
            }else{
                alice=true;
            }
        }
        return !alice;
    }
}