public class QuickFindUF {


        private int []id;


        //set id f each object to itsself
        public QuickFindUF(int N){
            id=new int[N];
            for(int i=0;i<N;i++){
                id[i]=i;
            }
        }


        //check whether p and q  are in the same component
        public boolean connected(int p,int q){
            return  id[p]==id[q];

        }


        //change all pid to qid
        public void union(int p,int q){

            int pid=id[p];
            int qid=id[q];

            for(int i=0;i<id.length;i++){
                if(id[i]==pid)id[i]=qid;
            }

        }







}
