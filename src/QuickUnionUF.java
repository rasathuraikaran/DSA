public class QuickUnionUF {
//less code than Quick find
    private int [] id;



    public QuickUnionUF(int N){
        id=new int[N];
        //set id of each object itsself
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }

//choose the parent pointer until reach parent rooot
    private int root(int i){
        while(i!=id[i]){

            i=id[i];

        }
        return i;
    }

//check if p and q are same root
    public boolean connected(int p,int q){
        return root(p)==root(q);
    }


    //change the root of p o point of q

    public void union(int p,int q){
        int i=root(p);
        int j=root(q);
        id[i]=j;
    }
}
