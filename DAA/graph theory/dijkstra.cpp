#define SIZE 100000 + 1

vector < pair < int , int > > v [SIZE];  
int dist [SIZE];
bool vis [SIZE];

void dijkstra(){
                                                
    memset(vis, false , sizeof vis);           
    dist[1] = 0;
    multiset < pair < int , int > > s;        

    s.insert({0 , 1});                        

    while(!s.empty()){

        pair <int , int> p = *s.begin();       
        s.erase(s.begin());

        int x = p.s; int wei = p.f;
        if( vis[x] ) continue;                  
         vis[x] = true;

        for(int i = 0; i < v[x].size(); i++){
            int e = v[x][i].f; int w = v[x][i].s;
            if(dist[x] + w < dist[e]  ){            
                dist[e] = dist[x] + w;
                s.insert({dist[e],  e} );           
        }
    }
}
